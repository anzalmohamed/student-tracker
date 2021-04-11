//Make program that asks for a number and then tells whether it has two digits. Hint: a number has two digits if it is between 10 and 99.
import java.io.Console;
public class Digits {
    public static void main(String[] args) {
        Console console = System.console();
        System.out.println("Write a number?");
        String inputtedNumber = console.readLine(); 
        Integer integerUserInput = Integer.parseInt(inputtedNumber);

        if (integerUserInput.length>=2){
            System.out.println("your number has 2 digits");
        }else{
            System.out.println(integerUserInput);
        }
}
}
//https://www.jetbrains.com/help/idea/debugging-your-first-java-application.html#setting-breakpoint  for debugging this file