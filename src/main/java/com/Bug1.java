package com;

import java.util.Arrays;

/**
 * сделай пожалуйста форматированный вывод
 */
public class Bug1 {
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3}, {7, 8, 9}};
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
