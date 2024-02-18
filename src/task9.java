import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую строку:");
        String str1 = scanner.nextLine().replaceAll("[^a-zA-Zа-яА-Я]", "").toLowerCase();

        System.out.println("Введите вторую строку:");
        String str2 = scanner.nextLine().replaceAll("[^a-zA-Zа-яА-Я]", "").toLowerCase();

        if (isAnagram(str1, str2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    private static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);

        return java.util.Arrays.equals(arr1, arr2);
    }
}

