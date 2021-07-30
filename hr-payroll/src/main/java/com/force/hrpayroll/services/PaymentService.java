package com.force.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.force.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	public Payment getPayment(long workerId, int days) {
		return new Payment("Bob",200.0,days);
	} 
}
