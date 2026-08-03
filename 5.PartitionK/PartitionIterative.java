import java.util.Arrays;

public class PartitionIterative {


    static void partitionIterative(int[] a, int k) {


        int left = 0;
        int right = a.length - 1;


        while (left < right) {


            // ด้านซ้ายถูกต้อง
            if (a[left] <= k) {
                left++;
            }


            // ด้านขวาถูกต้อง
            else if (a[right] > k) {
                right--;
            }


            // ต้องสลับตำแหน่ง
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


        int[] a = {12, 4, 7, 15, 3, 10, 8};

        int k = 8;


        System.out.println("Before:");
        System.out.println(Arrays.toString(a));


        partitionIterative(a, k);


        System.out.println("After:");
        System.out.println(Arrays.toString(a));

    }
}