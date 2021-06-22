package com;

/**
 * ArrayIndexOutOfBoundsException
 *
 */
public class Bug6 {
    public static void main(String[] args) {
        int mas[][][] = new int[10][4][2];

        for (int x = 0; x < mas.length; x++) {
            for (int y = 0; y < mas[x].length; y++) {
                System.out.println("\nInner mas >>> ");
                for (int z = 0; z < mas[x][y].length; z++) {
                    System.out.print(mas[x][y][z]);
                }
            }
            System.out.println();
        }
    }
}
