import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[2];

        for (int i = 0; i < 2; i++) {
            System.out.println("Give me a number.");
            if (scanner.hasNextInt()) {
                numbers[i] = scanner.nextInt();
            } else {
                System.out.println("That isn't a proper number.");
                System.exit(0);
            }
        }

        if (numbers[0] > numbers[1]) {
            System.out.println(numbers[0] + " is greater than " + numbers[1]);
        } else if (numbers[0] < numbers[1]) {
            System.out.println(numbers[0] + " is less than " + numbers[1]);
        } else {
            System.out.println(numbers[0] + " is equal to " + numbers[1]);
        }
    }
}