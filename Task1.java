public class Task1 {
    public static void PrintTask1() {
        String phrase = "Qwerty"; // Задана фраза

        // Використання циклу for
        for (int i = 0; i < 50; i++) {
            System.out.println(phrase);
        }

        System.out.println("---------------------------");

        // Використання циклу while
        int counter = 0;
        while (counter < 50) {
            System.out.println(phrase);
            counter++;
        }
    }
}
