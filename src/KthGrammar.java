public class KthGrammar {


    public static void main(String[] args) {
        System.out.println(kthGrammar(4, 7));
    }

    public static int kthGrammar(int n, int k) {

        // bc pending
        if (n == 0) {
            return 0;
        }

        // hypothesis -> how to reduce n and k
        int x = (int) Math.pow(2, n-1)/2;
        if (k > x) {
            int a = kthGrammar(n-1, k - x);
            return a == 1 ? 0 : 1;
        }

        return kthGrammar(n-1, k);

        /*
            0
            1 0
            1 0 0 1
            1 0 0 1 0 1 1 0
         */

    }

}
