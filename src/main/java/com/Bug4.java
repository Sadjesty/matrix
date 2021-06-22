package com;

/**
 * * Посчитай пожалуйста количество элементов, которые имеют значение false
 * прокоментируй пожалуйста почему так работает
 */
public class Bug4 {
    public static void main(String[] args) {
        boolean mas[] = {false, true, true, true, false, false};//3
        int falseCounter = 0;
        for (int i = 0; i < mas.length; i++) {
            if (!mas[i]) {
                falseCounter++;
            }
        }

        System.out.println(falseCounter);//почему не 3?
        /*
         * Изначально в программе был баг. Вместо проверки элементов на false '==', было присвоение '='
         */
    }
}
