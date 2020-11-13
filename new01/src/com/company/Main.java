package com.company;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        int     a = new Random().nextInt(10),
                b = new Random().nextInt(10),
                c = new Random().nextInt(10);

        System.out.println("a = "+ a + "; b = "+ b +"; c = " + c);


        if (a >= b) {
            if (b>=c){
                System.out.println(c+""+b+""+a);
            } else {
                System.out.println(b+""+c+""+a);
            }
        } else if (a >=c) {
            if (b>=c){
                System.out.println(c+""+b+""+b);
            } else {
                System.out.println(b+""+b+""+b);
            }
        } else {
            if (b>=c){
                System.out.println(a+""+c+""+b);
            } else {
                System.out.println(a+""+b+""+c);
            }
        }
}}
