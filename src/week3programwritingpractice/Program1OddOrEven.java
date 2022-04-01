package week3programwritingpractice;

import java.util.Scanner;

/**1. Write a java program that tells us that Input number is odd or even?
 * hint: use ternary operator(?:)
 */
public class Program1OddOrEven {
    //Scanner declaration for reading input from console
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the number: ");
        int number = sc.nextInt();
        isItOddOrEvenNumber(number);
        sc.close();
    }
    public static void isItOddOrEvenNumber(int number){
        //ternary operator is used
        String evenOrOdd = (number % 2 ==0) ? "even" : "Odd";
        System.out.println("The " + number + " is " + evenOrOdd + " number");
    }
}
