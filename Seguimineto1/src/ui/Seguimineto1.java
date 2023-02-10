package ui;

public class Seguimineto1 {

	
	
	/*
	 * punto 1
	 * Sumar array de forma recursiva
		Cree un método llamado sum que reciba un arreglo de enteros y que calcule la sumatoria de todos los números del arreglo. 
		El método debe devolver un entero.

	 */
	
	public static void recorrido (int[] lista, int i){
		
		System.out.print(lista[i] +" ");
		
		
		if (i == lista.length-1) {
			
			return;
		}else {
			
			recorrido(lista,i+1);
		}
		
	}
	
	public static int sum(int inicio, int fin, int[] lista ) {
		
		if(inicio == fin) {
			
			return lista[inicio];
			
		}
		
		int mitad = (inicio + fin)/2 ; //parti el arreglo en mitades
		
		int parte1 = sum(inicio,mitad,lista);
		int parte2 = sum(mitad+1, fin, lista);
		
		
		return parte1 + parte2;
		
		
	}
	/**
	 * punto 2
	 */
	public static String revertir(String str) {
		
		if (str.length() <= 1) {
			
			return str;
			
		}
		
		return revertir(str.substring(1)) + str.charAt(0);
		
		
		
	}
	
	/*
	 * punto 3
	 * 
	 */
	

	public static double prom(int inicio, int fin, int[] lista ) {
		
		if(inicio == fin) {
			
			return lista[inicio];
			
		}
		
		int mitad = (inicio + fin)/2 ; //parti el arreglo en mitades
		
		double parte1 = prom(inicio,mitad,lista);
		double parte2 = prom(mitad+1, fin, lista);
		
		double total = (parte1 + parte2) ;
		
		return total ;
	}
	
	
	/*
	 * punto 4
	 * 
	 * 
	 */
	
	public static int posicion(int[] arr, int position) {
		
		        if (position < 0 || position >= arr.length) {
		        	
		            throw new IllegalArgumentException("Invalid position");
		        }
		        return select(arr, position, 0);
		    }
		    
	private static int select(int[] arr, int position, int start) {
		
		if (start == position) {
		   return arr[start];
		   }
	return select(arr, position, start + 1);
	}
		
		
	
	
	/*
	 * punto 5
	 */
	public static double div() {
		return 1.0;
	}
	
	/*
	 * punto 6
	 */
	
	public static int mcd() {
		return 1;
	}
	
	/*
	 * punto 7
	 */
	public static int cash() {
		
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
//		int[] list = new int[] {1,2,3,4,5,6};
		
//		System.out.print(prom(0,list.length-1,list)/ list.length);
		
//		String str = "hello world" ;
//		String reverse = revertir(str);
//		System.out.print(reverse);

	}

}
