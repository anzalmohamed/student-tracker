// Create an application that estimates shipping cost for a user. You will need to calculate weight, distance and a pricing modifier. Your formula might look something like: 
//( packageWeight / 10 ) + ( distanceToTravel / 5 ) * priceModifier.


import java.io.Console;

    public class ShippingCost {
      public static void main(String[] args) {
       vitalDetails("packageWeight");
       vitalDetails("distance");
       vitalDetails("priceModifier");
       

      }

      public static void vitalDetails(String detail) {
        Console myConsole = System.console();
        System.out.println("What is your " + detail + "?");
        String yourCost = myConsole.readLine();
        System.out.println("Your shipping cost is " + yourCost + ".");
      }
    }

