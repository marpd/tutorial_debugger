

public class LlenarNumeros {

	
	public static void main(String[] args) {
		int n = 5;
		int[] tabla;
		tabla = llenar(n);
		int suma = sumar(tabla);
		System.out.println("La suma es: " + suma);
	}

	public static int[] llenar(int n) {
		int[] tabla = new int[n];
		todosPorN(tabla, 10);
		return tabla;
	} //Llenar tabla

	private static void todosPorN(int[] tabla, int n) {
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = i* n;
		}
	}


	public static int sumar(int[] tabla) {
		int suma = 0;
		for (int j : tabla) {
			suma = suma + j;
		}
		return suma;
	} // Sumar tabla
	
} // Fin clase
