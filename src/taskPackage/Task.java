package taskPackage;

import java.time.LocalDate;

public class Task {

    private String taskName;
    private String description;
    private String dueDate;
    private TaskStatus status;
    private int id;

    public Task(){
    }



    Task(String taskName, String description, String dueDate, TaskStatus status, int id) {
        this.taskName = taskName;
        this.description = description;
        this.dueDate = dueDate;
        this.status = status;
        this.id = id;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getDescription() {
        return description;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        String result = "\nTask ID :" + id + "\nTask Name :" + taskName + "\nTask Description :" +description+ "\nTask Due Date : " +
                dueDate + "\nTask Status : " + status + "\n";
        return result;
    }


}
