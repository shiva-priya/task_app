package taskPackage;

import java.time.LocalDate;

public class Task {

    private String taskName;
    private String description;
    private LocalDate dueDate;
    private TaskStatus status;
    private int id;

    Task(String taskName, String description, LocalDate dueDate, TaskStatus status, int id) {
        this.taskName = taskName;
        this.description = description;
        this.dueDate = dueDate;
        this.status = status;
        this.id = id;
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

    public int getId() {
        return id;
    }


    public String toString() {
        String result = "\nTask ID :" + id + "\nTask Name :" + taskName + "\nTask Description :" + "\nTask Due Date : " +
                dueDate + "\nTask Status : " + status + "\n";
        return result;
    }


}
