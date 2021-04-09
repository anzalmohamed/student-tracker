import java.io.Console;
public class Noun {
    public static void main(String[] args) {
        Console myConsole = System.console();
      System.out.println("Give me a noun.");
      String sentenceString = myConsole.readLine();
      System.out.println( sentenceString + " is a noun");
    }
  }

