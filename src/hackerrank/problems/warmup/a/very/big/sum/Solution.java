package hackerrank.problems.warmup.a.very.big.sum;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            int[] elements = parseIntegerArray(in);
            System.out.println(Arrays.stream(elements).mapToLong(i -> i).sum());
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
}
