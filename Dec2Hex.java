/**
 * A program that converts a decimal number to hexadecimal.
 * Description: According to ASCII table, the hexadecimal numbers from 0 to 9 are represented by the characters '0' to '9', for 10 to 15, they are represented by 'A' to 'F'.
 * 
 * Source: Liang, Introduction to Java Programming, Eleventh Edition(2018). 
 */

import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a decimal number: ");
        int decimal = input.nextInt();

        String hex = "";
        while (decimal != 0) {
            int hexValue = decimal % 16;
            char hexDigit = (0 <= hexValue && hexValue <= 9)
                ? (char)(hexValue + '0') 
                : (char)(hexValue - 10 + 'A');
            
            hex = hexDigit + hex;
            decimal = decimal / 16;
        }
        System.out.println("The hex number is " + hex);
    }
}