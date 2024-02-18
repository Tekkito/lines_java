import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine().toLowerCase();

        String[] words = input.split("\\s+");

        System.out.println("Слова, начинающиеся на гласную и заканчивающиеся на согласную:");
        for (String word : words) {
            if (word.matches("^[aeiouy].*[bcdfghjklmnpqrstvwxyz]$")) {
                System.out.println(word);
            }
        }
    }
}
