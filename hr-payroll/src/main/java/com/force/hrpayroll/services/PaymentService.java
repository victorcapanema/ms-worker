package com.force.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.force.hrpayroll.entities.Payment;
import com.force.hrpayroll.entities.Worker;
import com.force.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {
	
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(long workerId, int days) {
	
		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	} 
}
