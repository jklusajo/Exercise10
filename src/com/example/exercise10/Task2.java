package com.example.exercise10;

import java.io.FileInputStream;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) throws IOException {
        int free;

        try(FileInputStream fis = new FileInputStream("exam.txt")){
            do{
                free = fis.read();
                if(free != -1) System.out.print((char) free);
            } while(free != -1);
        } catch (IOException e){
            System.out.println("Error reading the file");
        }
    }
}