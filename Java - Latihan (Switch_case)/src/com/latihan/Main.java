package com.latihan;
import java.util.*;

public class Main{
    public static void main(String[] args){
        // latihan switch case
        float a,b,hasil;
        String operator;
        Scanner inputuser = new Scanner(System.in);

        System.out.print("nilai a : ");
        a = inputuser.nextFloat();
        System.out.print("operator : ");
        operator = inputuser.next();
        System.out.print("nilai b : ");
        b = inputuser.nextFloat();

        switch (operator){
            case "+" : 
                hasil = a + b;
                System.out.println("nilai : " + hasil);
                break;
            case "-" : 
                hasil = a - b;
                System.out.println("nilai : " + hasil);
                break;
            case "*" : 
                hasil = a * b;
                System.out.println("nilai : " + hasil);
                break;
            case "/" : 
                hasil = a / b;
                System.out.println("nilai : " + hasil);
                break;
            default :
                System.out.println("operator tidak ditemukan");
        }

    }
}