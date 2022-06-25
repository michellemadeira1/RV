package defaultPackage;

public class Funcionario {
 
	// (VARIAVEIS) -> ATRIBUTOS (DADOS)
	
	public String nome;
	public double valorPorHora;
	public int horas;
	
	
	// METODOS -> (FUNCOES)(COMPORTAMENTO)
	
	public double total() {
		return valorPorHora * horas;
	}
	 
	
}
