package house;


import java.util.Locale;
import java.util.Scanner;


public class calculadora {
	
	
	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		//nO IMPORTAQUE SEA INT O DOUBLE
		
		double operando1;
		double operando2;
		double resultado=0;
		
		
		//Nos pide los operadores y el signo de operacion 
		System.out.println("Escribe el operando 1 :");
		operando1=sc.nextDouble();
		
		System.out.println("Escribe el codigo de operacion :");
		String operacion = sc.next();
		
		System.out.println("Escribe el operador 2 :");
		operando2=sc.nextDouble();
		
		switch(operacion)
		 {
		 case "+":			
			resultado=operando1+operando2;
		 break;
		 case "-":			
			 resultado=operando1-operando2;
		 break;
		 case "*":
			 resultado=operando1*operando2;
		 break;
		 case "/":
			 if(operando2 == 0)
			 {
				 System.out.println("ERROR, STUPED :");
			 }
			 else {
				 resultado=operando1/operando2;
			 }
		 break;
		 case"^":
			 	resultado=(int)Math.pow(operando1, operando2);
		 break;
		 case "%":
			 	resultado=operando1%operando2;
		 break;
				
		}
		
		System.out.println(operando1+"  "+operacion+"  "+operando2+" = "+resultado);
		
		
	}

}
