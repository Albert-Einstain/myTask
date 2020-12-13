package com.company;
import java.util.Scanner;

public class Main03 {
    public static void main3(){
         /*
            Создать программу, которая будет сообщать, является ли целое число, введённое пользователем,
            чётным или нечётным. Если пользователь введёт не целое число, то сообщать ему об ошибке.
         */

        Scanner scanner = new Scanner(System.in);

       // while (true) {
            System.out.print("Введите целое число: ");

            if (scanner.hasNextInt()) {
                int n = scanner.nextInt();
                if (n % 2 == 0) {
                    System.out.print("число " + n + " четное");
                } else {
                    System.out.print("число " + n + " нечетное");
                }
            } else {
                System.out.print("Вася, только ЦЕЛОЕ число нужно ввести!\n");
            }
       // }
    }
}


