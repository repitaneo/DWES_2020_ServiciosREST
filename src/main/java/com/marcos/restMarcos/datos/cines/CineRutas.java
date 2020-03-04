package com.marcos.restMarcos.datos.cines;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;








@RestController
public class CineRutas {
	
	
	
	@GetMapping("/cine")
	public ResponseEntity<Cine> unUsuarios() {
		
		Cine cine = new Cine();
		cine.setNombre("Paco's cinema");
		cine.setLugar("Oviedo");
		
		Sala sala1 = new Sala();
		sala1.setNumero(1);
		sala1.setCapacidad(300);
		
		Sala sala2 = new Sala();
		sala2.setNumero(1);
		sala2.setCapacidad(300);
		
		cine.getSalas().add(sala1);
		cine.getSalas().add(sala2);
		
		return new ResponseEntity<Cine>(cine,HttpStatus.OK);
	}	
	
	
	
    @PostMapping("/addCine")
    public ResponseEntity<Cine> huevoFrito(@RequestBody Cine cine) {
		
    	return new ResponseEntity<Cine>(cine,HttpStatus.OK);
    }
	
}
