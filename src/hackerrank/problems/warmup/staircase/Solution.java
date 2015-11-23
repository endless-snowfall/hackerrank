package hackerrank.problems.warmup.staircase;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Solution {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int numLines = in.nextInt();
            if (numLines == 0) {
                return;
            }
            StringBuilder builder = new StringBuilder();
            IntStream.rangeClosed(1, numLines).forEach(i -> printStair(i, numLines, builder));
        }
    }

    private static void printStair(int n, int total, StringBuilder builder) {
        for (int i = 0; i < total - n; i++) {
            builder.append(' ');
        }
        for (int i = 0; i < n; i++) {
            builder.append('#');
        }
        System.out.println(builder.toString());
        builder.setLength(0);
    }
}
