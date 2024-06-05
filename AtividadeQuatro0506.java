package vetores;

import java.util.ArrayList;
import java.util.Scanner;
public class AtividadeQuatro0506 {

	public static void main(String[] args) {
		int a;
		Scanner ler = new Scanner(System.in);

		ArrayList<String> carros = new ArrayList<String>();
		carros.add("Fusca");
		carros.add("Parati");
		carros.add("Brasília");
		carros.add("Voyage");
		carros.add("Kombi");
		carros.add("Opala");
		carros.add("Ford mustang");
		carros.add("Montana");
		carros.add("Impala");
		carros.add("Jeep Renegade");

		System.out.println(carros);
		System.out.println("Informe qual carro você deseja ver(0-9): ");
		a = ler.nextInt ();

		System.out.println(carros.get(a));
		ler.close();

	}

}
