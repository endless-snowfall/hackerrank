package hackerrank.problems.warmup.diagonal.difference;

import static hackerrank.problems.common.TestUtils.*;

import org.junit.Test;

import hackerrank.problems.common.TestBase;
import hackerrank.problems.warmup.diagonal.difference.Solution;

public class SolutionTest extends TestBase {

    @Test
    public void test1() {
        System.setIn(mockInputStream("3 11 2 4 4 5 6 10 8 -12"));
        Solution.main(new String[] {});
    }
}
