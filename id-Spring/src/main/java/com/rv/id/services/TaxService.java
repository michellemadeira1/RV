package com.rv.id.services;

import org.springframework.stereotype.Service;

@Service //Anotação que serve para definir uma classe como pertencente à camada de Serviço da aplicação.
public class TaxService {

	
	public double tax(double value) {
		return value * 0.1;
	}
	
}
