public class SecondLargestElement20 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 15, 30}; // Input array
        
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != firstLargest) {
                secondLargest = arr[i];
            }
        }
        
        System.out.println("Second Largest Element: " + secondLargest);
    }
}