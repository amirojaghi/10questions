import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the first value (x): ");
        int x = scanner.nextInt();
        System.out.print("Enter the second value (y): ");
        int y = scanner.nextInt();

        int minDistance = Integer.MAX_VALUE;
        int lastIndexX = -1;
        int lastIndexY = -1;

        for (int i = 0; i < size; i++) {
            if (array[i] == x) {
                lastIndexX = i;
                if (lastIndexY != -1) {
                    int distance = Math.abs(lastIndexX - lastIndexY);
                    if (distance < minDistance) {
                        minDistance = distance;
                    }
                }
            } else if (array[i] == y) {
                lastIndexY = i;
                if (lastIndexX != -1) {
                    int distance = Math.abs(lastIndexX - lastIndexY);
                    if (distance < minDistance) {
                        minDistance = distance;
                    }
                }
            }
        }

        if (minDistance == Integer.MAX_VALUE) {
            System.out.println("Either one or both values are not present in the array.");
        } else {
            System.out.println("Minimum distance between " + x + " and " + y + " is: " + minDistance);
        }

        scanner.close();
    }
}
