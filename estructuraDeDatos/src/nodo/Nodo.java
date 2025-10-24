package nodo;

public class Nodo<T> {

	private T valor;
	private Nodo<T> siguiente;
	
	public Nodo(T valor, Nodo<T> siguiente){
		this.valor = valor;
		this.siguiente = siguiente;
	}
	
	public  T getValor() {
		return valor;
	}
	
	public void setValor(T valor) {
		this.valor = valor;
	}
	
	public Nodo<T> getSiguinte() {
		return siguiente;
	}
	
	public void setSiguiente(Nodo<T> siguiente) {
		this.siguiente = siguiente;
	}
	
}
