package hackerrank.problems.warmup.plus.minus;

import static hackerrank.problems.common.TestUtils.*;

import org.junit.Test;

import hackerrank.problems.common.TestBase;
import hackerrank.problems.warmup.plus.minus.Solution;

public class SolutionTest extends TestBase {

    @Test
    public void test1() {
        System.setIn(mockInputStream("6 -4 3 -9 0 4 1"));
        Solution.main(new String[] {});
    }

    @Test
    public void test2() {
        System.setIn(mockInputStream("5 -4 3 -9 4 1"));
        Solution.main(new String[] {});
    }

    @Test
    public void test3() {
        System.setIn(mockInputStream("0"));
        Solution.main(new String[] {});
    }
}
