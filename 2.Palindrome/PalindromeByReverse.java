import java.util.Scanner;

public class PalindromeByReverse {

    static boolean isPalindromeByReverse(String s) {

        // แปลงเป็นตัวพิมพ์เล็กและลบช่องว่าง/เครื่องหมายพิเศษ
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        StringBuilder reverse = new StringBuilder(s);
        reverse.reverse();

        return s.equals(reverse.toString());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input: ");
        String input = sc.nextLine();

        boolean result = isPalindromeByReverse(input);

        System.out.println("Output: " + result);

        sc.close();
    }
}