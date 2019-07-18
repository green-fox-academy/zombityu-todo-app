package todo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TodoFileReader {




  public static List<String> fileReader(Path filePath) {
    List<String> todoList = new ArrayList<>();

    try {
      todoList = Files.readAllLines(filePath);

    } catch (IOException e) {
      System.out.println("Error");
    }
    return todoList;

  }

  public static void todoPrintOut(List<String> todoList){

    if (todoList.size() == 0){
      System.out.println(" No todos for today! :) ");
    }else {
      for (int i = 0; i <todoList.size() ; i++) {
        System.out.println(i + 1 + " - " + todoList.get(i));
      }
    }
  }

  public static void addTodo(String todo, List<String> todolist,Path filePath){
      todolist.add(todo);

    try {
      Files.write(filePath,todolist);
    } catch (IOException e) {
      System.out.println("Error");
    }

  }
}
