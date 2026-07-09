package com.Strategy;

public class CreditCart implements PayStrategy {

    @Override
    public void pay (){
        System.out.println("Payment par Credit Cart  éffectué avec succès  ");
    }
}
