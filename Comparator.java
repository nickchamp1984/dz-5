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

        boolean trueStatement = true;
        boolean falseStatement = false;

        // Sum pairs of numbers
        int firstPairSum = firstNumber + secondNumber;
        System.out.println(firstPairSum);

        int secondPairSum = thirdNumber + fourthNumber;
        System.out.println(secondPairSum);

        // Compare sums first time
        if(firstPairSum < secondPairSum) {
            System.out.println(trueStatement);
        }

        // Change sums
        int changedFirstPairSum = firstPairSum+=1;
        System.out.println(changedFirstPairSum);
        int changedSecondPairSum = secondPairSum-=2;
        System.out.println(changedSecondPairSum);

        // Compare sums second time
        if (changedFirstPairSum > changedSecondPairSum) {
            System.out.println(trueStatement);
        }

        // Check if sum is even
        if (changedFirstPairSum%2 == 0 || changedSecondPairSum%2 == 0) {
            System.out.println(trueStatement);
        } else {
            System.out.println(falseStatement);
        }
    }
}