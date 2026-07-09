package com.Strategy;

public class PayPalPayment implements PayStrategy {

    @Override
    public void pay (){
        System.out.println("Payment Paypal éffectué avec succès  ");
    }
}
