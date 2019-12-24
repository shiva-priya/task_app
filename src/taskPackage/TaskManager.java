package taskPackage;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TaskManager {

   InMemoryTaskRepository inMemory = new InMemoryTaskRepository();
    int taskCount = 0;

    public void addTask(String taskName, String description, LocalDate dueDate, TaskStatus status) {
        inMemory.addTask(taskName, description, dueDate, status, ++taskCount);
    }

    public List<Task> listTasks() {
        return inMemory.listTasks();
    }

    public Task searchTask(String key) {
       return inMemory.searchTask(key);
    }

    public Task searchByTaskID(int key) {
        return inMemory.searchByTaskID(key);
    }

    public List<Task> listByStatus(String status) {
        return inMemory.listByStatus(status);
    }

    public int deleteTask(String name) {
      return inMemory.deleteTask(name);
    }

    public int getTaskCount() {
        return taskCount;
    }


}
