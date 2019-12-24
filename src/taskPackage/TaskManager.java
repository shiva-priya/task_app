package taskPackage;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TaskManager {

    List<Task> taskData = new LinkedList<>();
    int taskCount = 0;

    public void addTask(String taskName, String description, LocalDate dueDate, TaskStatus status) {
        taskData.add(new Task(taskName, description, dueDate, status, ++taskCount));
    }

    public List<Task> listTasks() {
        return taskData;
    }

    public Task searchTask(String key) {
        Task object = null;
        for (Task t : taskData) {
            if (t.getTaskName().equals(key)) {
                object = t;
            }
        }
        return object;
    }

    public Task searchByTaskID(int key) {
        Task object = null;
        for (Task t : taskData) {
            if (t.getId() == key) {
                object = t;
            }
        }
        return object;
    }

    public List<Task> listByStatus(String status) {
        List<Task> statusList = new LinkedList<>();
        for (Task t : taskData) {
            if (t.getStatus().toString().equals(status)) {
                statusList.add(t);
            }
        }
        return statusList;
    }

    public int deleteTask(String name) {
        int flag = 0;
        Iterator<Task> dataIterator = taskData.iterator();
        while (dataIterator.hasNext()) {
            Task obj = dataIterator.next();
            String tname = obj.getTaskName();
            if (name.equals(tname)) {
                taskData.remove(obj);
                flag = 1;
            }
        }
        return flag;
    }

    public int getTaskCount() {
        return taskCount;
    }


}
