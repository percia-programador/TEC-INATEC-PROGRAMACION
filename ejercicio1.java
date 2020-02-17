
package house;
import java.util.Scanner;
public class ejercicio1 {

	private static Scanner entrada;
	
	public static void main(String[] args) {		
		// TODO Auto-generated method stub
		entrada = new Scanner (System.in);
		
		//Declaramos variables
			String nombre_alumno; 
			double evaluacion1;
			double evaluacion2;
			double evaluacion3;
			double evaluacion_final;
			
			//Pedimos valores de las variables
			
			System.out.println("Nombre alumno :");
			nombre_alumno = entrada.nextLine();
			
			System.out.println("Nota primera evaluacion :");
			evaluacion1 = entrada.nextDouble();
			
			System.out.println("Nota segunda evaluacion :");
			evaluacion2 = entrada.nextDouble();
			
			System.out.println("Nota tercera evaluacion :");
			evaluacion3 = entrada.nextDouble();
			
			evaluacion_final = (evaluacion1 + evaluacion2 + evaluacion3)/3;
			System.out.println("La nota media de "+ nombre_alumno +" .Es de :"+ evaluacion_final);
		
		
	}

}
