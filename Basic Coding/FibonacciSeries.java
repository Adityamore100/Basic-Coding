public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 8;
        System.out.println("Fibonacci series up to " + n + " elements:");

        int first = 1;
        int second = 1;

        System.out.print(first + " " + second + " ");

        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(next + " ");

            first = second;
            second = next;
        }
    }
}