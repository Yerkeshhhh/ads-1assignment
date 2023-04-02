public class Problem1 {
    public static int findMin(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        int min = findMin(arr, n - 1);
        if (arr[n - 1] < min) {
            min = arr[n - 1];
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {10, 1, 32, 3, 45};
        int n = arr.length;
        int min = findMin(arr, n);
        System.out.println(min);
    }
}