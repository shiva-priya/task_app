package taskPackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.nashorn.internal.parser.JSONParser;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.*;

public class TaskFileRepository implements TaskRepository {

    private static final String TASKS_JSON_FILE = "/home/priyad/Desktop/tasks2.json";

    private ObjectMapper objectMapper = new ObjectMapper();

    List<Task> taskData;


    public TaskFileRepository() {
        taskData = readFromFile();
    }

    private void writeToFile(List<Task> tasks) {
        try {
            objectMapper.writerWithDefaultPrettyPrinter()
                    .writeValue(new FileWriter(TASKS_JSON_FILE), tasks);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    private List<Task> readFromFile() {
        final File file = new File(TASKS_JSON_FILE);
        if (file.exists()) {
            try {
                return objectMapper.readValue(file, TaskList.class);
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        } else {
            return new ArrayList<>();

        }
    }


    @Override
    public void addTask(String taskName, String description, String dueDate, TaskStatus status,int id) {
        taskData.add(new Task(taskName, description, dueDate, status, id));
        writeToFile(taskData);

    }

    @Override
    public List<Task> listTasks() {
        taskData = readFromFile();
        /*for (Task t:taskData) {
            System.out.println(t);
        }*/
        return taskData;
    }

    @Override
    public Task searchTask(String key)
    {
        taskData = readFromFile();
        Task object = null;
        for (Task t: taskData) {
            if(t.getTaskName().equals(key))
            {
                object = t;
            }
        }
       return object;
    }

    @Override
    public Task searchByTaskID(int key) {
        taskData = readFromFile();
        Task object = null;
        for (Task t: taskData) {
            if(t.getId() == key)
            {
                object = t;
            }
        }
        return object;
    }

    @Override
    public List<Task> listByStatus(String status) {
        taskData = readFromFile();
        List<Task> statusList = new LinkedList<>();
        for (Task t : taskData) {
            if (t.getStatus().toString().equals(status)) {
                statusList.add(t);
            }
        }
        return statusList;
    }

    @Override
    public int deleteTask(String name) {
        int flag = 0;
        taskData = readFromFile();
        Task object = null;
        for (Task t: taskData) {
            if(t.getTaskName().equals(name))
            {
                taskData.remove(t);
                //System.out.println(taskData);
                flag=1;
                break;
            }
        }
        writeToFile(taskData);
        return flag;
    }


}
