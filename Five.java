import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String number = scanner.nextLine();

        if (number.length() % 2 != 0) {
            System.out.println("The number must have an even number of digits.");
            return;
        }

        int halfLength = number.length() / 2;
        int sumFirstHalf = 0;
        int sumSecondHalf = 0;

        for (int i = 0; i < halfLength; i++) {
            sumFirstHalf += Character.getNumericValue(number.charAt(i));
        }

        for (int i = halfLength; i < number.length(); i++) {
            sumSecondHalf += Character.getNumericValue(number.charAt(i));
        }

        if (sumFirstHalf == sumSecondHalf) {
            System.out.println("Yes, the sums of both halves are equal.");
        } else {
            System.out.println("No, the sums of both halves are not equal.");
        }

    }
}
