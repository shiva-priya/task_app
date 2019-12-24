package taskPackage;

import java.time.LocalDate;

public class TaskBody {

    private String taskName;
    private String description;
    private LocalDate dueDate;
    private TaskStatus status;
    private int id;
    private static int taskCount = 1;


    TaskBody(String taskName, String description, LocalDate dueDate, TaskStatus status) {
        this.taskName = taskName;
        this.description = description;
        this.dueDate = dueDate;
        this.status = status;
        this.id = taskCount++;
    }


    public String getTaskName() {
        return taskName;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public int getId()
    {
        return id;
    }

    public String toString() {
        String result = "Task ID :"+id+"\nTask Name :" + taskName + "\nTask Description :" + "\nTask Due Date : " +
                dueDate + "\nTask Status : " + status + "\n\n";
        return result;
    }


}
