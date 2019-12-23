package com.priya;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class task {

    LinkedHashMap<String,String> data = new LinkedHashMap<>();

    public void addTask(String taskName, String description)
    {
        data.put(taskName,description);
        System.out.println("  --->  Entered New Task " + taskName);
    }

    public void listTasks()
    {
        Iterator dataIterator = data.entrySet().iterator();
        while(dataIterator.hasNext())
        {
            System.out.println(dataIterator.next());
        }
    }

    public void searchTask(String key)
    {
        String value = data.get(key);
        if(value==null)
        {
            System.out.println("\n!!! NO TASK WITH THAT NAME !!!\n");
        }
        else
        System.out.println(value);
    }

    public void deleteTask(String name)
    {
        data.remove(name);
        System.out.println("Deleted Task");
    }



}


































