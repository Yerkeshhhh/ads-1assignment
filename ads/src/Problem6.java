public class Problem6 {
    public static void main(String[] args) {
        int a = 2;
        int n = 5;
        System.out.println(a + "^" + n + " = " + power(a, n));
    }
    public static int power(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            return a * power(a, n - 1);
        }
    }
}