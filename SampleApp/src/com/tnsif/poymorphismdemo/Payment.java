package com.tnsif.poymorphismdemo;

//demo for method overriding
class Payment{
     
     Payment(){
             
     }
     void makepayment() {
             System.out.println("processing payment using method");
     }
}
//subclass
class UPIPayment extends Payment{
     UPIPayment(){  //Contractor cant override
             
     }
     
     @Override
     void makepayment() {
             System.out.println("payment using UPI");
     }        
}
class CardPayment extends Payment{
     @Override
     void makepayment() {
             System.out.println("payment using credit card");
     }        
}
