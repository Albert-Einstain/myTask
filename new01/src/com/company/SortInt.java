package com.company;
import java.util.Random;

public class SortInt {
//    public static int a;

    public static void sortint() {
//this.a a = new Random().nextInt(10);
        int     a = new Random().nextInt(10),
                b = new Random().nextInt(10),
                c = new Random().nextInt(10);

        //int a = 3, b = 0, c = 2;
        System.out.println("a = "+ a + "; b = "+ b +"; c = " + c);

        if (a>=b && a>=c) {
            if (b>=c){
                System.out.println("A: "+c+""+b+""+a);
            }else{
                System.out.println("B: "+b+""+c+""+a);
            }
        } else if (a<=b && a<=c){
            if (b>=c){
                System.out.println("C: "+a+""+c+""+b);
            } else {
                System.out.println("D: "+a+""+b+""+c);
            }
        } else {
            if (b>=c){
                System.out.println("E5: "+c+""+a+""+b);
            } else {
                System.out.println("F: "+b+""+a+""+c);
            }
        }
    }
    public static void sortint1() {
            System.out.println("123");
        }
}
