package com;

/*1) Написать программу, заводящую массив из 5 целых чисел, заполняющую
        его числами, введенными с клавиатуры, и печатающую, сколько раз в этом
        массиве встречается цифра 1.*/

import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        int[] array = new int[5];

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter nums: ");
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
