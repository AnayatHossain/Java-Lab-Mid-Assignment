import java.util.Scanner;

public class Sum4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int number = scanner.nextInt();
        
        int sum = 0;
        int temp = number;
        
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        
        System.out.println("The sum of the digits is: " + sum);
    }
}