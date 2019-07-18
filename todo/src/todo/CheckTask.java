package todo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CheckTask {

    public static void checkTheElement(String element, List<String> todoList, Path filePath ) {

      try {
        if (todoList.size() > Integer.parseInt(element)-1){
          todoList.set(Integer.parseInt(element)-1,"[x] "+todoList.get(Integer.parseInt(element)-1).substring(4));
          Files.write(filePath,todoList);
        } else {
          System.out.println("Unable to check: index is out of bound");
        }
      } catch (IOException e){
        System.out.println("Unable to check: index is not a number");
      }

    }
}
