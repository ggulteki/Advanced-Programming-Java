/**
 * Description: The program estimates the value of PI using the Monte Carlo method.
 * It generates random 2D points in a square and counts how many fall within a full circle
 * of radius 1. The ratio of points inside the circle to the total number of points is
 * used to approximate the value of PI.
 * 
 * Source: Liang, Introduction to Java Programming, Eleventh Edition(2018). 
 */
public class MonteCarloSimulation {
    public static void main(String[] args) {
        final int NUMBER_OF_TRIALS = 10000000;
        int numberOfHits = 0;

        for (int i = 0; i < NUMBER_OF_TRIALS; i++) {
            double x = Math.random() * 2.0 - 1;
            double y = Math.random() * 2.0 - 1;

            if (x * x + y * y <= 1) {
                numberOfHits++;
            }
            double pi = 4.0 * numberOfHits / NUMBER_OF_TRIALS;
            System.out.println("PI is " + pi);
        }
    }
}