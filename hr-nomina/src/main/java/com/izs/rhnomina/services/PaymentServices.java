package com.izs.rhnomina.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.izs.rhnomina.entities.Payment;
import com.izs.rhnomina.entities.Trabajador;
import com.izs.rhnomina.feignClients.TrabajadorFeignClients;

@Service
public class PaymentServices {

	@Autowired
	private TrabajadorFeignClients trabajadorFeignClients;
	
	public Payment getPayment(long workerId, int days) {
			
		Trabajador trabajador = trabajadorFeignClients.listarPorId(workerId).getBody();
		return new Payment(trabajador.getName(), trabajador.getDailyIncome(), days);
	}
	
}
