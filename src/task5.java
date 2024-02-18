import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        input = input.replace(':', ' ');

        String[] words = input.split("\\s+");

        int countEvenLengthWords = 0;
        for (String word : words) {
            if (word.length() % 2 == 0) {
                countEvenLengthWords++;
            }
        }

        System.out.println("Количество слов с четным количеством букв: " + countEvenLengthWords);
    }
}
