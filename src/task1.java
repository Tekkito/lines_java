import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку текста: ");
        String text = scanner.nextLine();

        System.out.print("Введите один символ: ");
        char symbol = scanner.next().charAt(0);

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == symbol) {
                System.out.println("Индекс: " + i);
                count++;
            }
        }

        if (count > 0) {
            System.out.println("Количество совпадений: " + count);
        } else {
            System.out.println("Совпадений не найдено.");
        }
    }
}
