import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two integers bigger than 100,000:");

        if (!scanner.hasNextBigInteger()) {
            System.out.println("Please only use numbers.");
            return;
        }
        BigInteger num1 = scanner.nextBigInteger();
        BigInteger limit = BigInteger.valueOf(100000);
        if (num1.compareTo(limit) < 0) {
            System.out.println("Invalid input. First number must be bigger than 100,000.");
            return;
        }

        if (!scanner.hasNextBigInteger()) {
            System.out.println("Please only use numbers.");
            return;
        }
        BigInteger num2 = scanner.nextBigInteger();
        if (num2.compareTo(limit) < 0) {
            System.out.println("Invalid input. Second number must be bigger than 100,000.");
            return;
        }

        Server server = new Server(num1, num2);
        System.out.println(server.toString());
    }
}
