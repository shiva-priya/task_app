package taskPackage;

import java.time.LocalDate;

public class taskClass {

    private String taskName;
    private String description;
    private LocalDate dueDate;
    private taskStatus status;



    taskClass(String taskName, String description, LocalDate dueDate, taskStatus status)
    {
        this.taskName=taskName;
        this.description=description;
        this.dueDate=dueDate;
        this.status=status;
    }


    public String getTaskName()
    {
        return taskName;
    }

    public String getDescription()
    {
        return description;
    }

    public LocalDate getDueDate()
    {
        return dueDate;
    }

    public taskStatus getStatus()
    {
        return status;
    }

}
