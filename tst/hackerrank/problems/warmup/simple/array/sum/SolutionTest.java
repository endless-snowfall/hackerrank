package hackerrank.problems.warmup.simple.array.sum;

import static hackerrank.problems.common.TestUtils.*;

import org.junit.Test;

import hackerrank.problems.common.TestBase;
import hackerrank.problems.warmup.simple.array.sum.Solution;

public class SolutionTest extends TestBase {

    @Test
    public void test1() {
        System.setIn(mockInputStream("6 1 2 3 4 10 11"));
        Solution.main(new String[] {});
    }

    @Test
    public void test2() {
        System.setIn(mockInputStream("0 1 2 3 4 10 11"));
        Solution.main(new String[] {});
    }
}
