package com.company;
import java.util.Random;

public class Main02 {
    public static void main2() {

        Random random = new Random();
        int a = random.nextInt(10), b = random.nextInt(10), c = random.nextInt(10);
        System.out.println("Start : " + a + " - a;" + b + " - b;" + c+ " - c;");

        if (a > b && a > c) {
            c = a + c;
            a = c - a;
            c = c - a;
        } else if (b > a && b > c) {
            c = b + c;
            b = c - b;
            c = c - b;
        }

        if (a > b) {
            a = b + a;
            b = a - b;
            a = a - b;
        }

        System.out.println("End : " + a + " " + b + " " + c);
    }
}
