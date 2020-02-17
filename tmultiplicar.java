package house;

import java.util.Scanner;
public class tmultiplicar {

	private static Scanner entrada;	
	
	public static void main(String[] args) {
		
		entrada = new Scanner(System.in);
		
		int tabla;
		int resultado;
		int i;
		
		System.out.println("Introduce un numero :");
		tabla = entrada.nextInt();
		
		for(i=0; i<=10; i++)
		{
		
			resultado = tabla*i;
			System.out.println(tabla +" x " + i +" = " + resultado);
		}
		

	}

}
