package house;
import java.util.Scanner;
public class kitchen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1, n2;
		Scanner sc = new Scanner(System.in);
			System.out.println("Introduce un numero entero :");
			n1 = sc.nextInt();
				System.out.println("Introduce otro numero entero :");
			n2 = sc.nextInt();
			System.out.println("Ha introducido los numero :"+n1+" y "+n2);
			System.out.println("La suma es "+(n1+n2));
			System.out.println("La resta es "+(n1-n2));
			System.out.println("La multiplicacion es "+(n1*n2));
			System.out.println("La divicion es "+(n1/n2));
	}

}
