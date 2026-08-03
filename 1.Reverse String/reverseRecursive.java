import java.util.Scanner;

public class ReverseRecursive {

    static String reverseRecursive(String s) {
        if (s.length() <= 1) {
            return s;
        }
        return s.charAt(s.length() - 1)
                + reverseRecursive(s.substring(0, s.length() - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input : ");
        String input = sc.nextLine();

        System.out.println("Output : " + reverseRecursive(input));

        sc.close();
    }
}