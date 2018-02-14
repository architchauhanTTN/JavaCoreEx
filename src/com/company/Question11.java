package com.company;

public class Question11 {
    static int add(int a , int b) { return a + b ;}
    static double add(double a , double b) {return a + b;}

    static int mul(int a , int b) { return a * b ;}
    static double mul(double a , double b ) { return a * b;}

    static String con(String a  ,String b) { return (a.concat(b));}
    static String con(String a , String b , String c) {
        return (a.concat(b)).concat(c);
    }
    public static void answer() {
        // Calling Functions
        add(2 , 3);
        add(3.3, 2.3);
        mul(12 , 2);
        mul(1.1 , 3.4);
        System.out.println(con("Archit" , "Pushkar"));
        System.out.println(con("Archit" , "Pushkar" , "Swapnil"));



    }
}
