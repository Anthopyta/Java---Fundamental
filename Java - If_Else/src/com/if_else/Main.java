package com.if_else;

public class Main{
    public static void main(String[] args){
        
        int a = 5;

        // akhir dari if else statement
        System.out.println("ini adalah akhir program");
        if (a == 5) {
            System.out.println("ini adalah aksi true");
        } else {
            System.out.println("ini adalah aksi false");
        }

        // if else if statement
        System.out.println("ini adalah awal program");
        
        if(a == 5) {
            System.out.println("ini adalah aksi 1");
        } else if (a == 10) {
            System.out.println("ini adalah aksi 2");
        } else{
            System.out.println("ini adalah aksi default");
        }

        
    }
} 