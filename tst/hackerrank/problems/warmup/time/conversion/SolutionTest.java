package hackerrank.problems.warmup.time.conversion;

import static hackerrank.problems.common.TestUtils.*;

import org.junit.Test;

import hackerrank.problems.common.TestBase;

public class SolutionTest extends TestBase {

    @Test
    public void test1() {
        System.setIn(mockInputStream("12:00:00AM"));
        Solution.main(new String[] {});
    }

    @Test
    public void test2() {
        System.setIn(mockInputStream("07:00:00AM"));
        Solution.main(new String[] {});
    }

    @Test
    public void test3() {
        System.setIn(mockInputStream("07:05:45PM"));
        Solution.main(new String[] {});
    }

    @Test
    public void test4() {
        System.setIn(mockInputStream("12:00:00PM"));
        Solution.main(new String[] {});
    }
}
