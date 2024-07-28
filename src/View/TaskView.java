package View;
import Model.Task;

import java.util.List;

public class TaskView {
    public void displayTasks(List<Task> tasks) {
        System.out.println("To-Do List:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public void showAddTaskMessage(Task task) {
        System.out.println("Added: " + task.getTitle());
    }

    public void showRemoveTaskMessage(int index) {
        System.out.println("Removed task at index " + (index + 1));
    }

    public void showToggleTaskCompletionMessage(int index) {
        System.out.println("Toggled completion status of task at index " + (index + 1));
    }
}
