import java.math.BigInteger;

public class FibonacciCalculator {

    public BigInteger getNthTerm(int n) {

        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("1");

        for(int i = 0; i < n; i++) {
            a = a.add(b);
            b = a.equals(0) ? b : a.subtract(b);
        }

        return a;

    }

}
