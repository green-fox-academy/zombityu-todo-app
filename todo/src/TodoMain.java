import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TodoMain {
  public static void main(String[] args) {

    if (args.length == 0){
      info();

    } else if (args[0].equals("-l")){
      fileReader();
    }

    }

  private static void fileReader() {
    Path filePath = Paths.get("D:\\GreenFox\\zombityu-todo-app\\todo\\todoList.txt");
    List <String> todoList = new ArrayList<>();

    try {
      todoList = Files.readAllLines(filePath);

    } catch (IOException e) {
      System.out.println("Error");
    }

    if (todoList.size() == 0){
      System.out.println(" No todos for today! :) ");
    }else {
      for (int i = 0; i <todoList.size() ; i++) {
        System.out.println(i + 1 + " - " + todoList.get(i));
    }
    }

  }

  private static void info() {
    String line = "Command Line TodoMain application";
      System.out.println(line);
      for (int i = 0; i <line.length(); i++) {
        System.out.print("=");
      }
      System.out.println();
      System.out.println("\nCommand line arguments:");
      System.out.println("\t-l\tLists all the tasks\n\t-a\tAdds a new task\n\t-r\tRemoves an task\n\t-c\tCompletes an task");
    System.out.println();
  }






}
