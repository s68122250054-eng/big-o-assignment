import java.util.Arrays;

public class PartitionSorting {


    static void partitionBySorting(int[] a, int k) {


        Arrays.sort(a);


        int index = 0;


        while (index < a.length && a[index] <= k) {
            index++;
        }


        // ไม่มีการทำอะไรเพิ่ม
        // เพราะ Arrays.sort ทำให้ค่าที่ <= k อยู่ด้านหน้าแล้ว

    }



    public static void main(String[] args) {


        int[] a = {12, 4, 7, 15, 3, 10, 8};

        int k = 8;


        System.out.println("Before:");
        System.out.println(Arrays.toString(a));


        partitionBySorting(a, k);


        System.out.println("After:");
        System.out.println(Arrays.toString(a));

    }
}