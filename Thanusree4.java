public class Thanusree4  {

    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move towards the center
            start++;
            end--;
        }
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.print("Original array: ");
        printArray(array);

        reverse(array);

        System.out.print("Reversed array: ");
        printArray(array);
    }
}

    

