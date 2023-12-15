public class Thanusree3 {

    public static void findMaxMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        int n = arr.length;
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }

    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        findMaxMin(array);
    }
}
