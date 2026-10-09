import java.util.Scanner;

public class LoginAccountStatusL3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = input.nextLine();

        System.out.print("Enter password: ");
        String password = input.nextLine();

        System.out.print("Is the account active? (true/false): ");
        boolean isActive = input.nextBoolean();

        if (!username.equals("admin") ||
            !password.equals("12345")) {
            System.out.println("Invalid username or password");
        } else if (!isActive) {
            System.out.println("Account inactive");
        } else {
            System.out.println("Login successful");
        }

        input.close();
    }
}
