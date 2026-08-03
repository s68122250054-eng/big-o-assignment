import java.util.Arrays;

public class PartitionRecursive {


    static void partitionRecursive(int[] a, int k, int left, int right) {


        if (left >= right) {
            return;
        }


        // ถ้าซ้ายถูกต้องแล้ว
        if (a[left] <= k) {
            partitionRecursive(a, k, left + 1, right);
            return;
        }


        // ถ้าขวาถูกต้องแล้ว
        if (a[right] > k) {
            partitionRecursive(a, k, left, right - 1);
            return;
        }


        // ซ้าย > k และ ขวา <= k ให้สลับ
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;


        partitionRecursive(a, k, left + 1, right - 1);
    }



    public static void main(String[] args) {


        int[] a = {12, 4, 7, 15, 3, 10, 8};

        int k = 8;


        System.out.println("Before:");
        System.out.println(Arrays.toString(a));


        partitionRecursive(a, k, 0, a.length - 1);


        System.out.println("After:");
        System.out.println(Arrays.toString(a));

    }
}