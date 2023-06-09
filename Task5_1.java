import java.util.Scanner;
public class Task5_1 {
 public static void PrintTask5_1() {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Введіть початок діапазону: ");
                double start = scanner.nextDouble();

                System.out.print("Введіть кінець діапазону: ");
                double end = scanner.nextDouble();

                int count = 0; // Лічильник кількості значень функції в діапазоні

                for (double x = -2; x <= 2; x += 0.2) {
                    double result = 2 * x * Math.sin(x) - Math.cos(x);
                    if (result >= start && result <= end) {
                        count++;
                    }
                }

                if (count > 0) {
                    System.out.println("Кількість значень функції в заданому діапазоні: " + count);
                } else {
                    System.out.println("Значень функції в заданому діапазоні немає");
                }
            }
        }

