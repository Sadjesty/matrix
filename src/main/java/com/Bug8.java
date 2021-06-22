package com;

/**
 * сделай так чтобы при оценке 0 - выводилось просто "неизвестный результат"
 * при вводе 2 было выведено "двоечник" и тд
 * протестируй - чтобы каждой оценке соответствовал свой статус
 */
public class Bug8 {
    public static void main(String[] args) {
        int mark = 3;
        switch (mark) {
            case 1:
                System.out.println("неуд");
                break;
            case 2:
                System.out.println("двоечник");
                break;
            case 3:
                System.out.println("троечник");
                break;
            case 4:
                System.out.println("хорошист");
                break;
            case 5:
                System.out.println("отличник");
                break;
            default:
                System.out.println("неизвестный результат");
                break;

        }
    }
}
