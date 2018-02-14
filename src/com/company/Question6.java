package com.company;

import java.util.Scanner;

public class Question6 {
    static Scanner sc = new Scanner(System.in);
    public static void answer(){
        int ar[] = new int[100];
        int n = sc.nextInt();
        int x = 0;
        for(int  i  = 0  ; i < n ;i++){
            ar[i] = sc.nextInt();
            x = x ^ ar[i]; // Xor of two equal elements is ZERO
        }
        System.out.println("Which Occured NOT twice is " + x);

    }
}
