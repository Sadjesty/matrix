package com;

/**
 * устрани пожалуйста ошибку ArrayIndexOutOfBoundsException
 */
public class Bug2 {
    public static void main(String[] args) {
        int[] mas = new int[100];
        for (int i = 0; i < 100; i++) {
            mas[i] = i;
            System.out.println(mas[i]);
        }
    }
}
