import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку (максимум 50 символов): ");
        String input = scanner.nextLine();

        if (input.length() > 50) {
            System.out.println("Ошибка: длина строки превышает 50 символов.");
            return;
        }

        printDiamond(input);
    }
    public static void printDiamond(String str) {
        int n = str.length();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(str.charAt(j) + " ");
            }

            System.out.println();
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(str.charAt(j) + " ");
            }

            System.out.println();
        }
    }
}