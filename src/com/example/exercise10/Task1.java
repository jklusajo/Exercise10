package com.example.exercise10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) throws IOException{

        FileInputStream fis;
        int free;

        try{
            fis = new FileInputStream("exam.txt");
        } catch(FileNotFoundException e){
            System.out.println("File not found");
            return;
        }

        try{
            do {
                free = fis.read();
                if (free != -1) System.out.print((char) free);
            }while(free != -1);
        } catch(IOException e){
            System.out.println("Error reading file");
        }

        finally{
            try{
                fis.close();
            } catch(IOException e){
                System.out.println("Error closing file");
            }
        }
    }
}