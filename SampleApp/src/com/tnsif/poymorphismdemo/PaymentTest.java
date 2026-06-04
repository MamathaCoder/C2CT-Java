package com.tnsif.poymorphismdemo;

public class PaymentTest {
	public static void main(String[] args) {
        UPIPayment u=new UPIPayment();
        u.makepayment();
        
        CardPayment v=new CardPayment();
        v.makepayment();
}

}
