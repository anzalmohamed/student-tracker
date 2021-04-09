import java.io.Console;

    public class MealTime {
      public static void main(String[] args) {
        askWhatYouAteFor("breakfast");      
        askWhatYouAteFor("lunch");  
        askWhatYouAteFor("dinner");  
       
      }

      public static void askWhatYouAteFor(String meal) {
        Console myConsole = System.console();
        System.out.println("What did you eat for " + meal + "?");
        String yourMeal = myConsole.readLine();
        System.out.println("You had " + yourMeal + " for " + meal + ".");
      }
    }


    // Longer code
    // import java.io.Console;

    // public class MealTime {
    //   Console myConsole = System.console();

    //   public static void main(String[] args) {

    //     askWhatYouAteFor("breakfast");
    //     String yourBreakfast = myConsole.readLine();
    //     System.out.println("You had " + yourBreakfast + " for breakfast.");

    //     askWhatYouAteFor("lunch");
    //     String yourLunch = myConsole.readLine();
    //     System.out.println("You had " + yourLunch + " for lunch.");

    //     askWhatYouAteFor("dinner");
    //     String yourDinner = myConsole.readLine();
    //     System.out.println("You had " + yourDinner + " for dinner.");
    //   }

    //   public static void askWhatYouAteFor(String meal) {
    //     System.out.println("What did you eat for " + meal + "?");
    //   }
    // }
  