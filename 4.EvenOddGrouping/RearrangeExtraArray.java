import java.util.Arrays;

public class RearrangeExtraArray {


    static int[] rearrangeExtraArray(int[] a) {


        int[] result = new int[a.length];

        int index = 0;


        // ใส่เลขคู่ก่อน
        for (int i = 0; i < a.length; i++) {

            if (a[i] % 2 == 0) {

                result[index] = a[i];
                index++;

            }
        }


        // ใส่เลขคี่ตามหลัง
        for (int i = 0; i < a.length; i++) {

            if (a[i] % 2 != 0) {

                result[index] = a[i];
                index++;

            }
        }


        return result;
    }



    public static void main(String[] args) {


        int[] a = {5, 2, 7, 4, 9, 6};


        System.out.println("Original:");
        System.out.println(Arrays.toString(a));


        int[] result = rearrangeExtraArray(a);


        System.out.println("Result:");
        System.out.println(Arrays.toString(result));

    }
}