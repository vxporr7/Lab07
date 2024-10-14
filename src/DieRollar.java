import java.util.Random;
import java.util.Scanner;
public class DieRollar {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            int rollCount = 0;
            boolean triple = false;

            System.out.printf("%-5s %-5s %-5s %-5s %-5s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("----------------------------------------------------------");

            while (!triple) {
                rollCount++;
                int die1 = random.nextInt(6) + 1;
                int die2 = random.nextInt(6) + 1;
                int die3 = random.nextInt(6) + 1;
                int sum = die1 + die2 + die3;

                System.out.printf("%-5d %-5d %-5d %-5d %-5d%n", rollCount, die1, die2, die3, sum);

                if (die1 == die2 && die3 == die1) {
                    triple = true;
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = in.next().equalsIgnoreCase("yes");
        }

        in.close();
    }
}