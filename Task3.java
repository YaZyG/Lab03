public class Task3 {
    public static void PrintTask3() {
                int hours = 0; // Початкове значення годин
                int minutes = 0; // Початкове значення хвилин

                while (hours <= 2) {
                    while (minutes <= 59) {
                        System.out.printf("%02dh%02dmin%n", hours, minutes);
                        minutes++;
                    }
                    minutes = 0; // Скидаємо значення хвилин до 0
                    hours++; // Збільшуємо години на 1
                }
            }
        }

