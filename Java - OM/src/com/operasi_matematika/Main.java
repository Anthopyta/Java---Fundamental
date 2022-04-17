package com.operasi_matematika;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        // perkalian dan pembagian akan dieksekusi terbih dahulu
        // jika dilakukan perkalian dan pembagian, maka akan dieksekusi dari kiri ke kanan
        int hasil = 10 / 2 + 2 * 5;
        System.out.println(hasil);
        hasil = 5 + 2 - 10;
        System.out.println(hasil);

        // menggunakan pengelompokan operasi
        hasil = 60 / (2 + 10);
        System.out.println(hasil);

        Scanner userInput = new Scanner(System.in);
        // perhitungan persamaan kuadrat 
        System.out.println("-----------persamaan kuadrat---------");
        int m,x,c;

        System.out.print("nilai x = " ); x = userInput.nextInt(); 
        System.out.print("nilai m = " ); m = userInput.nextInt(); 
        System.out.print("nilai c = " ); c = userInput.nextInt(); 
        int y = (m * x * x) + c;
        System.out.println("nilai y = " + y);

        


    }
}