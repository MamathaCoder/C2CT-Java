package com.tnsif.staticprograms;

// demo for static variable

public class Emplooyee {
        int eid;
        String name;
        static String companyname="TNS";
        
        // constructor
        
        Emplooyee(int e,String n){
                eid=e;
                name=n;        
        }
        void display() {
                System.out.println(eid+" "+name+" "+companyname);
        }
        public static void main(String[] args) {
                Emplooyee e1=new Emplooyee(1,"ruth");
                Emplooyee e2=new Emplooyee(2,"rohith");
                
                e1.display();
                e2.display();
        }

}
