
import java.math.BigInteger;

/**
 * A rule that succeeds if two consecutive integers exceed a difference
 * threshold.
 *
 * @author rsoza
 */
public class RuleB implements Rule {

    /**
     * The difference threshold for two consecutive integers s a, b. If b-a >=
     * DIFF_THRESHOLD, then the rule will succeed. We use BigInteger to avoid
     * overflow in the calculation of the difference between successive integers.
     */
    static private final BigInteger DIFF_THRESHOLD = BigInteger.valueOf(500);

    /**
     * The name of the rule.
     */
    @Override
    public String getName() {
        return "RuleB";
    }

    /**
     * Run the rule. Returns true if any integer is at least DIFF_THRESHOLD (defined
     * to be 500) greater than the previous integer.
     */
    @Override
    public boolean run(Iterable<Integer> ints) {
        boolean first = true;
        BigInteger prev = BigInteger.ZERO;

        for (int i : ints) {
            if (!first) {
                BigInteger curr = BigInteger.valueOf(i);
                if (curr.subtract(prev).compareTo(DIFF_THRESHOLD) >= 0) {
                    return true;
                }
            } else {
                first = false;
            }
            prev = BigInteger.valueOf(i);
        }

        // We never met the requirement.
        return false;
    }
}
