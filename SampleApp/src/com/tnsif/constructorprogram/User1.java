package com.tnsif.constructorprogram;

public class User1 {
	String name;
    int age;
    
    //Default cost
    User1(){
            name="Guest";
            age=5;
            System.out.println("Guest profile created");
    }
    //parameter cons
    
    User1(String name,int age){
            this.name=name;
            this.age=age;
            System.out.println("User creaed :"+"name "+ name +" "+ "Age :"+age);
    }
}

