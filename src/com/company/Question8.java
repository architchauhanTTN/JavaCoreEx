package com.company;

import java.util.Scanner;

public class Question8 {
    static Scanner sc = new Scanner(System.in);
    public static void answer(){
        StringBuffer sbuffer  = new StringBuffer();
        sbuffer.append(sc.nextLine());
        sbuffer.reverse();
//        System.out.println(sbuffer);
        for(int i = 4 ; i <=7 ; i++) {
            sbuffer.deleteCharAt(i);
        }
        System.out.println(sbuffer);
    }
}
