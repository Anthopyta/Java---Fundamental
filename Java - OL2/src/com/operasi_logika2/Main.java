package com.operasi_logika2;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner inputUser = new Scanner(System.in);

        int nilaiBenar = 6;
        int nilaiTebak;
        boolean statusTebakan;
        
        System.out.print("masukan nilai tebakan anda : "); nilaiTebak = inputUser.nextInt();
        System.out.println("nilai tebakan anda: " + nilaiTebak);
        
        // oparasi logika
        statusTebakan = (nilaiTebak == nilaiBenar);
        System.out.println("tebakan anda : " + statusTebakan);

        // operasi aljabar boolean (AND/OR)
        System.out.print("masukan nilai diantara 4 dan 9 : ");
        nilaiTebak = inputUser.nextInt();
        statusTebakan = (nilaiTebak > 4) && (nilaiTebak < 9);
        System.out.println("tebakan anda " + statusTebakan);

    }
}