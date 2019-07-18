package todo;

public class TodoUsage {

  public static void info() {
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
