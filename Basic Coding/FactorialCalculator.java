import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        // Accepting the input number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculating the factorial
        long factorial = calculateFactorial(number);

        // Displaying the factorial
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    public static long calculateFactorial(int number) {
        long factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}