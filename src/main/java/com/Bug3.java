package com;

/**
 * устрани пожалуйста ошибку NullPointerException и ArrayIndexOutOfBoundsException
 * смысл программы - просто распечатать пустую матрицу: matrix
 * напомню что ошибка NullPointerException появляется если ты обращаешься к null вместо объекта и просишь у него выполнить какую-то функциональность
 * <p>
 * String name = null;
 * name.concat("xxxx"); // name по сути ни на что не указывает, там проставлен null -> поэтому если у пустоты(null) попросить concat -> будет NPE
 */
public class Bug3 {
    public static void main(String[] args) {
        int matrix[][] = new int[100][1];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }
}
