
import java.util.Scanner;

public class GradeCategoryL2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your score: ");
        int score = input.nextInt();

        if (score >= 80 && score <= 100) {
            System.out.println("Grade A");
        } else if (score >= 70) {
            System.out.println("Grade B");
        } else if (score >= 60) {
            System.out.println("Grade C");
        } else if (score >= 50) {
            System.out.println("Grade D");
        } else if (score >= 0) {
            System.out.println("Grade E");
        } else {
            System.out.println("Invalid score");
        }

        input.close();
    }
}
