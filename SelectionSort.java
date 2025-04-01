/**
 * Description: The Selection Sort Algorithm, find the smallest number in the
 * list and places it first. Son and so forh until the list been ascending ordered.
 * 
 * Source: Liang, Introduction to Java Programming, Eleventh Edition(2018). 
 */

public class SelectionSort {
    /** Main method */
    public static void main(String[] args) {
        double[] list = new double[10];

        for (int i = 0; i < list.length; i++) {
            list[i] = RandomCharacter.getRandomDigitCharacter();
        }

        selectionSort(list);

        for (int i = 0; i < list.length; i++) {
            System.out.print(" " + list[i]);
        }
    }
    
    /** The method for sorting the numbers */
    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length; i++) {
            // Find the minimum in the list[i..list.length-1]
            double currentMin = list[i];
            int currentMinIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary;
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}