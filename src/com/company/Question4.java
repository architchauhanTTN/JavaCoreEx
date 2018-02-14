package com.company;

public class Question4 {
    static boolean isDigit(char x){
        if(x >= '0' && x <= '9') return true;
        return  false;
    }
    static boolean isUpper(char x){
        if(x >= 'A' && x <= 'Z') return true;
        return false;
    }
    static boolean isLower(char x) {
        if(x >= 'a' && x <= 'z') return true;
        return false;
    }


    public static void answer(){
        System.out.println("------------\n For Question 4\n");
        String s = "abcdAcbd@#124";

        int le = s.length();
        int lo = 0;
        int up = 0;
        int sp = 0;
        int di = 0;
        for(int i = 0 ; i < le ;i++){
            if(isDigit((s.charAt(i)))){
                di ++;
            }
            else if (isLower((s.charAt(i)))){
                lo ++;
            }
            else if(isUpper((s.charAt(i)))){
                up ++;
            }
            else sp++;

        }
        System.out.println(" Lower Case " + lo + "\n Upper Case " + up + "\n Digit  " + di + "\n Special " + sp);


    }
}
