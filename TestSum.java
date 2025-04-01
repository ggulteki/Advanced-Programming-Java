/**
 * Description: A program that demonstrates the numerical errors of floating-point arithmetic.
 * The final sum will not be exact due to the computers limitation in representing
 * floating-point numbers with a finite number of bits.
 * 
 * Source: Liang, Introduction to Java Programming, Eleventh Edition(2018).
 */

public class TestSum {
    public static void main(String[] args) {
        float sum = 0;

        for (float i = 0.01f; i <= 1.0f; i = i + 0.01f) {
            sum += i;
            System.out.println("i is " + i + " sum is " + sum);
        }
    }
}