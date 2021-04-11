//Create a class for animals available for adoption at a local shelter. Give the class relevant properties, such as age or species. Practice writing the class declaration and get familiar with how to use it. Also, make sure to save your work! The next few practice exercises in this section will build upon this exercise.

//Create a command line interface for the animal shelter application you've built over the past several practice exercises. Create several instances of your Animal class in the main() method of your command line interface file. Then, add code to print all details about every animal back to the user.
//Add at least one method to your Animal class from the last several exercises. It should return information based on several attributes of your Animal objects. For instance, an insidePet()method could return whether or not an adoptable animal would be recommended to live inside based on its species, size, or whatever other attributes your class contains. Then, add it to your command line application.

// Create a constructor for the Animal class of the animal shelter application you've been working on throughout the previous several practice exercises. Refactor your command line interface to create Animals with your new constructor.

// Add an attribute to your Animal class called mAdopted. This attribute should be a booleantype, and should indicate whether an animal has found a home yet, or is still in the shelter. Write a method that changes the mAdopted attribute of an animal from false to true.


//Using the previous two lessons as a guide, add an option to your animal shelter application that allows users to either create a new Animal, see all Animals, or search for only un-adopted, and/or onlypets that live indoors (using the insidePet() method you created in the bjeicts and methods pet exercise.)

// When gathering user input, make sure to compare strings using equals() instead of ==.

// Implement a while loop to keep your program up and running until the user opts to exit.

// Once your application allows users to select multiple options, consider whether you can refactor this code. Is there redundant code here? Could anything be refactored into a method?

public class Animals {
    public String mSpeices;
}
