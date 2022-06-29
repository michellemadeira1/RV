package application;

import services.DeliverService;
import services.PayService;
import services.TaxService;

public class Program {

	public static void main(String[] args) {
		 
		TaxService taxService = new TaxService();
		DeliverService deliverService = new DeliverService();
		
		PayService payService = new PayService(taxService, deliverService);
		
		System.out.println("resultado = " + payService.finalPrice(300.0,"Sc"));
	}

}
