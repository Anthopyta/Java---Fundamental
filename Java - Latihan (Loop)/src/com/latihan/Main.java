package com.latihan;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner inputUser = new Scanner(System.in);
        int nilaiAwal, nilaiAkhir, total;

        System.out.print("masukan nilai awal : ");
        nilaiAwal = inputUser.nextInt();
        System.out.print("masukan nilai akhir : ");
        nilaiAkhir = inputUser.nextInt();
        
        //! while loop
        // total = 0;
        // while(nilaiAwal <= nilaiAkhir){
        //     total = total + nilaiAwal;
        //     System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
        //     nilaiAwal++;
        // } 

        //! for loop
        // for(total = 0; nilaiAwal <= nilaiAkhir; nilaiAwal++){
        //     total = total + nilaiAwal;
        //     System.out.println("nilai awal " + nilaiAwal + " menjadi " + total);
        // }
        
        //! do while loop
        total = 0;
        do {
            total = total + nilaiAwal;
            System.out.println("nilai " + nilaiAwal + " menjadi " + total);
            nilaiAwal++;
        } while (nilaiAwal <= nilaiAkhir);

    }
}