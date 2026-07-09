package com.Strategy;

public class PaymentContext {

    private PayStrategy strategy;

    public PaymentContext(PayStrategy strategy){

        this.strategy = strategy;
    }

    void executePayment(){
        if(strategy == null){
            System.err.println("Aucun moyen de payment n'a été défini");
            return;
        }
        strategy.pay();
    }

    public void setStrategy(PayStrategy strategy){
        this.strategy = strategy;
    }




}
