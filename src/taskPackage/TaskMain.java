package taskPackage;

import java.time.LocalDate;
import java.util.Scanner;

public class TaskMain {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        TaskManager manager = new TaskManager();
        int option = -1;

        while (option != 6) {
            System.out.println("\n\nChoose Option for the Task App: \n");
            System.out.println("1. Add Task ");
            System.out.println("2. List Tasks ");
            System.out.println("3. Search by Task Name");
            System.out.println("4. Delete Task");
            System.out.println("5. Search by ID ");
            System.out.println("6. Exit Menu");

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
                    System.out.println("Enter Task Status (INITIAL, IN_PROGRESS, DONE) : ");
                    String st = scanner.nextLine();
                    TaskStatus status = TaskStatus.valueOf(st);
                    manager.addTask(name, description, date, status);
                    break;
                }

                case 2: {
                    System.out.println("List of Task are as follows : ");
                    String object = manager.listTasks();
                    System.out.println(object);
                    break;
                }

                case 3: {
                    System.out.println("Enter Task Name to Search");
                    String searchName = scanner.next();
                    TaskBody object = manager.searchTask(searchName);
                    if (object == null)
                        System.out.println("!!!   NO SUCH DATA FOUND   !!!");
                    else
                        System.out.println(object);
                    break;
                }

                case 4: {
                    System.out.println("\nEnter Task Name to Delete");
                    String delName = scanner.next();
                    int result = manager.deleteTask(delName);
                    if (result == 1) {
                        System.out.println("Deleted");
                    } else
                        System.out.println("!!! NO SUCH DATA FOUND !!! ");
                    break;
                }

                case 5: {
                    System.out.println("Enter Task ID to Search");
                    int searchId = scanner.nextInt();
                    TaskBody object = manager.searchTaskByID(searchId);
                    if (object == null)
                        System.out.println("!!!   NO SUCH DATA FOUND   !!!");
                    else
                        System.out.println(object);
                    break;
                }

                case 6: {
                    System.out.println("Exiting Menu");
                    System.exit(0);
                    break;
                }

                default: {
                    System.out.println("!!!  WRONG OPTION   !!!\nEnter Correct Option Again");
                    break;
                }
            }
        }
    }
}
