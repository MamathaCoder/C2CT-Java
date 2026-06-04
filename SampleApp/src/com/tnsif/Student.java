package com.tnsif;

//demo for static method

public class Student {
     int rollno;
     String name;
      static String College="Reva";
     
     //static method change value
     
     static void Change() {
             //name="rashmi";
             College="vkit";
     }
     Student(int r, String n){
             rollno=r;
             name=n;
     }
     void display() {
             System.out.println(rollno +" "+name+" "+College);
     }
     public static void main(String[] args) {
             Student.Change();
             Student  s1=new Student (1,"rashmi");
             Student  s2=new Student (2,"sushma");
             Student  s3=new Student (3,"mamatha");
             Student  s4=new Student (4,"rohith");
             
             s1.display();
             s2.display();
             s3.display();
             s4.display();
             
     }
}

