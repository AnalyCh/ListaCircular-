package estructuras;

import org.omg.CORBA.FREE_MEM;

public class ListaCircular {
	
	protected Nodo inicio;
	protected Nodo ultimo;
	protected int tam;
	
	public ListaCircular() {
		inicio=null;
		ultimo=null;
		tam=0;
	}
	

	private void enlazar(Nodo nodA, Nodo nodB){

		nodA.siguiente=nodB;
		nodB.anterior=nodA;
	}
	
	public void insertarInicio(String c){
		
		Nodo nuevo= new Nodo(c);
		if(estaVacio()){
			inicio=ultimo=nuevo;
			
		}
		else{
			nuevo.setSiguiente(inicio);
			inicio.setAnterior(nuevo);
			inicio=nuevo;
			inicio.setAnterior(ultimo);
			ultimo.setSiguiente(inicio);
		}
		tam++;
	}
	

	public void insertarFinal(String c){
		Nodo nuevo= new Nodo(c);
		if(estaVacio()){
			inicio=ultimo=nuevo;
		}
		else{
			ultimo.setSiguiente(nuevo);
			nuevo.setAnterior(ultimo);
			ultimo=nuevo;
			inicio.setAnterior(ultimo);
			ultimo.setSiguiente(inicio);
		}
		tam++;
	}

	public void borrarPos(int n){
		int i=0;
		Nodo aux=inicio;
		Nodo previo;
		for(aux=inicio, i=0; i<tam; i++){
			previo=aux;
			aux= aux.getSiguiente();
			if(n==1){
				
				ultimo.siguiente=previo.siguiente;
				aux.anterior=previo.anterior;
				inicio=aux;
				tam--;
				break;
			}
			else if(i==n-1){
			
				previo.siguiente=previo.siguiente;
				aux.siguiente.anterior=previo;
				tam--;
				break;
			}
		}
	}
	
	public void buscarLetra(String c){
		Nodo aux;
		Nodo aux2;
		int i=0, f=0;
		for(aux=inicio,  i=0; i<tam;i++,aux=aux.getSiguiente()){
			if(aux.getContenido()==c){
				System.out.println("Elemento encontrado "+ aux.getContenido());
				f++;
			}
		}
		if(f==0){
			System.out.println("Elemento no encontrado "+c);
		}
		imprimir();
	
	}

	
	public boolean estaVacio(){
		return (inicio==null);
	}
	
	public void imprimir(){
		if(estaVacio()){
			System.out.println("Lista vacia");
		}
		else{
			int i=0;
			Nodo aux= inicio;
			for(aux=inicio, i=0; i<tam;i++, aux=aux.getSiguiente()){
				System.out.print(aux.getContenido()+" ");
			}
			System.out.println(" ");
		}
	}
	

	
	
	public void imprimirRev(){
		int i;
		Nodo aux;
		if(estaVacio()){
			System.out.println("esta vacia");
		}
		else{
			for(aux=ultimo, i=0; i<tam; i++, aux=aux.anterior){
				System.out.print(aux.getContenido()+" ");
			}
			System.out.println(" ");
		}
	}

}
