package com.Strategy;

public class CashPayment implements PayStrategy {
    @Override
    public void pay(){
        System.out.println("Payment avec Cash éffectué avec succès");
    }

}
