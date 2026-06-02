package com.tnsif.superkeyword;

public class Payment1 {
	// demo for super method

	        void process() {
	                System.out.println("processing payment using standard gateway..");
	        }
	}
	class Gpay extends Payment1{
	        void process() {
	                System.out.println("processing payment using standard gpay..");
	        }
	        
	        void completetransation() {
	                super.process();//parent class
	                process();// child class
	        }
	}


