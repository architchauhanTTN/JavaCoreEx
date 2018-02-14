package com.company;

public class Question3 {

        public static void answer() {
            String str = "architchauhan";


            int charcount = str.length() - str.replaceAll("a", "").length();
            System.out.println("Occurrence Of A Char In String: " + charcount);

    }
}
