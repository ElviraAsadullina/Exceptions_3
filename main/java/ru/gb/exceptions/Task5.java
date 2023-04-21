package ru.gb.exceptions;

/** Строки, состоящие из последовательностей цифр, формируются следующим образом.
 * Первая строка состоит из четырех единиц. Каждая из последующих строк создается следующим действием:
 * берется предыдущая строка и после каждой ее цифры вставляется цифра на единицу большая.
 * Вот первые 3 строки, созданные по этому правилу:
 * (1) 1 1 1 1
 * (2) 12 12 12 12
 * (3) 1223 1223 1223 1223
 * Сколько цифр 5 и сколько цифр 7 будет в строке с номером (9)? В ответе укажите через пробел два
 * целых числа: сначала количество цифр 5 в девятой строке, а затем количество цифр 7 в девятой строке.*/
public class Task5 {
    public static void main(String[] args) {
        Task5 task5 = new Task5();
        int[][] myArray = task5.constructArray(9, 7);
        System.out.println(myArray[8][4] + " " + myArray[8][6]);
    }
    public int[][] constructArray(int i, int j) {
        int[][] array = new int[i][j];
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                if (i < 1) {
                    array[i][j] = 0;
                } else if (j == 0 || i == j) {
                    array[i][j] = 4;
                } else {
                    array[i][j] = array[i - 1][j] + array[i - 1][j - 1];
                }
            }
        }
        return array;
    }
}