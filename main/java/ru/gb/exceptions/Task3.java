package ru.gb.exceptions;

/** Дан следующий код, исправьте его там, где требуется */

public class Task3 {
    /** Проведены следующие корректировки:
     * - выстроена верная иерархия исключений;
     * - добавлено исключение для случая с делением на ноль. */
    public static void main(String[] args) {
        try {
            /** Test1*/
            int a = 90;
            int b = 0;
            System.out.println(a / b);

            /** Test2*/
            printSum(null, 234);

            /** Test3*/
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Индекс выходит за пределы размера массива!");
        } catch (NullPointerException ex) {
            System.out.println("Аргумент не может указывать на null!");
        } catch (ArithmeticException ex) {
            System.out.println("Деление на ноль недопустимо!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}