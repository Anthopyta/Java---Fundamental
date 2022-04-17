package com.switch_case;
import java.util.*;

public class Main{
    public static void main(String[] args){
        // switch case 
        // ekspresinya berupa satuan (int, long, byte, short), String atau enum
        String input;
        Scanner inputUser = new Scanner(System.in);
        input = inputUser.next();
        
        System.out.print("panggil nama : ");
        System.out.println(input);

        switch (input){
            case "idham" :
                System.out.println("Hadir pak!");
                break;
            case "adi" :
                System.out.println("Hadir");
                break;
            default : 
                System.out.println("tidak hadir pak!");
        } 
        System.out.println("program selesai");

    }
}