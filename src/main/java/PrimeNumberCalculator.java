import java.util.ArrayList;
import java.util.List;

public class PrimeNumberCalculator {

    public List<Integer> getPrimes(int max) {

        final List<Integer> primes = new ArrayList<>();

        if (max > 1) {
            primes.add(2);
            for (int i = 3; i - 1 < max; i = i + 2) {
                if (!isDivisibleByAny(i, primes)) {
                    primes.add(i);
                }
            }
        }

        return primes;

    }

    private boolean isDivisibleByAny(int candidate, List<Integer> ints) {

        for (int currentInt : ints) {
            if (candidate % currentInt == 0) {
                return true;
            }
        }

        return false;

    }

}
