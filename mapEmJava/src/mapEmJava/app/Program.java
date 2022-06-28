package mapEmJava.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Na contagem de votos de uma eleição , são gerados vários registros de votação
//contendo o nome do candidato e a quantidade de votos (formato.csv) 
//que ele obteve em uma urna de votação . Você deve fazer um programa para ler os registros 
//de votação a partir de um arquivo , e daí gerar um relatório consolidado com os totais de cada candidato.

public class Program {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in); // criando um scanner para ler os dados 

	     Map<String, Integer> map = new HashMap<>();
	     
		
		
		System.out.print("Digite o caminho do arquivo: ");// perguntando para o usuario
		String path = sc.nextLine();// para entrada de dados do arquivo 

		try (BufferedReader br = new BufferedReader(new FileReader(path))) { // para ler o arquivo

			String line = br.readLine(); // lendo uma linha do arquivo
			while (line != null) {  
				
	            String[] fields = line.split(",");// criando um vetor com nome fields / split -> e uma funcao de string que recorta o string com base na espresao dentre aspas
				
				String name = fields[0];
				Integer votes = Integer.parseInt(fields[1]);
				
				if(map.get(name) == null) {// volta nulo quando o elemento nao existe 
				   map.put(name, votes);// adicionando no mapa name e votes
				
				}
				else {
					map.put(name, votes + map.get(name));// obter o que ja tem e somar com o novo votes que acabou de ler 
				}
				
	            
	            line = br.readLine(); // lendo a proxima linha 
			}
		
			for (String key : map.keySet()) {
				System.out.println(key +":" + map.get(key));
			}
			 
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();

	}

}
