import java.util.Scanner;

public class BinarySearch {
    public static void main(String args[]) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sn.nextInt();
        }
        int target = sn.nextInt();
        System.out.println(search(arr, target));
        sn.close();
    }

    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}