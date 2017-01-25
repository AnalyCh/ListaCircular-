package estructuras;

public class Nodo {
	
	protected String contenido;
	protected Nodo anterior;
	protected Nodo siguiente;
	
	public Nodo(String contenido, Nodo anterior, Nodo siguiente) {
		
		this.contenido = contenido;
		this.anterior = anterior;
		this.siguiente = siguiente;
	}

	public Nodo(String i) {
		contenido=i;
		anterior=siguiente=null;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public Nodo getAnterior() {
		return anterior;
	}

	public void setAnterior(Nodo anterior) {
		this.anterior = anterior;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}

	@Override
	public String toString() {
		return "Nodo [contenido=" + contenido + ", anterior=" + anterior + ", siguiente=" + siguiente + "]";
	}
	
	
	
	
	
	

}
