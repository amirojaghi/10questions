import java.util.Arrays;
import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the arrays: ");
        int size = scanner.nextInt();

        int[] array1 = new int[size];
        int[] array2 = new int[size];

        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < size; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < size; i++) {
            array2[i] = scanner.nextInt();
        }

        Arrays.sort(array1);
        Arrays.sort(array2);

        boolean isEqual = Arrays.equals(array1, array2);

        if (isEqual) {
            System.out.println("The arrays contain the same elements.");
        } else {
            System.out.println("The arrays do Not contain the same elements.");
        }

    }
}
