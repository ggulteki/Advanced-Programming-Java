/**
 * Description: The program calculates the sales tax on a purchase amount. It uses type
 * casting to display the tax amount correctly.
 * 
 * Source: Liang, Introduction to Java Programming, Eleventh Edition(2018).
 */
import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();

        double tax = purchaseAmount * 0.06;
        System.out.println("Sales tax is " + (int)(tax * 100) / 100.0);

        input.close();
    }
}
