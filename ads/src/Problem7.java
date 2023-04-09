
/*
@reverse - it reverses the elements of array in order
@reverseHelper - it is helper function that helps to the @reverse function to reverse
arr - array
start - starting index that represents the beginning
end - ending index that represents the ending
 */

public class Problem7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr);
        System.out.println("Reversed array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    public static void reverse(int[] arr) {
        reverseHelper(arr, 0, arr.length - 1);
    }
    public static void reverseHelper(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseHelper(arr, start + 1, end - 1);
    }
}