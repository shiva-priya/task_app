package taskPackage;

import java.time.LocalDate;
import java.util.List;

public interface TaskRepository {

    public void addTask(String taskName, String description, String dueDate, TaskStatus status,int id);
    public List<Task> listTasks();
    public Task searchTask(String key);
    public Task searchByTaskID(int key);
    public List<Task> listByStatus(String status);
    public int deleteTask(String name);

}
