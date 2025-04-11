import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements:");
        int size = scanner.nextInt();

        int[] input = new int[size];
        int[] frequency = new int[size];

        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            input[i] = scanner.nextInt();
            frequency[i] = -1; // Initialize all frequencies as -1
        }

        for (int i = 0; i < size; i++) {
            if (frequency[i] == -1) {
                int count = 1;
                for (int j = i + 1; j < size; j++) {
                    if (input[i] == input[j]) {
                        count++;
                        frequency[j] = 0; // Mark duplicates
                    }
                }
                frequency[i] = count;
            }
        }

        System.out.println("\nFrequency of each element:");
        for (int i = 0; i < size; i++) {
            if (frequency[i] != 0) {
                System.out.println(input[i] + " occurs " + frequency[i] + " times");
            }
        }

    }
}

