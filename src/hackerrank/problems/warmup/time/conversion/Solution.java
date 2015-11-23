package hackerrank.problems.warmup.time.conversion;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String input = in.next();
            String[] tokens = input.split(":");

            boolean isPM = input.endsWith("PM");
            Integer hours = Integer.valueOf(tokens[0]);
            String minutes = tokens[1];
            String seconds = tokens[2].substring(0, 2);

            formatAndPrintTime(hours % 12 + ((isPM) ? 12 : 0), minutes, seconds);
        }
    }

    private static void formatAndPrintTime(int hour, String minute, String second) {
        System.out.println(String.format("%02d:%s:%s", hour, minute, second));
    }
}
