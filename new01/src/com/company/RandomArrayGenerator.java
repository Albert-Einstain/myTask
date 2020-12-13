package com.company;

import java.util.Scanner;
import java.util.Random;

public class RandomArrayGenerator {
    public static void generate() {
        Scanner scanner = new Scanner(System.in);
        int n =0, i, count=0, count2=0;

        while (n <= 3) {
            System.out.println("Enter number");
            n = scanner.nextInt();
        }
        int arr[] = new int[n];

        for (i = 0; i <= arr.length - 1; i++) {
            arr[i] = new Random().nextInt(n);
            System.out.println("Масив arr, ячейка " + i + " : " + arr[i]);
            if(arr[i]%2 == 0 && arr[i] > 0){
                count = count +1;
            }
        }

        int arr2[] = new int[count];
        for (i = 0; i <= arr.length - 1; i++) {
            if(arr[i]%2 == 0 && arr[i] != 0){
                arr2[count2] = arr[i];
                System.out.println("Масив arr2, ячейка " + count2 + " : " + arr2[count2]);
                count2 = count2+1;
            }
        }
    }
}