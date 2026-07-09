package com.Strategy;

public class StrategyMain {
     public static void main(String[] args) {
        PaymentContext context =  new PaymentContext(new PayPalPayment());
        context.executePayment();

         context =  new PaymentContext(new CashPayment());
        context.executePayment();

        context =  new PaymentContext(new CreditCart());
        context.executePayment();

        context = new PaymentContext(null);
        context.executePayment();
     }

}
