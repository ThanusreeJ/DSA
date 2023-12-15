public class Thanusree5 {
    

        public static void rotateRight(int[] arr, int k) {
            int n = arr.length;
    

            k = k % n;
    
            
            reverse(arr, n - k, n - 1);
    
            
            reverse(arr, 0, n - k - 1);
    
            
            reverse(arr, 0, n - 1);
        }
    
        private static void reverse(int[] arr, int start, int end) {
            while (start < end) {
                
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
    
                
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
            int k = 2; // Number of positions to rotate
    
            System.out.print("Original array: ");
            printArray(array);
    
            rotateRight(array, k);
    
            System.out.print("Rotated array: ");
            printArray(array);
        }
    }
    
    

