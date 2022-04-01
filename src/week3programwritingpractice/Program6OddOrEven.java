package week3programwritingpractice;

import java.util.Scanner;

/**
 *  Write a program to input any number and find out if it's odd or even
 */
public class Program6OddOrEven {
    public static void main(String[] args) {
        // scanner for reading input from console
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number you want to check : ");
        int number = scan.nextInt();
        Program6OddOrEven obj = new Program6OddOrEven();
        System.out.println(number + " is " + obj.isItEvenorOddNumber(number) + " number");
        scan.close();

    }
    //checking odd or even
    public String isItEvenorOddNumber(int number){
        if (number %2 == 0){
            return "Even";
        }else {
            return "Odd";
        }
    }


}
