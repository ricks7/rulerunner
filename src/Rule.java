/**
 * Rule interface for named rules that run on a sequence of integers.
 */
interface Rule {
     /**
      * The name of the rule.
      * 
      * @return the name of the rule, a string.
      */
     public String getName();

     /**
      * Run the rule against a sequence of integers.
      * 
      * @param ints - the sequence of integers fed to the rule.
      * @return true on pass, false on fail.
      */
     boolean run(Iterable<Integer> ints);
}
