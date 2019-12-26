package taskPackage;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TaskManager {

 //  InMemoryTaskRepository inMemory = new InMemoryTaskRepository();
    TaskFileRepository repository = new TaskFileRepository();
    static int taskCount = 0;

    public void addTask(String taskName, String description, String dueDate, TaskStatus status) {
        repository.addTask(taskName, description, dueDate, status, ++taskCount);
    }

    public List<Task> listTasks() {
        return repository.listTasks();
    }

    public Task searchTask(String key) {
       return repository.searchTask(key);
    }

    public Task searchByTaskID(int key) {
        return repository.searchByTaskID(key);
    }


    public List<Task> listByStatus(String status) {
        return repository.listByStatus(status);
    }

    public int deleteTask(String name) {
      return repository.deleteTask(name);
    }

    public int getTaskCount() {
        return taskCount;
    }


}
