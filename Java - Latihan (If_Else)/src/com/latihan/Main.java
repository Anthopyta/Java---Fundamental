package com.latihan;
import java.util.*;

public class Main{
    public static void main(String[] args){
        // a operator b
        Scanner inputUser = new Scanner(System.in);
        float a, b,hasil;
        char operator;

        System.out.print("nilai a : " );
        a = inputUser.nextFloat();
        System.out.print("operator : " );
        operator = inputUser.next().charAt(0);
        System.out.print("nilai b : " );
        b = inputUser.nextFloat();

        System.out.println("input user : " + a + " " + operator + " " + b);

        // operator * / + - * 
        if (operator == '+'){
            hasil = a + b;
            System.out.println("hasil : " + hasil);
        } else if(operator == '-'){
            hasil = a - b;
            System.out.println("hasil : " + hasil);
        } else if (operator == '*'){
            hasil = a * b;
            System.out.println("hasil : " + hasil);
        } else if (operator == '/'){
            // hasil = a / b;
            // System.out.println("hasil : " + hasil); 
            if (b == 0){
                System.out.println("tak terhingga");
            } else {
                hasil = a / b;
                System.out.println("hasil : " + hasil); 
            }
        } else {
            System.out.println("operator tidak ditemukan");
        }
    }
}