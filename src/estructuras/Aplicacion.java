package estructuras;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListaCircular lista= new ListaCircular();
		
		lista.insertarInicio("n");
		lista.imprimir();
		lista.insertarInicio("y");
		lista.imprimir();
		lista.insertarFinal("a");
		lista.imprimir();
		lista.buscarLetra("a");
		lista.buscarLetra("h");
		lista.borrarPos(1);
		lista.imprimir();
		lista.imprimirRev();

	}

}
