public class App{
    public static void main(String args[]) {
        
        Integer[] numbers = {1, 2};
        String[] letters = {"a", "b"};
        
        for (Integer number : numbers) {
          for (String letter : letters) {
            System.out.println(number + letter);
          }
        }
    }
}

/*using jshell for output here
String myName = "Jamie";
String sentenceOne = "Hi, my name is " + myName + ". Nice to meet you.";
      
jshell>  String myName = "Jamie";
myName ==> "Jamie"

jshell> String sentenceOne = "Hi, my name is " + myName + ". Nice to meet you.";
sentenceOne ==> "Hi, my name is Jamie. Nice to meet you."
  
   concatenating with the .format() method
  
  
  As we saw in the example above, we use the %s format specifier to concatenate a string into a formatted string:

> String sentenceWithString = String.format("Hi, my name is %s. Nice to meet you", "Jamie");

java.lang.String sentenceWithString = "Hi, my name is Jamie. Nice to meet you"
Integer
If you want to use an integer you would use %d as your format specifier:

> String sentenceWithInteger = String.format("I brush my teeth %d times a day", 2);

java.lang.String sentenceWithInteger = "I brush my teeth 2 times a day"

Character
Likewise, %c represents a single character. You could use it as your symbol to concatenate a char into a String like this:

> String sentenceWithChar = String.format("My name begins with the letter %c", 'e');

java.lang.String sentenceWithChar = "My name begins with the letter e"
Remember, char types must be surrounded with single quotations!

Floating Point Numbers
We could concatenate a floating point number (ie: Essentially a number with a decimal place in it) with %flike this:

> String sentenceWithFloat = String.format("The value of pi is %f", 3.14);

java.lang.String sentenceWithFloat = "The value of pi is 3.140000"

Concatenating Multiple Values
You can add use multiple format specifiers in a single formatted string. For instance:

> String myName = "Jamie";
> String otherName = "Cameron";
> String sentenceWithTwoStrings = String.format("Hello, %s. Nice to meet you, too. My name is %s", myName, otherName);

java.lang.String sentenceWithTwoStrings = "Hello, Jamie. Nice to meet you, too. My name is Cameron"
As you can see, when you use multiple format specifiers in a formatted string, the provided arguments are evaluated from left to right. In the example above, the first %s is replaced by the first argument after the formatted string, myName. Then, the second %s is replaced with the next argument provided: otherName.

You can even use format specifiers of different types:

> String sentenceWithStringAndInteger = String.format("Hello, %s. Nice to meet you, too. Did you know I brush my teeth %d number of times a day?", "Test Name", 2);

java.lang.String sentenceWithStringAndInteger = "Hello, Test Name. Nice to meet you, too. Did you know I brush my teeth 2 number of times a day?"

  
  
  
  
  
  
  */