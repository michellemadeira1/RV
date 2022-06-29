package com.rv.id.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //Anotação que serve para definir uma classe como pertencente à camada de Serviço da aplicação.
public class PayService {

	@Autowired //fornece controle sobre onde e como a ligação entre os beans deve ser realizada. Pode ser usado para em métodos setter, no construtor, em uma propriedade ou métodos com nomes arbitrários e / ou vários argumentos.
	private TaxService taxService;
	
	@Autowired
	private DeliverService deliverService;
	

	public double finalPrice(double cost, String state) {
		return cost + deliverService.fee(state)+ taxService.tax(cost);
	}
	
}
