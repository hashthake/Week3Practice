package week3programwritingpractice;

import java.util.Scanner;

/** Write a java program to input student name, roll no, and three subjects math, science and
 * english marks ( marks is between 0 to 100 and if it is out of range print error message
 * "invalid input, marks should between 0 to 100" and find out total, percentage and result.
 * If student is pass ot fail on basis of percentage (pass>=35) and also give them grade if (%>=80 A+, %>=60A,
 * %>= 50 B, %>=35 c and print mark sheet.
 */
public class Program3MarkSheet {
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter Student Name      \t \t:\t");
        String name = scan.next();
        System.out.print("Enter Student Roll Number \t\t:\t");
        int rollNum = scan.nextInt();
        System.out.print("Enter Marks of Subject Maths \t:\t");
        int mathsMarks = scan.nextInt();
        if (mathsMarks < 0 || mathsMarks > 100) {
            System.out.print("\nInvalid input, Marks should between 0 to 100");
            System.out.print("\nPlease enter correct marks\t\t:\t");
            mathsMarks = scan.nextInt();
        }
        System.out.print("Enter Marks of Subject Science\t:\t");
        int scienceMarks = scan.nextInt();
        if (scienceMarks < 0 || scienceMarks > 100) {
            System.out.print("\nInvalid input, Marks should between 0 to 100");
            System.out.print("\nPlease enter correct marks\t\t:\t");
            scienceMarks = scan.nextInt();
        }
        System.out.print("Enter Marks of Subject English\t:\t");
        int englishMarks = scan.nextInt();
        if (englishMarks < 0 || englishMarks > 100) {
            System.out.print("\nInvalid input, Marks should between 0 to 100");
            System.out.print("\nPlease enter correct marks\t\t:\t");
            englishMarks = scan.nextInt();
        }
        int total = sum(mathsMarks, scienceMarks, englishMarks);
        int percentage = (total * 100) / 300;
        String result = calculateResult(mathsMarks, scienceMarks, englishMarks);
        String grade = calculateGrade(percentage, result);
        printTheMarkSheet(name, rollNum, mathsMarks, scienceMarks, englishMarks, total, percentage, result, grade);
        //Closing the scanner object
        scan.close();
    }

    //calculating the sun
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Calculating the results on subjects marks
    public static String calculateResult(int mathsMarks, int scienceMarks, int englishMarks) {
        if (mathsMarks < 35 || scienceMarks < 35 || englishMarks < 35) {
            return "Fail";
        } else {
            return "Pass";
        }
    }

    // Calculating the grade on percentage and result
    public static String calculateGrade(int percentage, String result) {
        String grade = null;
        if (result.equalsIgnoreCase("pass")) {
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >= 35) {
                grade = "C";
            }
        } else {
            grade = "-";
        }
        return grade;
    }

    // Printing the Marks sheet
    public static void printTheMarkSheet(String name, int rollNum, int mathsMarks, int scienceMarks,
                                         int englishMarks, double total, double percentage, String result,
                                         String grade) {
        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("| Mark Sheet                |");
        System.out.println("|___________________________|");
        System.out.println("| Name:" + name + "         |");
        System.out.println("| Roll No:" + rollNum + "    ");
        System.out.println("|___________________________|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("|___________________________|");
        System.out.println("| Math:" + mathsMarks + "   |");
        System.out.println("| Science:" + scienceMarks + "|");
        System.out.println("| English:" + englishMarks + "|");
        System.out.println("|___________________________|");
        System.out.println("| Total:" + total + "        |");
        System.out.println("|___________________________|");
        System.out.println("| Percentage:" + percentage + "|");
        System.out.println("| Result:" + result + "      |");
        System.out.println("| Grade:" + grade + "        |");
        System.out.println("|___________________________|");
    }
}