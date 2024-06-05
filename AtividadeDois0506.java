package vetores;

import java.util.ArrayList;

public class AtividadeDois0506 {

	public static void main(String[] args) {
		int soma = 0; 

		ArrayList<Integer> numeros = new ArrayList<>();
		
		numeros.add(-5);
		numeros.add(-10);
		numeros.add(-15);
		numeros.add(10);
		numeros.add(-25);
		
		for(int numero : numeros) {
			if(numero < 0 ) {
				soma = soma + numero;
			}
			
		}
		System.out.println("A soma dos números negativos é de: " +soma);
	}
}
