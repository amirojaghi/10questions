import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first large number: ");
        String num1 = scanner.nextLine();

        System.out.print("Enter the second large number: ");
        String num2 = scanner.nextLine();

        int lengthDiff = Math.abs(num1.length() - num2.length());
        if (num1.length() < num2.length()) {
            num1 = "0".repeat(lengthDiff) + num1;
        } else if (num2.length() < num1.length()) {
            num2 = "0".repeat(lengthDiff) + num2;
        }

        StringBuilder result = new StringBuilder();
        int carry = 0;

        for (int i = num1.length() - 1; i >= 0; i--) {
            int digit1 = num1.charAt(i) - '0';
            int digit2 = num2.charAt(i) - '0';
            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            result.insert(0, sum % 10);
        }

        if (carry > 0) {
            result.insert(0, carry);
        }

        System.out.println("Sum: " + result.toString());
        scanner.close();


    }
}