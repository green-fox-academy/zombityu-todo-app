import todo.CheckTask;
import todo.ManipulateTodo;
import todo.TodoFileReader;
import todo.TodoUsage;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class TodoMain {
  public static void main(String[] args) {
    TodoFileReader fileManage = new TodoFileReader();
    TodoUsage usage = new TodoUsage();
    ManipulateTodo modify = new ManipulateTodo();
    CheckTask check = new CheckTask();

    Path filePath = Paths.get("todoList.txt");
    List<String> todoList = fileManage.fileReader(filePath);

    if (args.length == 0) {
      usage.info();

    } else if (args[0].equals("-l")) {
      fileManage.todoPrintOut(todoList);

    } else if (args[0].equals("-a")) {
      if (args.length == 2) {
        modify.addTodo(args[1], todoList, filePath);
      } else {
        System.out.println("Unable to add: no task provided");
      }
    } else if (args[0].equals("-r")) {
      if (args.length == 2) {
        modify.removeFromlist(args[1], todoList, filePath);
      } else {
        System.out.println("Unable to remove: no index provided");
      }

    } else if (args[0].equals("-c")){
      if (args.length == 2) {
        check.checkTheElement(args[1], todoList, filePath);
      } else {
        System.out.println("Unable to check: no index provided");
      }

    } else {
      System.out.println("Unsupported argument");
    }
  }
}
