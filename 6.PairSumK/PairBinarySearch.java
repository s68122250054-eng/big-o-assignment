import java.util.Arrays;

public class PairBinarySearch {


    static boolean findPairBinarySearch(int[] a, int k) {


        for (int i = 0; i < a.length; i++) {


            int target = k - a[i];


            if (binarySearch(
                    a,
                    target,
                    i + 1,
                    a.length - 1)) {


                System.out.println(
                    "Pair found: "
                    + a[i]
                    + " and "
                    + target
                );


                return true;
            }
        }


        System.out.println("Pair not found");

        return false;
    }



    static boolean binarySearch(
            int[] a,
            int target,
            int left,
            int right) {


        while (left <= right) {


            int mid = (left + right) / 2;


            if (a[mid] == target) {

                return true;

            }
            else if (a[mid] < target) {

                left = mid + 1;

            }
            else {

                right = mid - 1;

            }
        }


        return false;
    }



    public static void main(String[] args) {


        int[] a = {2, 4, 7, 11, 15, 20};

        int k = 18;


        System.out.println(Arrays.toString(a));


        findPairBinarySearch(a, k);

    }
}