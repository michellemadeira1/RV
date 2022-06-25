package util;

public class List<T> {

	// generics
	
	private Node<T> head;// a cabeca nula / iniciando com ele nulo
	
	public void add(T value) { // com o objeto pode colocar qualquer tipo de objeto.
		Node<T> node = new Node<T> ();// instanciando um novo no
		node.setValue(value); // atribuindo o valor
		node.setNext(head);// a acabeca atualizada o primeiro no
		head = node; // o segundo no se tornando a cabeca / insercao na lista 
		
	}
	
	
	@Override // esta extendendo da classe object / esta sobrescrevendo implenentando novamente um metodo toString na sub classe object / o override serve para indicar isto. 
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		
		
		Node<T> p = head;
		while (p != null) { // rodando enquanto o p for diferente de nulo
			sb.append(p.getValue() + " "); // acrescentando 
			p = p.getNext(); // apontando para o proximo no
		}
		
		sb.append("]");
		return sb.toString();
		
	}
	
}
