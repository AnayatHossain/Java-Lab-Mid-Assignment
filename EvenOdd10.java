import java.util.Scanner;

public class EvenOdd10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int result = (number % 2 == 0) ? 1 : 0;
        
        System.out.println("Result: " + result);
    }
}