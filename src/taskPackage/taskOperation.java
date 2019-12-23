package taskPackage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class taskOperation {

    List<taskClass> taskData = new LinkedList<>();

    public void addTask(String taskName, String description, LocalDate dueDate, taskStatus status)
    {
        taskData.add(new taskClass(taskName, description, dueDate,status));
    }

    public void listTasks()
    {
        Iterator<taskClass> dataIterator = taskData.iterator();
        while(dataIterator.hasNext())
        {
            taskClass obj = dataIterator.next();
            System.out.println("\nTask Name : "+obj.getTaskName());
            System.out.println("Description : "+obj.getDescription());
            System.out.println("Due Date : "+obj.getDueDate());
            System.out.println("Status : "+obj.getStatus()+"\n");

        }
    }

    public void searchTask(String key)
    {
        int flag=0;
        Iterator<taskClass> dataIterator = taskData.iterator();
        while(dataIterator.hasNext()) {
            taskClass obj = dataIterator.next();
            String name = obj.getTaskName();
            //System.out.println(name);
            //System.out.println(key);
            if(name.equals(key))
            {
                System.out.println("Found Data for  "+key);
                System.out.println("Description : "+obj.getDescription());
                System.out.println("Due Date : "+obj.getDueDate());
                System.out.println("Status : "+obj.getStatus()+"\n");
                flag=1;
            }

        }
        if(flag==0)
            System.out.println("!!! NO SUCH DATA FOUND !!!");
    }

    public void deleteTask(String name)
    {
        int flag=0;
        Iterator<taskClass> dataIterator = taskData.iterator();
        while(dataIterator.hasNext()) {
            taskClass obj = dataIterator.next();
            String tname = obj.getTaskName();
            if(name.equals(tname))
            {
                taskData.remove(obj);
                flag=1;
            }

        }
        if(flag==0)
        {
            System.out.println("!!! NO SUCH DATA FOUND !!!");
        }
        else
        System.out.println("Deleted Task");
    }



}
