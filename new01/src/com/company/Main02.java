package com.company;

public class Main02 {

    public static void main(String[] args) {

        int a = -1, b = 0, c = -3;
       // char a = 'A', b = 'B', c = 'C';
        System.out.println("Start : " + a + " - a;" + b + " - b;" + c+ " - c;");

        if (a > b && a > c) {
            c = a + c;
            a = c - a;
            c = c - a;
            System.out.println("01 : " + a + " - a;" + b + " - b;" + c+ " - c;");
        } else if (b > a && b > c) {
            c = b + c;
            b = c - b;
            c = c - b;
            System.out.println("02 : " + a + " - a;" + b + " - b;" + c+ " - c;");
        }

        if (a > b) {
            a = b + a;
            b = a - b;
            a = a - b;
            System.out.println("03 : " + a + " - a;" + b + " - b;" + c+ " - c;");
        }

        System.out.println("End : " + a + " " + b + " " + c);


        
    }
}
