package vetores;

import java.util.ArrayList;
import java.util.Scanner;

public class AtividadeCinco0506 {

	public static void main(String[] args) {
		 
		Scanner ler = new Scanner(System.in);
		ArrayList<String> ingredientes = new ArrayList<String>();
		
		
		ingredientes.add("Leite Condensado");
		ingredientes.add("Granola");
		ingredientes.add("Nutela");
		ingredientes.add("Morango");
		ingredientes.add("Uva");
		ingredientes.add("Kiwi");
		ingredientes.add("Leite em pó");
		ingredientes.add("Cereja");
		ingredientes.add("Banana");
		ingredientes.add("Abacaxi");
		
		System.out.println(ingredientes);
		System.out.println("O que deseja realizar: [1]Adicionar, [2]Remover, [3]Manter: ");
		int opcao = ler.nextInt();
		
		if(opcao == 1 ) {
			System.out.println("O que deseja adicionar?");
			ingredientes.add(ler.next());
			System.out.println("Lista: ");
			System.out.println(ingredientes);
		}
		else if(opcao == 2 ) {
			System.out.println("O que deseja remover [0-9]?");
			ingredientes.remove(ler.nextInt());
			System.out.println("Lista nova: ");
			System.out.println(ingredientes);
		}
		else {
			System.out.println("Ingredientes: ");
			System.out.println(ingredientes);
		}

		ler.close();
	}
	
}
