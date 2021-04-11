
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;

// ///Example One
// public class App{
// public static void main(String args[]) {
//     // new Date object
//     Date newDate = new Date();
//     // display time and date using toString()
//     System.out.println(newDate.toString());
//   }
// }


// // Example Two
// import java.text.SimpleDateFormat;
// public class App{
// public static void main(String args[]) {
//   Date secondDate = new Date();
//   SimpleDateFormat sdf = new SimpleDateFormat ("E, MMMM d 'at' hh:mm a"); //formatter pattern
//   System.out.println("Current Date: " + sdf.format(secondDate)); //apply pattern to data
// }
// }

// Example Three

//Making Dates from Strings


// import java.text.SimpleDateFormat;
// public class App{
// public static void main(String args[]) {

//   String startDateString = "07/7/2017";
//   DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
//   Date startDate;
//   try {
//     startDate = df.parse(startDateString);
//     SimpleDateFormat ft = new SimpleDateFormat ("E, MMMM d"); //formatter pattern
//     System.out.println("Date that was formerly a String, formatted: " + ft.format(startDate));
//   } catch (ParseException e) {
//     e.printStackTrace();
//   }
// }
// }


//Comparing Dates

 //Example Four

import java.text.SimpleDateFormat;
public class App{
public static void main(String args[]) {

  String earlierDateString = "07/7/2015";
  DateFormat nextdf = new SimpleDateFormat("MM/dd/yyyy");
  Date earlierDate = new Date();

  try {
    earlierDate = nextdf.parse(earlierDateString); //overwrite date we had to initialize above
  } catch (ParseException e) {
    e.printStackTrace();
  }
  Date currentDate = new Date();
  boolean isTodayAfterEarlierDate = earlierDate.after(currentDate);
  System.out.println("Earlier date is after current date: " + isTodayAfterEarlierDate);
}
}
