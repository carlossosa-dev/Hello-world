public class Fibonacci {

    // Recursive method to return the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Main method to test the Fibonacci function
    public static void main(String[] args) {
        int n = 10;  // we need the 10th term
        int result = fibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
    }
}
