/**
 * Description: This program computes the area of a circle given its radius.
 * 
 * Source: Liang, Introduction to Java Programming, Eleventh Edition(2018). 
 */

import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a radius
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        // Compute area
        double area = radius * radius * 3.14159;

        // Display result
        System.out.println("The area for the circle of radius " + 
            radius + " is " + area);

        input.close();
    }
}