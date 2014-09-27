
/**
 * The RuleRunner interface.
 * @author rsoza
 */
interface RuleRunnerIface {
    /**
     * Run a set of rules against a sequence of integers.
     * @param ints
     * @param rules 
     */
    public boolean runRules(Iterable<Integer> ints, Iterable<Rule> rules);
    
}
