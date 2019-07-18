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
    Path filePath = Paths.get("D:\\GreenFox\\zombityu-todo-app\\todo\\src\\todo\\todoList.txt");
    List<String> todoList = fileManage.fileReader(filePath);

    if (args.length == 0){
      usage.info();

    } else if (args[0].equals("-l")){
      fileManage.todoPrintOut(todoList);

    }else if (args[0].equals("-a") && args.length==2){
      fileManage.addTodo(args[1],todoList,filePath);
    }else{
      System.out.println("Unable to add: no task provided");
    }

    }
}
