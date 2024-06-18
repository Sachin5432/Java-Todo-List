package Todo_List;

import java.util.ArrayList;
import java.util.Scanner;

public class Todo_List {
    private ArrayList<String> tasks;

    public Todo_List() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Added task: " + task);
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to show.");
            return;
        }
        System.out.println("Tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public static void main(String[] args) {
        Todo_List myList = new Todo_List();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Task");
            System.out.println("2. List Tasks");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Enter a task to add: ");
                    String task = scanner.nextLine();
                    myList.addTask(task);
                    break;
                case 2:
                    myList.listTasks();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}