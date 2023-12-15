public class Thanusree6 {

        public static void findMaxSubarray(int[] arr) {
            int n = arr.length;
            int maxEndingHere = arr[0];
            int maxSoFar = arr[0];
            int start = 0;
            int end = 0;
            int tempStart = 0;
    
            for (int i = 1; i < n; i++) {
                if (arr[i] > maxEndingHere + arr[i]) {
                    maxEndingHere = arr[i];
                    tempStart = i;
                } else {
                    maxEndingHere = maxEndingHere + arr[i];
                }
    
                if (maxEndingHere > maxSoFar) {
                    maxSoFar = maxEndingHere;
                    start = tempStart;
                    end = i;
                }
            }
    
            System.out.println("Maximum Subarray Sum: " + maxSoFar);
            System.out.println("Start Index: " + start);
            System.out.println("End Index: " + end);
        }
    
        public static void main(String[] args) {
            int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
            findMaxSubarray(array);
        }
    }
    

