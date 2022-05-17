public class Main {

	public static void main(String[] args) {
		List listaEnlazada = new List();
		listaEnlazada.addNodo("Oliver");
		listaEnlazada.addNodo("Juan");
		listaEnlazada.addNodo(28);
		
		System.out.println("primer elemento: "+listaEnlazada.obtener(0));
		System.out.println("segundo elemento: "+listaEnlazada.obtener(1));
		System.out.println("tercer y último elemento: "+listaEnlazada.obtener(2));
		

	}

}
