/**
 * A program that demonstrates the usage of the System.out.printf method 
 * to display formatted output.
 *
 * The minus sign (-) is used for left justification in the output.
 *
 * Frequently Used Format Specifiers:
 * - %b: a Boolean value (true or false)
 * - %c: a character (e.g., 'a')
 * - %d: a decimal integer (e.g., 200)
 * - %f: a floating-point number (e.g., 45.460000)
 * - %e: a number in scientific notation (e.g., 4.556000e+01)
 * - %s: a string (e.g., "Java is cool")
 *
 * Source: Liang, Introduction to Java Programming, Eleventh Edition(2018). 
 */

public class FormatDemo {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Degrees", 
            "Radians", "Sine", "Cosine", "Tangent");

        int degrees = 30;
        double radians = Math.toRadians(degrees);   
        // For example, %10.4f represents a floating-point number with a total width of 10 characters,
        // including 4 digits after the decimal point.
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees, 
            radians, Math.sin(radians), Math.cos(radians),
            Math.tan(radians));

        degrees = 60;
        radians = Math.toRadians(degrees);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees, 
            radians, Math.sin(radians), Math.cos(radians), 
            Math.tan(radians)); 
    }
}
