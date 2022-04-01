package week3programwritingpractice;

import java.util.Scanner;

/** write a program to check if enter number is " positive", "Negative or
 * "Zero"
 */

public class Program16FindPositiveNegatve {


    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scan.nextInt();
        findNumberIsPositiveNegativeOrZero(number);
        //Closing the scanner object
        scan.close();
    }

    // Finding the number is Positive Negative or Zero
    public static void findNumberIsPositiveNegativeOrZero(int number) {
        if (number > 0) {
            System.out.println(number + " is a POSITIVE number");
        } else if (number < 0) {
            System.out.println(number + " is a NEGATIVE number");
        } else {
            System.out.println(number + " is ZERO");
        }
    }

}