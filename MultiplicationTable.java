/**
 * Description: This program prints a multiplication table from 1 to 9.
 * 
 * Source: Liang, Introduction to Java Programming, Eleventh Edition(2018).
 */

public class MultiplicationTable {
    public static void main(String[] args) {
      System.out.println("           Multiplication Table");
  
      System.out.print("    ");
      for (int j = 1; j <= 9; j++)
        System.out.print("   " + j);
  
      System.out.println("\n-----------------------------------------");
  
      for (int i = 1; i <= 9; i++) {
        System.out.print(i + " | ");
        for (int j = 1; j <= 9; j++) {
          System.out.printf("%4d", i * j);
        }
        System.out.println();
      }
    }
  }