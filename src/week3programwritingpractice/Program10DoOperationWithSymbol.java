package week3programwritingpractice;

import java.util.Scanner;

/** Write a program ti input any two numbers and ask user to enter their symbol
 * (+,-,/,*) find addition, suntraction, multiplication and division according to symbol they put
 * using if else
 */

public class Program10DoOperationWithSymbol {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int x = scan.nextInt();
        System.out.println("Enter the second number : ");
        int y = scan.nextInt();
        System.out.println("Please select the calculation symbol +, -, *, / : ");
        char symbol = scan.next().charAt(0);
        doOperationBySelectingSymbol(x, y, symbol);
        //Closing the scanner object
        scan.close();
    }

    // Calculating operation based on symbol
    public static void doOperationBySelectingSymbol(int x, int y, char symbol) {
        if (symbol == '+') {
            System.out.println(x + " + " + y + " = " + (x + y));
        } else if (symbol == '-') {
            System.out.println(x + " - " + y + " = " + (x - y));
        } else if (symbol == '*') {
            System.out.println(x + " x " + y + " = " + (x * y));
        } else if (symbol == '/') {
            System.out.println(x + " / " + y + " = " + (x / y));
        } else {
            System.out.println("Please enter correct symbol +,-,*,/");
        }
    }
}
