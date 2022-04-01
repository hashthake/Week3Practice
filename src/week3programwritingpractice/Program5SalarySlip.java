package week3programwritingpractice;

import java.util.Scanner;

/**
 * Wap to input employee id, name, basic salary then find HRA, TA,DA, PF, and GROSS
 * salary
 * HRA = basic salary 10%
 * Da = Basic salary 8%
 * TA = basic salary 9%
 * PF = basic salary 20%
 * Gross salary = basic salary + HRA + TA +DA - PF
 * print in a format
 */
public class Program5SalarySlip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scan.nextLine();

        System.out.println("Enter your Employee Id: ");
        double employeeId = scan.nextDouble();

        System.out.println("Enter basic salary: ");
        double basicSalary = scan.nextDouble();

        // Calculating HRA,DA,TA and PF
        double hRA = calculateHRA(basicSalary);
        double da = calculateDA(basicSalary);
        double ta = calculateTA(basicSalary);
        double pf = calculatePF(basicSalary);

        // Calculating the gross salary
        double grossSalary = basicSalary + hRA + da + ta - pf;

        System.out.println("---------------------------------------");
        System.out.println("|Salary Slip                          |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Employee ID:" + employeeId + "                     |");
        System.out.println("|Employee Name:" + name + "                  |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Basic Salary: " + basicSalary + "                |");
        System.out.println("|HRA 10%     : " + hRA + "                 |");
        System.out.println("|TA 8%       : " + ta + "                 |");
        System.out.println("|DA 9%       : " + da + "                 |");
        System.out.println("|PF -20%     : " + pf + "                 |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Gross Salary: " + grossSalary + "                |");
        System.out.println("|-------------------------------------|");
        // Closing scanner object
        scan.close();
    }

    // Calculating HRA
    public static double calculateHRA(double basicSalary) {
        return (basicSalary * 10) / 100;
    }

    // Calculating DA
    public static double calculateDA(double basicSalary) {
        return (basicSalary * 8) / 100;
    }

    // Calculating TA
    public static double calculateTA(double basicSalary) {
        return (basicSalary * 9) / 100;
    }

    // Calculating PF
    public static double calculatePF(double basicSalary) {
        return (basicSalary * 20) / 100;
    }
}







