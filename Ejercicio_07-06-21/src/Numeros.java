import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Debe diseñar un programa que reciba 3 números por consola y determine 
		 * cual de los 3 números es el mayor. 
		 * Plus: Imprimir los números ordenados de mayor a menor. 
		 * Plus: Imprimir los números ordenados de menor a mayor. 
		 */

		Scanner leerNumero = new Scanner(System.in);
		
		System.out.println("¡Bienvenido!");
		
		System.out.println("Ingrese el primer numero: ");
		int numero1 = leerNumero.nextInt();
		
		System.out.println("Ingrese el segundo numero: ");
		int numero2 = leerNumero.nextInt();
		
		System.out.println("Ingrese el tercer numero: ");
		int numero3 = leerNumero.nextInt();
		
		leerNumero.close();
		
		NumeroMayor(numero1, numero2, numero3);
	}
	
	public static void NumeroMayor(int numero1, int numero2, int numero3) {
		int numeroMayor = 0;
		String mensaje = "Los numeros son iguales";
		
		if(numeroMayor < numero1){
			numeroMayor = numero1;
			mensaje = "El primer numero ingresado fue el mayor";
		}
		if(numeroMayor < numero2) {
			numeroMayor = numero2;
			mensaje = "El segundo numero ingresado fue el mayor";
		} 
		if (numeroMayor < numero3){
			numeroMayor = numero3;
			mensaje = "El tercer numero ingresado fue el mayor";
		} 
		
		
		System.out.println(mensaje);
		System.out.println("El numero es: " + numeroMayor);
	}

}
