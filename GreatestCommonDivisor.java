/**
 * Description: The program finds the greates common divisor of both given integers.
 * 
 * Source: Liang, Introduction to Java Programming, Eleventh Edition(2018).
 */

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter the second integer: ");
        int n2 = input.nextInt();

        int gcd = 1;
        for (int i = 2; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println("The greatest common divisor for " + n1 +
            " and " + n2 + " is " + gcd);
    }
}