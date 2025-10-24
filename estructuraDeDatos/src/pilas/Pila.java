package pilas;
import nodo.Nodo;
public class Pila<T> {	
	private Nodo<T> cabeza;
	private int size;

	
	public Pila() {
		cabeza = null;
		size = 0;
	}
	
	public Nodo<T> push(T valor){
		
		
		return null;
	}
	
	public T pop() { //elimina la cabeza, devuelve el valor eliminado
		Nodo<T> aux = null;
		if(!isEmpty()) {
			aux = this.cabeza;
			this.cabeza = this.cabeza.getSiguinte();
			this.size--;
		}
		return aux.getValor();
	}
	
	public Nodo<T> peek() { //devuelve el valor de la cabeza
		return cabeza;
	}
	
	public boolean isEmpty() {//comprueba si esta vacia la pila
		if(cabeza == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public int getSize() { //obtiene el tamaño de la pila
		return size;
	}
}
