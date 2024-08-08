import java.util.Scanner;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sn.nextInt();
        }
        int target = sn.nextInt();
        System.out.println(orderAgnosticBS(arr, target));
        sn.close();
    }

    /* this method work on both case ascending and descending array */
    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
