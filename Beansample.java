/*Create a Java program to use the Java Bean: Now, create another Java source file named Main.java in the same directory.*/
// Beansample.java
import pack.Person1;
public class Beansample {
    public static void main(String[] args) {
        // Creating an instance of Person
        Person1 person = new Person1();
        
        // Setting attributes
        person.setName("Bhanu Chandar");
        person.setAge(21);
        
        // Getting attributes
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
/*Explanation:

This class Samplebeas contains the main method where we create an instance of the Person class, set its attributes, and then retrieve and print them.
Save the file: Save the file as Samplebean.java.

Compile the Samplebean class: Compile Samplebean.java using the javac command.*/
