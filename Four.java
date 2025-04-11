import java.util.Random;

public class Four {
    public static void main(String[] args) {
        Random random = new Random();

        int heads = 0;
        int tails = 0;

        for (int i = 0; i < 1000; i++) {
            int result = random.nextInt(10);

            if (result < 5) {
                heads++;
            } else {
                tails++;
            }
        }

        double headsPercentage = (heads / 1000.0) * 100;
        double tailsPercentage = (tails / 1000.0) * 100;

        System.out.println("Heads: " + heads + " times (" + headsPercentage + "%)");
        System.out.println("Tails: " + tails + " times (" + tailsPercentage + "%)");
    }
}
