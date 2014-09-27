/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jks
 */
public class RuleRunnerTest {

    public RuleRunnerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of runRules method, of class RuleRunner.
     */
    @Test
    public void testRunRules() {
    }

    /**
     * Test of main method, of class RuleRunner.
     */
    @Test
    public void testMain() {
        /* Here we test the main function.  These are not real automated test
         * cases because they will not actually fail.  We visually examine the
         * output.  In a real application, we would use assertions.
         */
        System.out.println("Testing main()");

        // This test should pass (from the requirements).
        String[] args = {"100", "50", "30", "50", "60", "20", "5000"};
        RuleRunner.main(args);

        // The following tests should fail.
        // Rule A should fail, B should pass, C should fail.
        String[] args2 = {"100", "50", "30", "530"};
        RuleRunner.main(args2);

        // This test should cause all 3 to fail.
        String[] args3 = {"100", "50", "30", "529"};
        RuleRunner.main(args3);
    }

}
