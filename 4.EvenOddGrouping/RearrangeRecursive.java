import java.util.Arrays;

public class RearrangeRecursive {


    static void rearrangeRecursive(int[] a, int left, int right) {

        if (left >= right) {
            return;
        }


        // ถ้าซ้ายเป็นเลขคู่ ให้เลื่อน left
        if (a[left] % 2 == 0) {
            rearrangeRecursive(a, left + 1, right);
            return;
        }


        // ถ้าขวาเป็นเลขคี่ ให้เลื่อน right
        if (a[right] % 2 != 0) {
            rearrangeRecursive(a, left, right - 1);
            return;
        }


        // ซ้ายเป็นคี่ ขวาเป็นคู่ ให้สลับ
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;


        rearrangeRecursive(a, left + 1, right - 1);
    }


    public static void main(String[] args) {


        int[] a = {7, 2, 9, 4, 1, 6, 3, 8};


        System.out.println("Before:");
        System.out.println(Arrays.toString(a));


        rearrangeRecursive(a, 0, a.length - 1);


        System.out.println("After:");
        System.out.println(Arrays.toString(a));

    }
}