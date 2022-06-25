package util;

public class Node {

	private Double value;
	private Node next; // tipo de definicao recursiva / valor e atributo do tipo node
	
	
	public Double getValue() {
		return value;
	}
	
	public void setValue(Double value) {
		this.value = value;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	
	 
}
