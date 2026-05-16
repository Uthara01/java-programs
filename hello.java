import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        int number, originalNumber, remainder, result = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = sc.nextInt();

        originalNumber = number;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result = result + (remainder * remainder * remainder);
            originalNumber = originalNumber / 10;
        }

        if (result == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        sc.close();
    }
}

So, 153 is an Armstrong number.

Meet Codex
