import java.util.Arrays;

public class RearrangeTwoPointer {


    static void rearrangeTwoPointer(int[] a) {


        int left = 0;
        int right = a.length - 1;


        while (left < right) {


            // ซ้ายเป็นคู่
            if (a[left] % 2 == 0) {
                left++;
            }


            // ขวาเป็นคี่
            else if (a[right] % 2 != 0) {
                right--;
            }


            // ซ้ายเป็นคี่ ขวาเป็นคู่
            else {

                int temp = a[left];
                a[left] = a[right];
                a[right] = temp;

                left++;
                right--;
            }
        }
    }



    public static void main(String[] args) {


        int[] a = {7, 2, 9, 4, 1, 6, 3, 8};


        System.out.println("Before:");
        System.out.println(Arrays.toString(a));


        rearrangeTwoPointer(a);


        System.out.println("After:");
        System.out.println(Arrays.toString(a));

    }
}