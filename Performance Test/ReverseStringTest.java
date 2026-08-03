public class ReverseStringTest {


    // Recursive Algorithm
    static String reverseRecursive(String s) {

        // Base Case
        if (s.length() <= 1) {
            return s;
        }


        // Recursive Case
        return reverseRecursive(s.substring(1))
                + s.charAt(0);
    }



    // Iterative Algorithm
    static String reverseIterative(String s) {


        String result = "";


        for (int i = s.length() - 1; i >= 0; i--) {

            result += s.charAt(i);

        }


        return result;
    }



    public static void main(String[] args) {


        int[] sizes = {
                100,
                1000,
                10000,
                100000
        };


        for (int n : sizes) {


            String data = "";


            for (int i = 0; i < n; i++) {

                data += "a";

            }


            long recursiveTime = 0;
            long iterativeTime = 0;



            for (int i = 0; i < 5; i++) {


                long start = System.nanoTime();

                reverseRecursive(data);

                long end = System.nanoTime();

                recursiveTime += end - start;



                start = System.nanoTime();

                reverseIterative(data);

                end = System.nanoTime();

                iterativeTime += end - start;

            }



            System.out.println("n = " + n);

            System.out.println(
                    "Recursive Average : "
                    + recursiveTime / 5
                    + " ns"
            );


            System.out.println(
                    "Iterative Average : "
                    + iterativeTime / 5
                    + " ns"
            );


            System.out.println("----------------------");

        }
    }
}