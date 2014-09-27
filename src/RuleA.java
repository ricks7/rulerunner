
import java.math.BigInteger;

/**
 * A rule that succeeds if some consecutive pair of integers sum to 1000 or
 * more.
 *
 * @author rsoza
 */
public class RuleA implements Rule {

    /**
     * The sum threshold. If any two consecutive integers a and b satisfy b+a >=
     * SUM_THRESHOLD, then the rule will succeed. We use BigInteger to avoid
     * overflow in the calculation of the difference between successive
     * integers.
     */
    static private final BigInteger SUM_THRESHOLD = BigInteger.valueOf(1000);

    /**
     * The name of the rule.
     */
    @Override
    public String getName() {
        return "RuleA";
    }

    /**
     * Run the rule. This rule returns false if no two successive ints sum to
     * SUM_THRESHOLD (currently defined as 1000) or greater.
     */
    @Override
    public boolean run(Iterable<Integer> ints) {
        boolean first = true;
        BigInteger prev = BigInteger.ZERO;

        for (int i : ints) {
            BigInteger curr = BigInteger.valueOf(i);
            if (!first) {
                if (prev.add(curr).compareTo(SUM_THRESHOLD) >= 0) {
                    return true;
                }
            } else {
                first = false;
            }
            prev = curr;
        }

        // We iterated through all integers and never met our
        // requirement.
        return false;
    }
}
