import java.util.Scanner;
public class Task5_2 {
    public static void PrintTask5_2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть початок діапазону: ");
        double start = scanner.nextDouble();

        System.out.print("Введіть кінець діапазону: ");
        double end = scanner.nextDouble();

        double x = -2.0;
        double step = 0.2;
        int count = 0;

        while (x <= 2.0) {
            double fx = 2 * x * Math.sin(x) - Math.cos(x);
            if (fx >= start && fx <= end) {
                count++;
            }
            x += step;
        }

        if (count > 0) {
            System.out.println("Кількість значень функції, що належать до діапазону [" + start + ", " + end + "]: " + count);
        } else {
            System.out.println("Немає значень функції, що належать до діапазону [" + start + ", " + end + "]");
        }
    }
}
