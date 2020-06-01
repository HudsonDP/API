package com.api.pedido;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController{
	
	@GetMapping("/endpoint")
	public String index() {
		
		return "OK...";
		
	}
}