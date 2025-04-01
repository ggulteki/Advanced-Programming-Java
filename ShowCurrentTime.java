/**
 * Descriptiom: A program that calculates the current time in GMT base on the
 * System.currentTimeMillis() method. This method returns the number of milliseconds,
 * between the current time and midnight, Jan 1, 1970. More detail information,
 * check the https://en.wikipedia.org/wiki/System_time
 * 
 * Source: Liang, Introduction to Java Programming, Eleventh Edition(2018).
 */
public class ShowCurrentTime {
    public static void main(String[] args) {
        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();
        
        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        long currentHour = totalHours % 24;

        System.out.println("Current time is " + currentHour + ":"
            + currentMinute + ":" + currentSecond + " GMT");
    }
}