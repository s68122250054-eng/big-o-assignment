import java.util.Arrays;

public class PairBruteForce {


    static boolean findPairBruteForce(int[] a, int k) {

        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {

                if (a[i] + a[j] == k) {

                    System.out.println(
                        "Pair found: " + a[i] + " and " + a[j]
                    );

                    return true;
                }
            }
        }

        System.out.println("Pair not found");

        return false;
    }


    public static void main(String[] args) {


        int[] a = {2, 4, 7, 11, 15, 20};

        int k = 18;


        System.out.println(Arrays.toString(a));

        findPairBruteForce(a, k);

    }
}