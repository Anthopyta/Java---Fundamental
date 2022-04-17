package com.operator_bitwise;

public class Main {
    public static void main(String[] args){
        // operator bitwise -> operator untuk melakukan operasi pada nilai bit

        byte a = 3;
        byte b;
        byte c;
        String a_bits, b_bits, c_bits;

        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(" ", "0");
        System.out.printf("%s = %d \n", a_bits, a);
        
        // operator shift left
        System.out.println("---------shift left (<<)");
        b = (byte)(a << 1);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(" ", "0");
        System.out.printf("%s = %d \n", b_bits, b);
        
        // operator shift right
        System.out.println("---------shift right (>>)");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(" ", "0");
        System.out.printf("%s = %d \n", a_bits, a);
        b = (byte)(a >> 1);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(" ", "0");
        System.out.printf("%s = %d \n", b_bits, b);
        
        // operator bitwise OR
        System.out.println("---------bitwise OR (|)");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(" ", "0");
        System.out.printf("%s = %d \n", a_bits, a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(" ", "0");
        System.out.printf("%s = %d \n", b_bits, b);  
        System.out.println("----------------OR----------------");
        c = (byte)(a | b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(" ", "0");
        System.out.printf("%s = %d \n", c_bits, c);
        
        // operator bitwise AND
        System.out.println("---------bitwise AND (&)");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(" ", "0");
        System.out.printf("%s = %d \n", a_bits, a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(" ", "0");
        System.out.printf("%s = %d \n", b_bits, b);  
        System.out.println("----------------AND----------------");
        c = (byte)(a & b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(" ", "0");
        System.out.printf("%s = %d \n", c_bits, c);
        
        // operator bitwise XOR
        System.out.println("---------bitwise XOR (^)");
        a = 24;
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(" ", "0");
        System.out.printf("%s = %d \n", a_bits, a);
        b = 12;
        b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(" ", "0");
        System.out.printf("%s = %d \n", b_bits, b);  
        System.out.println("----------------XOR----------------");
        c = (byte)(a ^ b);
        c_bits = String.format("%8s", Integer.toBinaryString(c)).replace(" ", "0");
        System.out.printf("%s = %d \n", c_bits, c);
        
        // operator negasi / NOT 
        System.out.println("-----------------bitwise NOT (~)---------------");
        a = 24;
        b = (byte) (~a);
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(" ", "0");
        System.out.printf("%s = %d \n", a_bits, a);
        b_bits = String.format("%8s", Integer.toBinaryString(b)).substring(24);
        System.out.printf("%s = %d \n", b_bits, b);  
        
    }
}
