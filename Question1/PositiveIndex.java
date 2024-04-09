public class PositiveIndex {
    public static int findIndex(int[] arr) {
        int low = 0;
        int high = 1;
        while (arr[high] != -1) {
            low = high;
            high *= 2;
        }

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == -1) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return high + 1;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 4, 1, 2, 7, 8, 20, 33, -1, -1, -1, -1};
        int[] arr2 = {-1, -1, -1, -1};

        System.out.println(findIndex(arr1)); // Output: 8
        System.out.println(findIndex(arr2)); // Output: 0
    }
}
