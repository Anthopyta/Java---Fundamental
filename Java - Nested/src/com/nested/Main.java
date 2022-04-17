package com.nested;

public class Main{
    public static void main(String[] args){
        // nested if atau if bersarang

        int a = 2;
        int b = 10;
        System.out.println("ini adalah awal dari program");

        if (a == 5) {
            if (b == 10) {
                System.out.println("ini adalah dimana a = 5 dan b = 10"); 
            } else {
                System.out.println("ini adalah a = 5 dan b != 10");
            }
        } else {
            System.out.println("ini adalah !a");
        }
        System.out.println("ini adalah akhir program");


        System.out.println("--------- contoh : -------");
        int uang = 6_000;
        int barang1 = 8_000;
        int barang2 = 2_000;

        System.out.println("start");

        if(uang <= barang1){
            if(uang == barang2){
                System.out.println("membeli barang 2");
            } else if (uang < barang1 || uang > barang2){
                System.out.println("hanya membeli salah satu barang");
            } else {
                System.out.println("uang tudak cukup");
            } 
        } else {
            System.out.println("membeli barang 1");
        }

        System.out.println("program selesai");
    }
}