package com.izs.rhnomina.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents.UriTemplateVariables;

import com.izs.rhnomina.entities.Payment;
import com.izs.rhnomina.entities.Trabajador;

@Service
public class PaymentServices {
	
	@Value("${hr-trabajador.host}")
	private String trabajadorHost;
	
	@Autowired
	private RestTemplate restTemplate;

	public Payment getPayment(long workerId, int days) {
		
		Map<String,String> uriVariables = new HashMap<>();
		uriVariables.put("id", ""+workerId);
		
		Trabajador trabajador = restTemplate.getForObject(trabajadorHost + "/trabajador/{id}",Trabajador.class,uriVariables);
		return new Payment(trabajador.getName(), trabajador.getDailyIncome(), days);
	}
	
}
