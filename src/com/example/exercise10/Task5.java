package com.example.exercise10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Task5 {
    public static void main(String[] args) throws IOException{
        URL link = new URL("https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt");
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please enter the first digits of your bank account:");
        String accountNumber = buff.readLine();

        try(BufferedReader br = new BufferedReader(new InputStreamReader(link.openStream()))){
            String line;
            System.out.println("Reading from a file");
            while((line = br.readLine()) != null){
                String[] words = line.split("\\t+");
                String bankNumber = words[0].trim();
                String bankName = words[1].trim();
                if(bankNumber.equals(accountNumber)){
                    System.out.println("Bank Number: " + bankNumber);
                    System.out.println("Your Bank Name is: " + bankName);
                    break;
                }
            }
        } catch(IOException e){
            System.out.println("Error");
        }
    }
}