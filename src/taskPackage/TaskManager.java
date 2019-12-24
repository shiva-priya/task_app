package taskPackage;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TaskManager {

    List<TaskBody> taskData = new LinkedList<>();

    public void addTask(String taskName, String description, LocalDate dueDate, TaskStatus status) {
        taskData.add(new TaskBody(taskName, description, dueDate, status));
    }

    public String listTasks() {
        Iterator<TaskBody> dataIterator = taskData.iterator();
        TaskBody object = null;
        String result = "";
        while (dataIterator.hasNext()) {
            object = dataIterator.next();
            result += object;
        }
        return result;
    }

    public TaskBody searchTask(String key) {
        TaskBody object = null;
        Iterator<TaskBody> dataIterator = taskData.iterator();
        while (dataIterator.hasNext()) {
            object = dataIterator.next();
            String name = object.getTaskName();
            if (name.equals(key)) {
                return object;
            }
        }
        return object;
    }

    public TaskBody searchTaskByID(int key) {
        TaskBody object = null;
        Iterator<TaskBody> dataIterator = taskData.iterator();
        while (dataIterator.hasNext()) {
            object = dataIterator.next();
            int id = object.getId();
            if (id==key) {
                return object;
            }
        }
        return object;
    }

    public int deleteTask(String name) {
        int flag = 0;
        Iterator<TaskBody> dataIterator = taskData.iterator();
        while (dataIterator.hasNext()) {
            TaskBody obj = dataIterator.next();
            String tname = obj.getTaskName();
            if (name.equals(tname)) {
                taskData.remove(obj);
                flag = 1;
            }
        }
        return flag;
    }


}
