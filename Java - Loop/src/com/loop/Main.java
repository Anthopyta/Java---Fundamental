package com.loop;

public class Main{
    public static void main(String[] args){
        //! while loop
        /* while (kondisi) {
            aksi
        } */
        
        int a = 0;
        boolean kondisi = true;

        // System.out.println("awal program");
        // while (kondisi) {
        //     System.out.println("while loop ke-" + a);
            
        //     if (a == 10){
        //         kondisi = false;
        //     }
        //     a++;
        // }
        // System.out.println("program selesai");


        //! do while loop
        /* do {
            aksi
        } while (kondisi); */

        
        /* System.out.println("awal program");
        do {
            a++;                                                                              
            System.out.println("do while ke-" + a);
            if(a == 10){
                kondisi = false;
            }
        }while (kondisi);

        System.out.println("program selesai");
        */

        //! for loop 
        /* for (inisialisasi; kondisi; step nilai){
            aksi;
        }
        */
        // increment
        System.out.println("awal program");
        for(int nilai = 0; nilai <= 10; nilai++){
            System.out.println("for loop ke-" + nilai);
        }

        // decrement
        System.out.println("loop kedua");
        for(int nilai = 10; nilai >= 1; nilai--){
            System.out.println("for loop ke-" + nilai);
        }

    }
}