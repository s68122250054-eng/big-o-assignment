import java.util.Scanner;

public class PalindromeRecursive {

    static boolean isPalindromeRecursive(String s, int left, int right) {

        if (left >= right) {
            return true;
        }

        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }

        return isPalindromeRecursive(s, left + 1, right - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");
        String input = sc.nextLine();

        // แปลงเป็นตัวพิมพ์เล็กและลบช่องว่าง/เครื่องหมายพิเศษ
        input = input.toLowerCase().replaceAll("[^a-z0-9]", "");

        boolean result = isPalindromeRecursive(input, 0, input.length() - 1);

        System.out.println("Output: " + result);

        sc.close();
    }
}