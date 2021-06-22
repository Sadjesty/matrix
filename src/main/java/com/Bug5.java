package com;

/**
 * *сделай так чтобы End все же вывелся в консоль - разбери зацикливание
 */
public class Bug5 {
    public static void main(String[] args) {
        int i = 1;
        while (true) {
            if (i % 200 == 0) {
                System.out.println("Start Break " + i);
                break;
            }

            i++;
            continue;
        }

        System.out.println("End");
    }
}

