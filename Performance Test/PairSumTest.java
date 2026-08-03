public class PairSumTest {



    // Brute Force O(n²)
    static boolean findPairBruteForce(int[] a, int k) {


        for (int i = 0; i < a.length; i++) {


            for (int j = i + 1; j < a.length; j++) {


                if (a[i] + a[j] == k) {

                    return true;

                }
            }
        }


        return false;
    }



    // Two Pointer O(n)
    static boolean findPairTwoPointer(int[] a, int k) {


        int left = 0;

        int right = a.length - 1;



        while (left < right) {


            int sum = a[left] + a[right];


            if (sum == k) {

                return true;

            }
            else if (sum < k) {

                left++;

            }
            else {

                right--;

            }

        }


        return false;
    }



    // Binary Search O(n log n)
    static boolean findPairBinarySearch(int[] a, int k) {


        for (int i = 0; i < a.length; i++) {


            int target = k - a[i];


            int left = i + 1;

            int right = a.length - 1;



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
        }


        return false;
    }




    public static void main(String[] args) {


        int[] sizes = {
                100,
                1000,
                10000,
                100000
        };



        for (int n : sizes) {


            int[] data = new int[n];


            for (int i = 0; i < n; i++) {

                data[i] = i * 2;

            }


            int k = data[n - 1] + data[n - 2];



            long brute = 0;

            long twoPointer = 0;

            long binary = 0;



            for (int i = 0; i < 5; i++) {



                long start = System.nanoTime();

                findPairBruteForce(data, k);

                long end = System.nanoTime();

                brute += end - start;




                start = System.nanoTime();

                findPairTwoPointer(data, k);

                end = System.nanoTime();

                twoPointer += end - start;




                start = System.nanoTime();

                findPairBinarySearch(data, k);

                end = System.nanoTime();

                binary += end - start;

            }



            System.out.println("n = " + n);


            System.out.println(
                    "Brute Force : "
                    + brute / 5
                    + " ns"
            );


            System.out.println(
                    "Two Pointer : "
                    + twoPointer / 5
                    + " ns"
            );


            System.out.println(
                    "Binary Search : "
                    + binary / 5
                    + " ns"
            );


            System.out.println("----------------------");

        }
    }
}