package com.tnsif.poymorphismdemo;

public class MethodOverloading {
	public static void main(String[] args) {
        Calculator c=new Calculator();
        System.out.println(c.add(3.2, 4.5));
        System.out.println(c.add(1, 4));
        System.out.println(c.add(1, 2, 3));
}

}
