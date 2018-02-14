package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Question9 {


    public static void answer(){
        StringBuilder content = new StringBuilder();
        try (BufferedReader br  = new BufferedReader(new FileReader("/home/archit/Desktop/file1.txt"))){
            String line;
            while((line = br.readLine()) != null) {
                    content.append(line).append('\n');
            }
        }
        catch (IOException e){
           e.printStackTrace();
        }
        System.out.println(content.toString());

    }
}
