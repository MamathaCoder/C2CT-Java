package com.tnsif.superkeyword;
//demo for super variable
public class Notification {
    String message="Default notification";
}

class Pushnotification extends Notification{
    String message="push notification from whstp";
    void notification() {
            System.out.println("child message :"+message);
            System.out.println("parent message :"+super.message);
    }
}

