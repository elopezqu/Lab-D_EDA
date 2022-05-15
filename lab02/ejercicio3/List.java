public class List {
	
	Node root;
	int size;
	//Al crear la lista todavía no tiene "root", por eso es nulo
	public List() {
		root=null;
	}
	public void addNodo(Object obj) {
		//Si la lista no tiene "root", el nuevo elemento se convierte en el "root"
		if(root == null)
			root= new Node(obj);
		//Caso contrario el nuevo elemento se convierte en el "root", y los demás recorren un espacio
		else {
			Node temp = root;
			Node nuevo= new Node(obj);
			nuevo.enlazarSiguiente(temp);
			root=nuevo;
		}
		size++;
	}
	//Recorre la lista uno a uno hasta llegar al index-1, que sería el que buscamos 
	//Posteriormente retornamos su valor
	public Object obtener(int index) {
		int contador = 0;
		Node temporal = root;
		while(contador<index) {
			temporal=temporal.obtenerSiguiente();
			contador++;
		}
		return temporal.obtenerValor();
	}	
}
