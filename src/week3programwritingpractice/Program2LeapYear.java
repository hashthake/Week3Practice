package week3programwritingpractice;

import java.util.Scanner;

/** Write a java program that any year ex.2007 is a
 * leap year or not
 */
public class Program2LeapYear {
    public static void main(String[] args) {


        //Scanner declaration to reading input from console
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the year : ");
        int year = sc.nextInt();
        Program2LeapYear obj = new Program2LeapYear();
        obj.isItLeapYear(year);
        //closing the scanner object
        sc.close();

    }
    //Checking is it leap year or not
    public void isItLeapYear(int year){
        if (year % 4 == 0 && year %100 !=0 || year %400 ==0){
            System.out.println("The year " + year + " is leap year");
            return;
        }
        System.out.println("The Year " + year + " is not a leap year");
    }
}