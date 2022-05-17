import java.util.Scanner;

public class RotacionALaIzquierdaDeUnArray {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] A = {1,2,3,4,5,6,7,8,9};
		
		System.out.print("Ingrese una poscicion : ");
		int pos = scan.nextInt();
		
		int[] Aiz = rotarIzquierdaArray(A, pos);	
		
		System.out.print("Arreglo original : \n");
		imprimirArreglo(A);
		
		System.out.print("IArreglo rotado a la izquierda : \n");
		imprimirArreglo(Aiz);	
	}
	
	private static int[] rotarIzquierdaArray(int[] A, int pos) {
		int[] Aiz = new int[A.length];
		
		for(int i=pos; i<A.length; i++) 
			Aiz[i-pos]=A[i];
		
		for(int i=0; i<pos; i++)
			Aiz[A.length-pos+i]=A[i];

		return Aiz;
	}
	
	private static void imprimirArreglo(int[] a) {
		System.out.print("{");
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]+" ");
		System.out.print("} \n");	
	}
}
