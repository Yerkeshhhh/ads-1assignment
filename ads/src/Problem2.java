import java.util.Scanner;

public class Problem2 {
    public static double average(int[] arr, int n) {
        if (n == 0) {
            return 0;
        } else {
            return (arr[n-1] + (n-1) * average(arr, n-1)) / n;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        double avg = average(arr, arr.length);
        System.out.println("The average of the array is: " + avg);
    }
}