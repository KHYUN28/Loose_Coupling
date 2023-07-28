package com.kkh.loosecopling;

public class CheckoutManager {
 private PaymentService paymentService;

 public CheckoutManager(PaymentService paymentService) {
     this.paymentService = paymentService;
 }

 public boolean checkout(double totalAmount) {
    
     return paymentService.processPayment(totalAmount);
 }
}
