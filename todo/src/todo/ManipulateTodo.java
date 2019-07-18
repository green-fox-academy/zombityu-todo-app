package todo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ManipulateTodo {


  public static void addTodo(String todo, List<String> todolist, Path filePath){
    todolist.add("[ ] "+todo);

    try {
      Files.write(filePath,todolist);
    } catch (IOException e) {
      System.out.println("Error");
    }
  }

  public static void removeFromlist(String element,List<String> todoList,Path filePath ){


    try {
      if (todoList.size() > Integer.parseInt(element)) {
        todoList.remove(Integer.parseInt(element)-1);
        Files.write(filePath, todoList);
      } else {
        System.out.println("Unable to remove: index is out of bound");
      }
    } catch (IOException e) {
      System.out.println("Unable to remove: index is not a number");
    }
  }
}
