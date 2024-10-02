import java.util.Scanner;
public class Drills{

    public static void main(String[] args){

        // Declare 5 different data types with initial values
        int doggyInt = 2;
        double doggyDouble = 2.02021389;
        float doggyFloat = 2.02021389f;
        String doggyString = "doggy";
        char doggyChar = 'd';

        // A standard for loop printing a message three times
        for (int i = 0; i < 3; i++) {
            System.out.println("DOGGY " + (i + 1));
        }

        // A for-each loop traversing a String[array]
        String[] doggyNames = {"Bella", "Gracie", "Dog", "Andy"};
        System.out.println("BEST DOG NAMES:");
        for (String name : doggyNames) {
            System.out.println(name);
        }

        // An infinite loop
        for (int i = 0; i < 1; i++) {
            // Remove comment below to activate infinite loop
            //i--;
            System.out.println("I like dogs");
        }

        // a short-circuit conditional with four tests
        int testNumber = 12;
        if (testNumber > 0 && testNumber % 2 == 0 && testNumber < 100 && testNumber % 10 != 0) {
            System.out.println("You passed the test!");
        }
        else System.out.println("Better luck next time");

        // Break a loop if a conditional passes
        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                System.out.println("I am going to say dog 7 times");
            }
            if (i == 7) {
                System.out.println("Ok I'm done now");
                break;
            }
            System.out.println("Dog");
        }

        // Loop through each char in a String
        String word = "dogdogwoof";
        for (int i = 0; i < word.length(); i++) {
            char thisChar = word.charAt(i);
            System.out.println(thisChar);
        }

        // Print only the first three letters in “word”
        String anotherWord = "woofdogdogdog";
        System.out.println(anotherWord.substring(0, 3));

        // Print all the odd numbers from 1 - 100
        for (int i = 1; i < 100; i+=2) {
            System.out.println(i);
        }

        // Create a Scanner and take an input
        Scanner in = new Scanner(System.in);
        String statement = in.nextLine();
        System.out.println(statement);


        // Create a Scanner, take a number, and count down from that number to 0
        Scanner newIn = new Scanner(System.in);
        int startingNumber = newIn.nextInt();
        for(int i = startingNumber; i >= 0; i--) {
            if (i == 1) {
                System.out.println("T-minus " + i + " second");
            }
            else System.out.println("T-minus " + i + " seconds");
        }

        System.out.println(addition(1, 2));
    }

    // Create a method that returns a comparison (include a JavaDoc comment)
    /**
     * Adds together two integers and returns the result
     * 
     * @param number1 the first number to add
     * @param number2 the second number to add
     * @return the sum of number1 and number2
     */
    public static int addition(int number1, int number2) {
        return number1 + number2;
    }
}