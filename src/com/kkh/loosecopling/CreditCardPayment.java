package com.kkh.loosecopling;

public class CreditCardPayment implements PaymentService {
 @Override
 public boolean processPayment(double amount) {

     System.out.println("Processing credit card payment for amount: " + amount);
     return true; 
 }
}
