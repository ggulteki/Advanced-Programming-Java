/**
 * Description: This program generates two random single-digit integers, then
 * prompts the user to subtract the smaller from the larger. It checks if the
 * user's answer is correct and provides feedback. It uses a random method to
 * generate the integers and a scanner for user input.
 * 
 * Source: Liang, Introduction to Java Programming, Eleventh Edition(2018).
 */

public class SubtractionQuiz {
    public static void main(String[] args) {
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        
        System.out.print("What is " + number1 + " - " + number2 + "? ");
        java.util.Scanner input = new java.util.Scanner(System.in);
        int answer = input.nextInt();

        if (number1 - number2 == answer) {
            System.out.println("You are correct!");
        } else {
            System.out.println("Your answer is wrong.");
            System.out.println(number1 + " - " + number2 +
                " should be " + (number1 - number2));
        }
        input.close();
    }
    
}
