import java.math.BigInteger;

public class Server {
    private final BigInteger num1;
    private final BigInteger num2;

    public Server(BigInteger num1, BigInteger num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public String insertCommas(String str) {
        if (str.length() <= 3) {
            return str;
        }
        int remainder = str.length() % 3;
        String firstPart = remainder == 0 ? "" : str.substring(0, remainder);
        String secondPart = str.substring(remainder);
        String[] groups = secondPart.split("(?<=\\G.{3})");
        return (firstPart.isEmpty() ? "" : firstPart + ",") + String.join(",", groups);
    }

    public String formatNumber(BigInteger num) {
        String str = num.toString();
        return insertCommas(str);
    }

    @Override
    public String toString() {
        BigInteger gcdValue = num1.gcd(num2);
        String gcdWithCommas = formatNumber(gcdValue);
        return "GCD of " + formatNumber(num1) + " and " + formatNumber(num2) + " is: " + gcdWithCommas;
    }
}
