import Controller.TaskController;
import Model.TaskList;
import View.TaskView;

public static void main(String[] args) {
            TaskList model = new TaskList();
            TaskView view = new TaskView();
            TaskController controller = new TaskController(model, view);
            controller.run();
}

