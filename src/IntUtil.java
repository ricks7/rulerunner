
import java.math.BigInteger;

/**
 * Arithmetic utilities.
 */
public class IntUtil {
    private static final int ZERO = 0;

    /**
     * Take a sequence of integers and return the arithmetic integer
     * mean. This is the floor of the arithmetic mean.
     *
     * @param ints - a sequence of Integers.
     * @return the floor of the mean or zero if the sequence is empty.
     */
    public static Integer arithmeticMean(Iterable<Integer> ints) {
        if (!ints.iterator().hasNext()) {
            return 0;
        } else {
            boolean first = true;
            BigInteger sum = BigInteger.ZERO;
            BigInteger n = BigInteger.ZERO;
            for (int i : ints) {
                sum = sum.add(BigInteger.valueOf(i));
                n = n.add(BigInteger.valueOf(1));
            }

            if (n.compareTo(BigInteger.ZERO) > ZERO) {
                return sum.divide(n).intValue();
            } else {
                return ZERO;
            }
        }
    }
}
