import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] candidates = {"A", "B", "C", "D", "E"};
        int[] scores = new int[5];

        System.out.print("Enter number of voters: ");
        int numberOfVoters = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfVoters; i++) {
            System.out.println("Voter " + (i + 1) + ":");
            System.out.println("Enter your preference order (B C E A D):");

            String[] preferences = scanner.nextLine().split(" ");

            for (int j = 0; j < preferences.length; j++) {
                for (int k = 0; k < candidates.length; k++) {
                    if (preferences[j].equalsIgnoreCase(candidates[k])) {
                        scores[k] += 5 - j;
                    }
                }
            }
        }

        System.out.println("\nFinal Results:");
        for (int i = 0; i < candidates.length; i++) {
            System.out.println("Candidate " + candidates[i] + ": " + scores[i] + " points");
        }

        int maxScore = -1;
        String winner = "";
        for (int i = 0; i < candidates.length; i++) {
            if (scores[i] > maxScore) {
                maxScore = scores[i];
                winner = candidates[i];
            }
        }

        System.out.println("\nWinner: Candidate " + winner);
    }
}
