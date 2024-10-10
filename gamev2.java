import java.util.Scanner;

public class gamev2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the number of slots
        System.out.print("Enter the number of slots: ");
        int numOfSlots = scanner.nextInt();

        // Ask for the number of balls
        System.out.print("Enter the number of balls: ");
        int numOfBalls = scanner.nextInt();

        int[] slots = new int[numOfSlots];

        // Drop the balls into the slots
        for (int i = 0; i < numOfBalls; i++) {
            int defaultPos = 0; // Start at the first slot (0 index)
            for (int j = 0; j < numOfSlots - 1; j++) {
                if (Math.random() < 0.5) {
                    System.out.print("L"); // Move left
                } else {
                    System.out.print("R"); // Move right
                    defaultPos++; // Increase position
                }
            }
            System.out.println("");
            slots[defaultPos] += 1; // Increment the slot where the ball landed
        }

        // Print the slots
        int numOfRows = numOfBalls; // Start with the total number of balls
        for (int i = 0; i < numOfBalls; i++) {
            for (int j = 0; j < numOfSlots; j++) {
                if (slots[j] >= numOfRows) {
                    System.out.print("0"); // Represent a ball in the slot
                } else {
                    System.out.print(" "); // Empty space
                }
            }
            numOfRows--;
            System.out.println();
        }

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
