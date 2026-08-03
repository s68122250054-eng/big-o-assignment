import java.util.Scanner;

public class ReverseIterative {

    static String reverseIterative(String s) {
        StringBuilder result = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            result.append(s.charAt(i));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input : ");
        String input = sc.nextLine();

        System.out.println("Output : " + reverseIterative(input));

        sc.close();
    }
}