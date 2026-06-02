package com.tnsif.scannerclassprogram;

import java.util.Scanner;

public class Personexec {
	public static void main(String[] args) {
        
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the person name");
		String name=sc.nextLine();
		System.out.println("enter the income");
		int income=sc.nextInt();

		Person pp=new Person(); //object
		pp.setName(name);
		pp.setIncome(income);

		Taxcalculation t=new Taxcalculation(); // object
		t.calculatetax(pp);

		System.out.println("after tax calculation ");
		System.out.println(pp);


		}

}
