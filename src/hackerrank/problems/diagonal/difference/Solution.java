package hackerrank.problems.diagonal.difference;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int[][] matrix = parseMatrix(in);
            int mainDiagonalSum = getDiagonalSum(matrix, true);
            int secondaryDiagonalSum = getDiagonalSum(matrix, false);
            System.out.println(Math.abs(mainDiagonalSum - secondaryDiagonalSum));
        }
    }

    private static int[][] parseMatrix(Scanner in) {
        int dimension = in.nextInt();
        int[][] result = new int[dimension][dimension];

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                result[i][j] = in.nextInt();
            }
        }

        return result;
    }

    private static int getDiagonalSum(int[][] matrix, boolean isMain) {
        int result = 0;
        if (isMain) {
            for (int i = 0; i < matrix.length; i++) {
                result += matrix[i][i];
            }
        } else {
            for (int i = matrix.length - 1; i >= 0; i--) {
                result += matrix[i][matrix.length - 1 - i];
            }
        }
        return result;
    }
}
