import java.util.Scanner;

public class Comparator {

    // Scanner reader method
    protected static int enterNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        // Initiate variables
        int firstNumber = enterNumber();
        int secondNumber = enterNumber();
        int thirdNumber = enterNumber();
        int fourthNumber = enterNumber();

        // Sum pairs of numbers
        int firstPairSum = firstNumber + secondNumber;
        System.out.println(firstPairSum);

        int secondPairSum = thirdNumber + fourthNumber;
        System.out.println(secondPairSum);

        // Compare sums first time

        System.out.println(firstPairSum < secondPairSum);

        // Change sums
        firstPairSum += 1;
        System.out.println(firstPairSum);

        secondPairSum -= 2;
        System.out.println(secondPairSum);

        // Compare sums second time
        System.out.println(firstPairSum > secondPairSum);

        // Check if sum is even
        System.out.println(firstPairSum % 2 == 0 || secondPairSum % 2 == 0);
    }
}