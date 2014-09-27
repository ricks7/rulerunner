
/**
 * A rule that succeeds if the average of all integers exceed a threshold.
 *
 * @author rsoza
 */
public class RuleC implements Rule {

    /**
     * If the average of all ints is >= AVG_THRESHOLD, the rule passes,
     * otherwise the rule fails.
     */
    static private final int AVG_THRESHOLD = 500;

    /**
     * The name of the rule.
     */
    @Override
    public String getName() {
        return "RuleC";
    }

    /**
     * Run the rule. This rule returns true if the average of all the integers
     * in the sequence is 500 or greater.
     */
    @Override
    public boolean run(Iterable<Integer> ints) {
        return (IntUtil.arithmeticMean(ints) >= AVG_THRESHOLD);
    }
}
