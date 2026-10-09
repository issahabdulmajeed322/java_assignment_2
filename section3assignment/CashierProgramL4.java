import java.util.Scanner;

public class CashierProgramL4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter total purchase: Rp");
        double totalPurchase = input.nextDouble();

        System.out.print("Are you a member? (true/false): ");
        boolean isMember = input.nextBoolean();

        double discount = 0;

        if (isMember) {
            discount = totalPurchase * 0.10;
        }

        double finalAmount = totalPurchase - discount;

        System.out.print("Enter payment: Rp");
        double payment = input.nextDouble();

        if (payment < finalAmount) {
            System.out.println("Insufficient payment");
        } else {
            double change = payment - finalAmount;

            System.out.println("Discount: Rp" + discount);
            System.out.println("Final amount: Rp" + finalAmount);
            System.out.println("Change: Rp" + change);
        }

        input.close();
    }
}