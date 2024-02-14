import java.io.Console;

public class PasswordInput7 {

    public static void main(String[] args) {
        Console console = System.console();
        if (console == null) {
            System.out.println("Console is not available. Exiting...");
            System.exit(1);
        }

        char[] passwordArray = console.readPassword("Enter your password: ");
        String password = new String(passwordArray);

        System.out.println("Your password is: " + password);
    }
}