package com.behoh.projeto.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/eventos")
public class EventoResources {
	
	@GetMapping()
	public String listar() {
		return "Rest está funcionando";
	}

}
