public class task6 {
    public static void main(String[] args) {
        int totalCount = 100000;
        int excludedCount = countExcludedNumbers();
        System.out.println("Всего номеров для исключения: " + excludedCount);
    }
    private static int countExcludedNumbers() {
        int count = 0;
        for (int i = 0; i < 100000; i++) {
            if (containsRepeatedDigits(String.format("%05d", i))) {
                count++;
            }
        }
        return count;
    }
    private static boolean containsRepeatedDigits(String number) {
        for (int i = 0; i < number.length() - 1; i++) {
            if (number.charAt(i) == number.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }
}