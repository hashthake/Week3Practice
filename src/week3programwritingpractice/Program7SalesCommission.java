package week3programwritingpractice;

import java.util.Scanner;

/** write a java program input seller id, sellers name, sales amount and basic salary
 * then find sales, commission.
 * if sales amount >=50000 35%, if sales amount >=30000 20%
 * if sales >=20000 10% if sales >=10000 5%, if >=10000 2%
 */

public class Program7SalesCommission {
    public static void main(String[] args) {


    //Scanner declaration for reading input form console
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Seller Name: ");
    String name = scan.nextLine();
        System.out.println("Enter Seller ID:");
    int sellerId = scan.nextInt();
        System.out.println("Enter Sales Amount:");
    int salesAmount = scan.nextInt();
        System.out.println("Enter Basic Salary: ");
    int basicSalary = scan.nextInt();
    //Creating the object to call instance method
    Program7SalesCommission salesCommission = new Program7SalesCommission();
    int grossSalary = basicSalary + salesCommission.calculateCommission(salesAmount);
        System.out.println("Seller name is            : " + name);
        System.out.println("Seller id is              : " + sellerId);
        System.out.println("Seller's sales amount is  : " + salesAmount);
        System.out.println("Seller's basic salary is  : " + basicSalary);
        System.out.println("Seller's gross salary is  : " + grossSalary);
    // closing the scanner object
        scan.close();
}

    // Calculating the sales commission
    public int calculateCommission(int salesAmount) {
        int commission;
        if (salesAmount >= 50000) {
            commission = (salesAmount * 35) / 100;
            System.out.println("Sales Commission is " + commission);
        } else if (salesAmount >= 30000) {
            commission = (salesAmount * 20) / 100;
            System.out.println("Sales Commission is " + commission);
        } else if (salesAmount >= 20000) {
            commission = (salesAmount * 10) / 100;
            System.out.println("Sales Commission is " + commission);
        } else if (salesAmount >= 10000) {
            commission = (salesAmount * 5) / 100;
            System.out.println("Sales Commission is " + commission);
        } else {
            commission = (salesAmount * 2) / 100;
            System.out.println("Sales Commission is " + commission);
        }
        return commission;
    }

}


