package com.rv.id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rv.id.services.PayService;

@SpringBootApplication
public class IdSpringApplication implements CommandLineRunner {

	@Autowired // fornece controle sobre onde e como a ligação entre os beans deve ser realizada. Pode ser usado para em métodos setter, no construtor, em uma propriedade ou métodos com nomes arbitrários e / ou vários argumentos.
	private PayService payService;
	
	public static void main(String[] args) {
		SpringApplication.run(IdSpringApplication.class, args);
	}
 
	@Override
	public void run(String...args) throws Exception{
		System.out.println("resultado = " + payService.finalPrice(300.0,"Sc"));
	}
}
