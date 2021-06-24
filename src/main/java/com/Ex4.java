package com;

/*Дан массив целых положительных чисел. Найти произведение
        только тех чисел, которые больше заданного числа М. Если таких нет, то выдать
        сообщение об этом.*/

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 8, 9, 10};
        int m;
        int product = 1;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter number: ");
            m = scanner.nextInt();

            for (int num : array) {
                if (num >= m) {
                    product *= num;
                }
            }

            if (product > 1) {
                System.out.println("Result is: " + product);
            } else {
                System.out.println("There is no such number bigger than " + m);
            }
        }
    }
}
