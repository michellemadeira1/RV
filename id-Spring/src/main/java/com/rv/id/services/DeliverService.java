package com.rv.id.services;

import org.springframework.stereotype.Service;

@Service //Anotação que serve para definir uma classe como pertencente à camada de Serviço da aplicação.
public class DeliverService {

	public double fee(String state) {
		if ("SP". equalsIgnoreCase(state)) {
			return 10.0;
		}
		else {
			return 20.00;
		
		}
	}
}
