
import java.util.Scanner;
public class ParImpar {
	public static void main(String [] args){
		Scanner teclado= new Scanner (System.in);
		System.out.println("Introduzca un numero");
		int num = teclado.nextInt();
		if (num%2==0) 
			System.out.println("El numero es par");
		else 
			System.out.println("El numero es impar");
		
	}

}
