import java.util.Scanner;

public class VowelIterative {


    static boolean hasMoreVowelsIterative(String s) {

        int vowels = 0;
        int consonants = 0;


        for (int i = 0; i < s.length(); i++) {


            char c = Character.toLowerCase(s.charAt(i));


            // ตรวจสอบเฉพาะตัวอักษรภาษาอังกฤษ
            if (c >= 'a' && c <= 'z') {


                if (isVowel(c)) {
                    vowels++;
                } 
                else {
                    consonants++;
                }
            }
        }


        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);


        return vowels > consonants;
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


        boolean result = hasMoreVowelsIterative(input);


        System.out.println("Result: " + result);


        sc.close();
    }
}