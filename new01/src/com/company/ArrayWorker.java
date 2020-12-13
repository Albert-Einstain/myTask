package com.company;
import java.util.Random;
public class ArrayWorker {

    //______________________________________
    public static int[] ArrayOfNumbersAnna(int maxCellsAmount,int lowerLimit, int UpperLimit) {
        //функция генерирует массив случайной длины, ограниченной входящим параметром maxCellsAmount
        //заполняет массив случайными значениями типа int из заданного диапазона (между lowerLimit и UpperLimit)

        /*
        cellsAmount количество ячеек в запрашиваемом массиве
        lowerLimit нижняя граница генерируемого диапазона
        UpperLimit верхняя граница генерируемого диапазона
         */
        if (maxCellsAmount <= 0) {
            System.out.println("Неверное максимальное количество ячеек \nЗначение должно быть строго больше 0");
            return new int[0];
        }
        if (UpperLimit < lowerLimit) {
            System.out.println("Верхняя граница масива должна быть больше нижней");
            return new int[0];
        }

        Random random = new Random();

        //генерируем массив случайной длины

        int cell = new Random().nextInt(maxCellsAmount) + 1;
        int[] arr = new int[cell];

        int i;
        for (i = 0; i <= arr.length - 1; ++i) {
            arr[i] = random.nextInt(UpperLimit+1 - lowerLimit) + lowerLimit;
        }
        return arr;
    }










    public static double[] ArrayOfNumbersAnna(int maxCellsAmount,double lowerLimit, double UpperLimit, boolean integer) {
        //функция генерирует массив случайной длины, ограниченной входящим параметром maxCellsAmount
        //заполняет массив случайными значениями типа int из заданного диапазона (между lowerLimit и UpperLimit)

        /*
        cellsAmount количество ячеек в запрашиваемом массиве
        lowerLimit нижняя граница генерируемого диапазона
        UpperLimit верхняя граница генерируемого диапазона
         */
        if (maxCellsAmount <= 0) {
            System.out.println("Неверное максимальное количество ячеек \nЗначение должно быть строго больше 0");
            return new double[0];
        }
        if (UpperLimit < lowerLimit) {
            System.out.println("Верхняя граница масива должна быть больше нижней");
            return new double[0];
        }

        Random random = new Random();

        //генерируем массив случайной длины

        int cell = new Random().nextInt(maxCellsAmount) + 1;
        double[] arr = new double[cell];

        int i;
        for (i = 0; i <= arr.length - 1; ++i) {

            if (integer) {
                arr[i] = (random.nextDouble()*UpperLimit) - (random.nextDouble()*lowerLimit);
            }
        }
        return arr;
    }
}







/*
amount,,
    Получить масива
    1. Длинной 0-10 0-100 0-1000
    2. Длинна числа (по умолчанию 2 знака)
    3. Числа натуральные (1,2,3) или с отрицательным знаком
    4. Числа целые или дробные
    ==============
    Получить строку
    1. Длинна строки 0-10 0-100 0-1000
    2. Оличество букв 0-25
    3. Добавить заглавные буквы (y/n)
    4. Есть ли числа (y/n)
    ==============
    Получить масив слов (Имена)
    1. От 0 - 99
    2. Длинна слова 0-9
    3. Первая буква заглавная (по умолчанию все нижнего регистра)



    3 - 5 - 2
    =========

*/
