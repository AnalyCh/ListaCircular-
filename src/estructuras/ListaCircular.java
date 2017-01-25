package estructuras;

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
/*
 * void search()
{
    int count = 0, key, i, f = 0;

    printf("\nenter the value to be searched:");
    scanf("%d", &key);

    if (first == last && first == NULL)
        printf("\nlist is empty no elemnets in list to search");
    else
    {
        for (ptr = first,i = 0;i < number;i++,ptr = ptr->next)
        {
            count++;
            if (ptr->val == key)
            {
                printf("\n the value is found at position at %d", count);
                f = 1;
            }
        }
        if (f == 0)
            printf("\n the value is not found in linkedlist");
    }
}
 */
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
	


}
