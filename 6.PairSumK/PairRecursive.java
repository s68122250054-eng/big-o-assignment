import java.util.Arrays;

public class PairRecursive {


    static boolean findPairRecursive(
            int[] a, int k, int left, int right) {


        // Base Case
        if (left >= right) {

            System.out.println("Pair not found");

            return false;
        }


        int sum = a[left] + a[right];


        if (sum == k) {

            System.out.println(
                "Pair found: " + a[left] + " and " + a[right]
            );

            return true;
        }


        // Recursive Case
        if (sum < k) {

            return findPairRecursive(
                a, k, left + 1, right
            );

        } else {

            return findPairRecursive(
                a, k, left, right - 1
            );
        }
    }



    public static void main(String[] args) {


        int[] a = {2, 4, 7, 11, 15, 20};

        int k = 18;


        System.out.println(Arrays.toString(a));


        findPairRecursive(
            a,
            k,
            0,
            a.length - 1
        );

    }
}