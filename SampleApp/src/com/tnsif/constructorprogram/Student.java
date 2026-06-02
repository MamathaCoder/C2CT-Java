package com.tnsif.constructorprogram;

public class Student {
	int id;
	String name;

	Student(int id,String name ){
	        this.id=id;
	        this.name=name;
	}

	void display() {
	        System.out.println("ID :"+id);
	        System.out.println("Name :"+name);
	}
	public static void main(String[] args) {
	        Student s=new Student(101,"surya");
	        Student s1=new Student(103,"yurya");
	        //boolean output=s1.(instanceof)Student();
	        s.display();
	        s1.display();
	}

}
