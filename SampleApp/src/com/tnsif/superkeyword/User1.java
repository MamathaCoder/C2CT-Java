package com.tnsif.superkeyword;

public class User1 {
	// demo for super constructor 
	        User1(){
	                System.out.println("user account created..");
	        }
	}
	class AdminUser extends User1{
	        AdminUser(){
	                super(); // calls user constructor 
	                System.out.println("admin granted ");
	        }
	}

