package com.operasi_komparasi;

public class Main{
    public static void main(String[] args){
        // operator komparasi --> akan menghasilkan nilai dalam bentuk boolean

        int a, b, c;
        a = 10;
        b = 10;
        c = 12;
        boolean hasilkomparasi;
        hasilkomparasi = (a == b);
        
        System.out.println("-----persamaan -----");
        System.out.printf("%d == %d --> %s \n", a, b, hasilkomparasi);
        System.out.printf("%d apakah sama dengan %d ? %s \n", a, b, (a == b)); // true
        System.out.printf("%d apakah sama dengan %d ? %s \n", a, c, (a == c)); // false
        
        // operator ont equal atau pertidaksamaan 
        System.out.println("-----pertidaksamaan -----");
        a = 10;
        b = 10;
        hasilkomparasi = (a != b);
        System.out.printf("%d == %d --> %s \n", a, b, hasilkomparasi);
        
        a = 12;
        b = 10;
        hasilkomparasi = (a != b);
        System.out.printf("%d == %d --> %s \n", a, b, hasilkomparasi);

        // operator less atau kurang dari 
        System.out.println("-----kurang dari -----");
        a = 9;
        b = 10;
        hasilkomparasi = (a < b);
        System.out.printf("%d < %d --> %s \n", a,b, hasilkomparasi);
        
        // operator greater atau kurang dari 
        System.out.println("-----lebih dari -----");
        a = 9;
        b = 10;
        hasilkomparasi = (a > b);
        System.out.printf("%d > %d --> %s \n", a,b, hasilkomparasi);
        
        // operator less than atau kurang dari sama dengan 
        System.out.println("-----kurang dari sama dengan-----");
        a = 10;
        b = 10;
        hasilkomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s \n", a,b, hasilkomparasi);
        
        // operator greater than atau lebih dari sama dengan 
        System.out.println("-----lebih dari sama dengan -----");
        a = 9;
        b = 10;
        hasilkomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n", a,b, hasilkomparasi);
        
    }
}