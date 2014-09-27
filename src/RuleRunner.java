
import java.util.ArrayList;

/**
 * Run a set of rules against a sequence of integers.
 *
 * A RuleRunner implements an interface to run a given set of rules against a
 * sequence of integers . What the runner does with the rules is completely
 * defined by the particular instance. Here we give individual status of each
 * rule on standard output and exit 0 on success or 1 on failure.
 *
 * @author rsoza
 */
public class RuleRunner implements RuleRunnerIface {

    /**
     * Run each rule. For each rule, indicate status on standard output.
     *
     * @param ints
     * @param rules
     */
    @Override
    public boolean runRules(Iterable<Integer> ints, Iterable<Rule> rules) {
        boolean exitStatus = true;

        for (Rule rule : rules) {
            String status;
            // Each rule returns true on success or false on
            // failure.  On failure, we set exitStatus to 1.
            if (!rule.run(ints)) {
                status = "failed";
                exitStatus = false;
            } else {
                status = "passed";
            }

            String statStr
                    = String.format("Rule %s %s.", rule.getName(), status);

            System.out.println(statStr);
        }

        return exitStatus;
    }

    /**
     * Convert an array of Strings to a collection integers.
     */
    private static Iterable<Integer> strsToInts(final String[] args) {
        ArrayList<Integer> r;
        r = new ArrayList();
        for (String s : args) {
            r.add(Integer.parseInt(s));
        }
        return r;
    }

    /**
     * A private function to return the current rule set.
     *
     * We implement it as a separate function for reasons of modularity. There
     * are two important sets of behavior grouped together in our current
     * implementation: determining which rules to run (getRules), and
     * determining what to do when the rules are run (runRules). These behaviors
     * may be something to be separated in the future. We plan for that
     * possibility by making it a separate function, but we don't go as far as
     * to create a separate class because we don't know yet that this will
     * actually be necessary. Our first version simply gathers all known rules
     * into a list and returns them. As new rules are added, we add them here.
     * If more flexibility is required, this can be turned into a more dynamic
     * or configuration-driven mechanism, but our simple approach meets current
     * requirements.
     */
    private Iterable<Rule> getRules() {
        ArrayList<Rule> rules;
        rules = new ArrayList();
        rules.add(new RuleA());
        rules.add(new RuleB());
        rules.add(new RuleC());
        return rules;
    }

    public static void main(final String[] args) {
        // The requirements specify that rules run against a
        // sequence of integers.  We convert the list of strings on
        // the command line into a list of integers that we will
        // pass to each rule.
        RuleRunner runner = new RuleRunner();

        Iterable<Integer> ints = strsToInts(args);
        Iterable<Rule> rules = runner.getRules();

        // In the future we may want to exit with a status code, but this causes
        // issues with JUnit tests and the specification does not call for it.
        runner.runRules(ints, rules);
    }
}
