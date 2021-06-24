package com;

/*2) Переписать программу из предыдущего задания так, чтобы считалась сумма введенных числе*/

import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        int[] array = new int[5];
        long sum = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter nums: ");
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
                sum += array[i];
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Sum is " + sum);
    }
}
