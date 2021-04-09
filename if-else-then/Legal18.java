
import java.io.Console;

public class Legal18 {
    public static void main(String[] args) {
        Console console = System.console();
        System.out.println("What's your age?");
        String userAge = console.readLine(); 
        Integer integerUserAge = Integer.parseInt(userAge);

        if ( integerUserAge >=18 ) {
            System.out.println("You can Have a beer!");
          } else {
            System.out.println("Go home kid:(");
          }
        }
      }   

