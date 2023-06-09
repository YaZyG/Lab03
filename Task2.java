public class Task2 {
    public static void PrintTask2() {
        int hoursLimit = 2; // Ліміт годин
        int minutesLimit = 59; // Ліміт хвилин

        for (int hours = 0; hours <= hoursLimit; hours++) {
            for (int minutes = 0; minutes <= minutesLimit; minutes++) {
                System.out.printf("%02dh%02dmin%n", hours, minutes);
            }
        }
    }
}