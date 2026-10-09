import java.util.Scanner;

public class AgeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age >= 17) {
            System.out.println("Eligible for an ID card");
        } else {
            System.out.println("Not eligible for an ID card");
        }
    }
}
