package com.tnsif.scannerclassprogram;

import java.util.Scanner;

// demo for scanner class

public class Scannerdemo {
        
        public static void main(String[] args) {
                Scanner sc=new Scanner(System.in); // scanner class
                
                System.out.println("enter the id");
                int id=sc.nextInt();
                System.out.println("enter the address");
                String address=sc.next();
                
        }

}