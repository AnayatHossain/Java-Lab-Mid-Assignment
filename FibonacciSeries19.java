public class FibonacciSeries19 {
    public static void main(String[] args) {
        int n = 10; // Specify the number of terms in the Fibonacci series
        int a = 0, b = 1;
        
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}