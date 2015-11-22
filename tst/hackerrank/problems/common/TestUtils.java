package hackerrank.problems.common;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class TestUtils {

    public static InputStream mockInputStream(String input) {
        return new ByteArrayInputStream(input.getBytes());
    }
}
