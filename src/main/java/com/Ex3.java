package com;

/*3)Дан массив натуральных чисел. Найти сумму элементов, кратных 5*/

public class Ex3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 10, 11, 15};
        long sum = 0;

        for (int num : array) {
            if (num % 5 == 0) {
                sum += num;
            }
        }

        System.out.println("Sum is " + sum);
    }
}
