package com.tnsif.encapsulationprogram;

public class Encapsulationprogram {

        // properties
        private int id;
        private String name;
        
        //getter and setter method
        
        public int getId() {
                return id;
        }
        public void setId(int id) {
                this.id = id;
        }
        
        public String getName() {
                return name;
        }
        public void setName(String name) {
                this.name = name;
        }
        
        public static void main(String[] args) {
                Encapsulationprogram e1=new Encapsulationprogram();
                
                //setting the value using setters
                e1.setId(103);
                e1.setName("hamsa");
                
                //getting the values using getters
                System.out.println(e1.getId());
                System.out.println(e1.getName());
        }
        
        
}
