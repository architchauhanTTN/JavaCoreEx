package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Question2 {
    static Scanner sc = new Scanner(System.in);
    public static void answer(){
        System.out.println("------------\n For Question 2\n");
        int ar[] = new int[26];
        Arrays.fill(ar , 0);
        String s = sc.next();
        int le = s.length();
        for(int i = 0 ; i < le ;i++){
            ar[s.charAt(i) - 'a']++;
        }
        for (int i = 0 ;i < 26 ; i++)
            if(ar[i] > 1)
            System.out.println((char)(i + 'a'));


    }


}
