package vetores;

import java.util.ArrayList;

public class AtividadeTres0506 {

	public static void main(String[] args) {

		ArrayList<String> frutas = new ArrayList<>();


		frutas.add("Maça");
		frutas.add("Pitaya");
		frutas.add("Amora");
		frutas.add("Uva");
		frutas.add("Jabuticaba");
		frutas.add("Melão");
		frutas.add("Caju");
		frutas.add("Melancia");
		frutas.add("Abacaxi");
		frutas.add("Mamão");

		System.out.println(frutas);

		frutas.remove(4);
		frutas.remove(3);
		frutas.remove(2);
		frutas.remove(1);
		frutas.remove(0);

		System.out.println(frutas);
		System.out.println(frutas.size());


	}
}

