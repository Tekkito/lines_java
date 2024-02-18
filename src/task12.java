import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите текст: ");
        String text = scanner.nextLine();

        int smileyCount = countSmileys(text);
        System.out.println("Количество смайликов: " + smileyCount);

        scanner.close();
    }
    private static int countSmileys(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ';' || text.charAt(i) == ':') {
                int j = i + 1;
                while (j < text.length() && text.charAt(j) == '-') {
                    j++;
                }

                if (j < text.length() && (text.charAt(j) == '(' || text.charAt(j) == '[' || text.charAt(j) == ')' || text.charAt(j) == ']')) {
                    char smileyEnd = text.charAt(j);
                    while (j < text.length() && text.charAt(j) == smileyEnd) {
                        j++;
                    }

                    if (j == text.length() || text.charAt(j) == ' ') {
                        count++;
                        i = j - 1;
                    }
                }
            }
        }
        return count;
    }
}
