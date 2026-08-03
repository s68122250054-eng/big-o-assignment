import java.util.Scanner;

public class VowelRecursive {

    static int vowels = 0;
    static int consonants = 0;

    static boolean hasMoreVowelsRecursive(String s) {

        countRecursive(s, 0);

        return vowels > consonants;
    }


    static void countRecursive(String s, int index) {

        // กรณีตรวจสอบครบทุกตัวอักษร
        if (index == s.length()) {
            return;
        }


        char c = Character.toLowerCase(s.charAt(index));


        // ตรวจสอบว่าเป็นตัวอักษรภาษาอังกฤษหรือไม่
        if (c >= 'a' && c <= 'z') {

            if (isVowel(c)) {
                vowels++;
            } else {
                consonants++;
            }
        }


        // เรียกตัวเองเพื่อตรวจสอบตัวถัดไป
        countRecursive(s, index + 1);
    }


    static boolean isVowel(char c) {

        return c == 'a' ||
               c == 'e' ||
               c == 'i' ||
               c == 'o' ||
               c == 'u';
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Input: ");
        String input = sc.nextLine();


        boolean result = hasMoreVowelsRecursive(input);


        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Result: " + result);


        sc.close();
    }
}