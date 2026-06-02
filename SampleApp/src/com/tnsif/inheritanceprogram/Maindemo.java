package com.tnsif.inheritanceprogram;

public class Maindemo {
	
		public static void main(String[] args) {
		        Father f=new Father();
		        f.drinking();
		        Son s=new Son();
		        System.out.println(s.money);
		        System.out.println(s.car);
		        s.drinking();
		        System.out.println(s.cycle);
		        s.read();
		}
		}