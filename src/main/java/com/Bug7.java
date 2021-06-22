package com;

/**
 * должно быть
 * skip>>>>i=0, j=0
 * i=1, j=0
 * skip>>>>i=1, j=1
 * i=2, j=0
 * i=2, j=1
 * skip>>>>i=2, j=2
 * i=3, j=0
 * i=3, j=1
 * i=3, j=2
 * skip>>>>i=3, j=3
 * i=4, j=0
 * i=4, j=1
 * i=4, j=2
 * i=4, j=3
 *
 *
 * пофиксь без else блока
 * исправить нужно 1 оператор
 * проанализируй закономерность вывода
 *
 */
public class Bug7 {
    public static void main(String[] args) {
        int mas[][] = new int[5][4];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (i == j) {
                    System.out.println(String.format("skip>>>>i=%d, j=%d", i, j));
                    break;
                }
                System.out.println(String.format("i=%d, j=%d", i, j));
            }
        }
    }
}
