package hackerrank.problems.warmup.solve.me.first;

import static hackerrank.problems.common.TestUtils.*;

import org.junit.Test;

import hackerrank.problems.common.TestBase;
import hackerrank.problems.warmup.solve.me.first.Solution;

public class SolutionTest extends TestBase {

    @Test
    public void test1() {
        System.setIn(mockInputStream("1 2"));
        Solution.main(new String[] {});
    }
}
