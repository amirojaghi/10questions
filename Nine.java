import java.util.Scanner;

public class Nine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] votes = new int[6];
        int totalVoters = 5;

        System.out.println("Welcome to the Voting System!");
        System.out.println("Candids are numbered from 1 to 5.");
        System.out.println("Enter 0 for a blank vote.\n");

        for (int i = 1; i <= totalVoters; i++) {
            System.out.print("Voter #" + i + ", enter your vote (0-5): ");
            int vote = scanner.nextInt();

            while (vote < 0 || vote > 5) {
                System.out.print("Invalid vote. Please enter a number between 0 and 5: ");
                vote = scanner.nextInt();
            }

            votes[vote]++;
        }

        System.out.println("\n--- Voting Results ---");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Candid " + i + ": " + votes[i] + " votes");
        }
        System.out.println("Blank votes: " + votes[0]);

    }
}
