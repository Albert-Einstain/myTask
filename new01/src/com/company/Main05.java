package com.company;
import java.util.Random;
public class Main05 {
        public static void main5(){

//            for (int i = 1000; i>0;--i){
//                int run = new Random().nextInt(201);
//
//                run = run-100;
//                System.out.println(run);
//                if (run==101){
//                    System.out.println(run);
//                    break;
//                }
//            }
        Random random = new Random();
        int n;

        for (int i = 0; i < 1000; i++) {
            n = random.nextInt(200 + 1) - 100;
            System.out.println(n + " ");
                if (n==100){
                    System.out.println(n);
                    break;
                }
        }
    }
}
