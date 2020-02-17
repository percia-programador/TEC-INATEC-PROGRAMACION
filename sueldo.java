package house;


import java.util.Scanner;
public class sueldo {
			
	
	private static Scanner entrada;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		entrada =new Scanner (System.in);
		
		int horas;
		int sueldo;
		System.out.print("¿ cuantos horas has trabajado en esta semana  :");
		
		horas=entrada.nextInt();
		sueldo = horas*20;
		
		System.out.println("Tu sueldo esta semana es de : C$"+sueldo);
		
		
		
		

	}

}
