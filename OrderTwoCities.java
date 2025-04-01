/**
 * Description: A program that prompts the user to enter two city names and displays them in alphabetical order.
 * To achieve this compateTo methoed is used to compare the two strings according to the return value of the method.
 * 
 * Source: Liang, Introduction to Java Programming, Eleventh Edition(2018).
 */

import java.util.Scanner;

public class OrderTwoCities {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two cities
        System.out.println("Enter the first city: ");
        String city1 = input.nextLine();
        System.out.println("Enter the second city: ");
        String city2 = input.nextLine();
        
        if (city1.compareTo(city2) < 0) {
            System.out.println("The cities in alphabetical order are " +
            city1 + " " + city2);
        } else {
            System.out.println("The cities in alphabetical order are " +
                city2 + " " + city1);
        }
        input.close();
    }
}