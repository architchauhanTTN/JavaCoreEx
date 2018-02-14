package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Question5 {
    static Scanner sc = new Scanner(System.in);
    public static void answer(){

        int ar[] = new int[10];
        int br[] = new int[10];
        int hsh[] = new int[10000];
        Arrays.fill(hsh , 0);
        int si1 , si2;
        int mxe = -1;
        System.out.println("Enter Size of Array 1");
        si1 = sc.nextInt();
        System.out.println("Enter the Array");
        for(int i  = 0 ; i < si1 ; i++) {


            ar[i] = sc.nextInt();
            if(ar[i] > mxe ) mxe = ar[i];
            hsh[ar[i]]++;
        }
        System.out.println("Enter Size of Array 2");
        si2 = sc.nextInt();
        System.out.println("enter the array");
        for(int i  = 0 ; i < si2 ; i++) {


            br[i] = sc.nextInt();
            if(br[i] > mxe ) mxe = br[i];
            hsh[br[i]]++;
        }
        System.out.println("Common Elements are :- \n");
        for(int i = 0 ; i < mxe ; i++) {
            if(hsh[i] > 1){
                System.out.print(i + " ");
            }
        }

    }
}
