package app;

import java.util.Locale;
import java.util.Scanner;

import util.List;

// TYPE SAFETY -> nao contem isso se deixarmos como object
// TYPE SAFETY -> (SEGURANCA DE TIPO) evitar erro de execucao

public class Program {

	public static void main(String[] args) {
		// generics

			
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			
			List<Double> list = new List<Double>(); // intanciando a lista / iniciando vazia o head esta nulo
			
			int op;
			do {
				showMenu();
				op = sc.nextInt();
				
				switch (op) {
				case 1:{
					System.out.print("Digite um numero: ");
					double value = sc.nextDouble();
					list.add(value);
					
					break;
				}
				case 2:{
					System.out.println(list.toString());
					break;
				}
				case 3:{
					System.out.println("Fim do programa!");
					break;
				}
				default:
					System.out.println("Opção inválida!");
				}
				
			}while(op!=3);
			
			
		sc.close();
		}

		public static void showMenu() {
			System.out.println("1- Inserir elemento na lista");
			System.out.println("2- Mostrar lista");
			System.out.println("3- Sair");
		}
	
	}

