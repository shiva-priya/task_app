package taskPackage;

import com.priya.task;

import java.time.LocalDate;
import java.util.Scanner;

public class taskMain {

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        taskOperation taskObj =  new taskOperation();
        int option = -1;

        while(option!=5) {
            System.out.println("\n\nChoose Option for the Task App: \n");
            System.out.println("1. Add Task ");
            System.out.println("2. List Tasks ");
            System.out.println("3. Search by Task Name");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit Menu");

            option = scanner.nextInt();
            switch (option) {
                case 1: {
                    System.out.println("Enter Task Name : ");
                    String name = scanner.next();
                    scanner.nextLine();
                    System.out.println("Enter Task Description : ");
                    String description = scanner.nextLine();
                    System.out.println("Enter Due Date : ");
                    String due = scanner.nextLine();
                    LocalDate date = LocalDate.parse(due);
                    //System.out.println(name+" "+description+" "+due);
                    System.out.println("Enter Task Status (INITIAL, IN_PROGRESS, DONE) : ");
                    String st = scanner.nextLine();
                    taskStatus status = taskStatus.valueOf(st);
                    //System.out.println(status);
                    taskObj.addTask(name,description,date,status);
                    break;
                }

                case 2:
                {
                    System.out.println("List of Task are as follows : ");
                    taskObj.listTasks();
                    break;
                }

                case 3:
                {
                    System.out.println("Enter Task Name to Search");
                    String searchName = scanner.next();
                    //System.out.println(searchName);
                    taskObj.searchTask(searchName);
                    break;
                }

                case 4:
                {
                    System.out.println("\nEnter Task Name to Delete");
                    String delName = scanner.next();
                    // System.out.println(delName);
                    taskObj.deleteTask(delName);
                    break;
                }

                case 5: {
                    System.out.println("Exiting Menu");
                    System.exit(0);
                    break;
                }

                default:
                {
                    System.out.println("!!!  WRONG OPTION   !!!\nEnter Correct Option Again");
                }
            }
        }
    }
}
