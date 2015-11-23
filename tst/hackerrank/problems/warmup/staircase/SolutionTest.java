package hackerrank.problems.warmup.staircase;

import static hackerrank.problems.common.TestUtils.*;

import org.junit.Test;

import hackerrank.problems.common.TestBase;

public class SolutionTest extends TestBase {

    @Test
    public void test1() {
        System.setIn(mockInputStream("6"));
        Solution.main(new String[] {});
    }

    @Test
    public void test2() {
        System.setIn(mockInputStream("0"));
        Solution.main(new String[] {});
    }

    @Test
    public void test3() {
        System.setIn(mockInputStream("1"));
        Solution.main(new String[] {});
    }
}
