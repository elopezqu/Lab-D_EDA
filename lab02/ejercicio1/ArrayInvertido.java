public class ArrayInvertido{
	public static void main(String[] args){
		int num[] = {1,2,3,4,5};
		System.out.println("Array inicial: ");
		for(int i=0;i<num.length;i++){
			System.out.print(num[i]+" ");
		}
		System.out.println("");
		num = invertirArray(num);
		System.out.print("Array invertido: ");
		for(int i=0;i<num.length;i++){
			System.out.print(num[i]+" ");
		}
		System.out.println("");
	}
	public static int[] invertirArray(int[] A){
		int Ain[] = new int[A.length];
		for(int i=A.length-1,int f=0;i>=0;i--,f++){
			Ain[f] = A[i];
		}
		return Ain;
	}
}
