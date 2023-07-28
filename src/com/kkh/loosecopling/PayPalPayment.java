package com.kkh.loosecopling;

public class PayPalPayment implements PaymentService {
 @Override
 public boolean processPayment(double amount) {

     System.out.println("Processing PayPal payment for amount: " + amount);
     return true; 
 }
}
