package com.izs.rhnomina.feignClients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.izs.rhnomina.entities.Trabajador;

@Component
@FeignClient(name = "hr-trabajador", path = "/trabajador")
public interface TrabajadorFeignClients {
	
	@GetMapping(value = "/{id}")
	ResponseEntity <Trabajador> listarPorId(@PathVariable Long id);

}
