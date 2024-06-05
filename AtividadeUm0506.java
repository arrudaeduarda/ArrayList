package vetores;

import java.util.ArrayList;
import java.util.Scanner;

public class AtividadeUm0506 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int soma = 0;
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();

		numeros.add(5);
		numeros.add(10);
		numeros.add(15);
		numeros.add(20);
		numeros.add(25);
		
		 for(int numero : numeros) {
			 if(numero %2 == 0) {
	    	   soma = soma +numero;
			 }
			 System.out.println("A soma resulta em: "+soma);
	       } 	
		
		ler.close();
	}

}
