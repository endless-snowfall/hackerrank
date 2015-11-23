package hackerrank.problems.warmup.solve.me.first;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            System.out.println(solveMeFirst(in.nextInt(), in.nextInt()));
        }
    }

    private static int solveMeFirst(int a, int b) {
        return a + b;
    }
}
