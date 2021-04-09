public class GroceryListFor {
    public static void main(String[] args) {
      String[] myGroceryList = { "eggs", "milk", "bread", "bananas", "cereal", "rice" };

      for ( Integer index = 0 ; index < myGroceryList.length ; index++ ) {
        System.out.println( myGroceryList[index] );
      }
    }
  }