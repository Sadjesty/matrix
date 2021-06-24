package com;

import java.util.Arrays;

public class Ex5 {

    public static void main(String[] args) {
        int[][] triangle = new int[10][];

        for (int i = 0; i < triangle.length; i++) {
            int[] line = new int[i + 1];
            for (int j = 0; j < line.length; j++) {
                if (i == 0 || j == 0 || j == line.length - 1) {
                    line[j] = 1;
                } else {
                    line[j] = triangle[i - 1][j -1] + triangle[i - 1][j];
                }

                triangle[i] = line;
            }
        }

        for (int[] line : triangle) {
            System.out.println(Arrays.toString(line));
        }
    }
}
