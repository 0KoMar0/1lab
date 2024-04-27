import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number < 0) {
            number = Math.abs(number);
        } else {
            number = 0;
        }

        System.out.println("Измененное число: " + number);
    }
}
