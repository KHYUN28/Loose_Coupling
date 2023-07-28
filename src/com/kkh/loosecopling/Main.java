package com.kkh.loosecopling;

public class Main {
 public static void main(String[] args) {

     boolean useCreditCard = true;

     PaymentService paymentService = useCreditCard ? new CreditCardPayment() : new PayPalPayment();

     CheckoutManager checkoutManager = new CheckoutManager(paymentService);

     double item1Price = 29.99;
     double item2Price = 49.99;
     double item3Price = 19.99;
     double totalAmount = item1Price + item2Price + item3Price;

     boolean paymentSuccess = checkoutManager.checkout(totalAmount);
     if (paymentSuccess) {
         System.out.println("Payment successful! Enjoy your items!");
     } else {
         System.out.println("Payment failed. Please try again.");
     }
 }
}
