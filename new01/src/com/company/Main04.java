package com.company;
import java.util.Scanner;
public class Main04 {
    public static void main4(){

//      Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его цифр (заранее не известно сколько цифр будет в числе).

        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter number");

        int n=0;
        try {
            n = scanner.nextInt();
        } catch (Exception err){
            System.out.println("Wrong integer.");
            return;
        }

        int sum = 0;
        while (n>0){
            sum = sum + n%10;
            n = (n - n%10)/10;
        }
        System.out.println("sum = " + sum);
    }
}