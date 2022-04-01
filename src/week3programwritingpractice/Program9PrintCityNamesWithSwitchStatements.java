package week3programwritingpractice;

import java.util.Scanner;

/** Input any alphabet between 'A to F' and print city name if
 * any other alphabet should be invalid entry using switch statements
 */
public class Program9PrintCityNamesWithSwitchStatements {

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter alphabet between A to F : ");
        String city = scan.next().toUpperCase();
        //Create object and call instance method
        Program9PrintCityNamesWithSwitchStatements cityName = new Program9PrintCityNamesWithSwitchStatements();
        cityName.printCityName(city);
        //Closing the scanner object
        scan.close();
    }

    //Printing city name
    public void printCityName(String city) {
        switch (city) {
            case "A":
                System.out.println("Aberdeen");
                break;
            case "B":
                System.out.println("Belfast");
                break;
            case "C":
                System.out.println("Cambridge");
                break;
            case "D":
                System.out.println("Derby");
                break;
            case "E":
                System.out.println("Edinburgh");
                break;
            case "F":
                System.out.println("Feltham");
                break;
            default:
                System.out.println("The alphabet you enter is not between A to F");
        }
    }
}
