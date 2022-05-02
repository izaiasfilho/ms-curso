package com.izs.rhtrabajadores.resouces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.izs.rhtrabajadores.entities.Trabajador;
import com.izs.rhtrabajadores.repository.TrabajadorRepository;

@RestController
@RequestMapping(value = "/trabajador")
public class TrabajadorResource {
	
	@Autowired
	private TrabajadorRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Trabajador>> listarTodos(){
		List<Trabajador> list = repository.findAll();
		return ResponseEntity.ok(list);
	}
	

	@GetMapping(value = "/{id}")
	public ResponseEntity <Trabajador> listarPorId(@PathVariable Long id){
		return ResponseEntity.ok(repository.findById(id).get());
	}

}
