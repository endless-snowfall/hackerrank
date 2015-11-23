package hackerrank.problems.warmup.a.very.big.sum;

import static hackerrank.problems.common.TestUtils.*;

import org.junit.Test;

import hackerrank.problems.common.TestBase;
import hackerrank.problems.warmup.a.very.big.sum.Solution;

public class SolutionTest extends TestBase {

    @Test
    public void test1() {
        System.setIn(mockInputStream("5 1000000001 1000000002 1000000003 1000000004 1000000005"));
        Solution.main(new String[] {});
    }
}
