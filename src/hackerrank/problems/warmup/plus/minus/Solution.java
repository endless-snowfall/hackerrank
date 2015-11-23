package hackerrank.problems.warmup.plus.minus;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int[] elements = parseIntegerArray(in);

            if (elements.length == 0) {
                System.out.println(0);
                System.out.println(0);
                System.out.println(0);
                return;
            }

            Map<Integer, Long> groupBySign = Arrays.stream(elements).boxed()
                .collect(Collectors.groupingBy(i -> (int) Math.signum(i), Collectors.counting()));

            System.out.println(divideAndFormat(groupBySign.get(1), elements.length));
            System.out.println(divideAndFormat(groupBySign.get(-1), elements.length));
            System.out.println(divideAndFormat(groupBySign.get(0), elements.length));
        }
    }

    private static int[] parseIntegerArray(Scanner in) {
        int numElements = in.nextInt();
        int[] result = new int[numElements];

        for (int i = 0; i < numElements; i++) {
            result[i] = in.nextInt();
        }

        return result;
    }

    private static String divideAndFormat(Long divisor, int dividend) {
        if (divisor == null) {
            return "0";
        }
        return String.format("%.3f", (double) divisor / dividend);
    }
}
