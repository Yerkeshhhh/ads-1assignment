
/*
@compute - recursively computes the binomial coefficient
n - size of set from which elements are chosen
k- number of elements being chosen
 */


public class Problem9 {

    public static int compute(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else if (k == 1 || k == n-1) {
            return n;
        } else {
            return compute(n-1, k-1) + compute(n-1, k);
        }
    }

    public static void main(String[] args) {
        int n = 2;
        int k = 1;
        int result = compute(n, k);
        System.out.println(result);
    }
}