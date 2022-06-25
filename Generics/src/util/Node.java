package util;

public class Node <T> {// parametrizando o node para ele ficar generico { generico -> parametrizar}
      // generics
	
	private T value; // (private Object Value) quando troca para object o node aceita qualquer tipo /, strinh , int , double. 
	private Node<T> next; // node vai ser do  mesmo tipo T
	
	
	public T getValue() {
		return value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
	
	public Node<T> getNext() {
		return next;
	}
	 
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	
}
