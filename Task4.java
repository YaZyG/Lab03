public class Task4 {
    public static void PrintTask4() {
        int hoursLimit = 2; // Ліміт годин
        int minutesLimit = 59; // Ліміт хвилин
        int secondLimit = 59 ; // Ліміт секунди

        for (int hours = 0; hours <= hoursLimit; hours++) {
            for (int minutes = 0; minutes <= minutesLimit; minutes++) {
                for (int second = 0; second <= secondLimit; second++) {
                System.out.printf("%02dh%02dmin%02dsec%n", hours, minutes, second);
            }
        }
    }
}
    }
