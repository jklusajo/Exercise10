package com.example.exercise10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task3 {
    public static void main(String[] args){
        int free;

        try(FileInputStream fis = new FileInputStream("exam.txt");
            FileOutputStream fos = new FileOutputStream("copyOfExam.txt")){

            do{
                free = fis.read();
                if((char) free == ' ') free = '-';
                if(free != -1) fos.write(free);
            } while(free != -1);
        } catch(IOException e){
            System.out.println("Input/Output Error");
        }
    }
}