package house;

import java.util.Scanner;
public class contraseņa {
	
	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sc = new Scanner(System.in);
		String contraseņa="percia";
		
		
		final int INTENTOS = 3;
		
//Esta variable booleana, nos controlara que en caso de que acierte la condicion cambie
		
		boolean acierto=false;
		
		String password;
		
		
		for(int i=0;i<INTENTOS && !acierto; i++)
		{
			System.out.println("Introduce una contraseņa :");
			password = sc.next();
			
			
//Comprobamos si coincide, no usamos ==, usamos el metodo aquals
			
			if (password.equals(contraseņa))
			{
				System.out.println("Felicidades, acertastes");
				acierto=true;								
			}
			else {
				System.out.println("No acertaste");
			}
			
			
			
			
			
		}
		
		
		
		
		
		
		
	}

}
