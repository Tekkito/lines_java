import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (Character.isLetter(currentChar)) {
                if (Character.isUpperCase(currentChar)) {
                    result.append(Character.toLowerCase(currentChar));
                } else {
                    result.append(Character.toUpperCase(currentChar));
                }
            } else if (Character.isDigit(currentChar)) {
                result.append('_');
            } else {
                result.append(currentChar);
            }
        }

        System.out.println("Результат замены: " + result.toString());
    }
}