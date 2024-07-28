package Controller;

import Model.Task;
import Model.TaskList;
import View.TaskView;

import java.util.Scanner;

public class TaskController {
    private TaskList model;
    private TaskView view;
    private Scanner scanner;

    public TaskController(TaskList model, TaskView view) {
        this.model = model;
        this.view = view;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        boolean running = true;
        while (running) {
            view.displayTasks(model.getTasks());
            System.out.println("\nMenu:");
            System.out.println("1. Add task");
            System.out.println("2. Remove task");
            System.out.println("3. Toggle task completion");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    removeTask();
                    break;
                case 3:
                    toggleTaskCompletion();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addTask() {
        System.out.print("Enter task title: ");
        String title = scanner.nextLine();
        Task task = new Task(title);
        model.addTask(task);
        view.showAddTaskMessage(task);
    }

    private void removeTask() {
        System.out.print("Enter task index to remove: ");
        int index = scanner.nextInt() - 1;
        model.removeTask(index);
        view.showRemoveTaskMessage(index);
    }

    private void toggleTaskCompletion() {
        System.out.print("Enter task index to toggle completion: ");
        int index = scanner.nextInt() - 1;
        model.toggleTaskCompletion(index);
        view.showToggleTaskCompletionMessage(index);
    }
}
