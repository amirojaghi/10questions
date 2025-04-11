import java.util.Scanner;
import java.util.Stack;

public class three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string containing (), {}, []: ");
        String input = scanner.nextLine();

        if (isValidBrackets(input)) {
            System.out.println("The bracket order is correct.");
        } else {
            System.out.println("The bracket order is incorrect.");
        }

        scanner.close();
    }

    public static boolean isValidBrackets(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}
