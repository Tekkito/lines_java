import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите предложение: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split("\\s+");

        int totalLength = 0;
        for (String word : words) {
            totalLength += word.length();
        }

        double averageLength = (double) totalLength / words.length;

        System.out.println("Средняя длина слова: " + averageLength);
    }
}

