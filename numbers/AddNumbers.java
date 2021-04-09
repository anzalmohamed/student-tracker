import java.io.Console;
public class AddNumbers {
    public static void main(String[] args) {
        Console myConsole = System.console();
        System.out.println("Give me two numbers, and I will add them for you!");
        String stringNumberOne = myConsole.readLine();
        String stringNumberTwo = myConsole.readLine();
        Integer yourNumberOne = Integer.parseInt(stringNumberOne);
        Integer yourNumberTwo = Integer.parseInt(stringNumberTwo);
          Integer yourAddedNumber = yourNumberOne + yourNumberTwo;
        
          System.out.println("I added your numbers for you, their sum is: " + yourAddedNumber);
              
}
}
