package com.marcos.restMarcos;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.marcos.restMarcos.datos.cines.Cine;

import static org.junit.jupiter.api.Assertions.assertTrue;


@SpringBootTest
class RestMarcosAulaApplicationTests {

	@Test
	void pruebaGET() throws URISyntaxException {
		
		URI myURL = new URI("http://localhost:8080/cine");
		RequestEntity<Cine> request = new RequestEntity<Cine>(HttpMethod.GET, myURL);
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Cine> response;
		response = 	restTemplate.exchange(request,Cine.class); 
		
		assertTrue(response.hasBody());
	}


	@Test
	void pruebaPOST() throws URISyntaxException {
		
		Cine cine = new Cine();
		cine.setNombre("Narnia Cinema SA");
		cine.setLugar("Narnia");
		
		
		URI myURL = new URI("http://localhost:8080/addCine");
		RequestEntity<Cine> request = new RequestEntity<Cine>(cine,HttpMethod.POST, myURL);
		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Cine> response;
		response = 	restTemplate.exchange(request,Cine.class); 
		
		assertTrue(response.hasBody());
		assertTrue(request.hasBody());
	}
}
