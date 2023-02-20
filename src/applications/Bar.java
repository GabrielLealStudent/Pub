package applications;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class Bar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Bill bc;

		bc = new Bill();

		System.out.print("Sexo: ");
		bc.gender = sc.next().charAt(0);

		System.out.print("Quantidade de cervejas: ");
		bc.beer = sc.nextInt();

		System.out.print("Quantidade de refrigerantes: ");
		bc.softDrink = sc.nextInt();

		System.out.print("Quantidade de espetinhos: ");
		bc.barbecue = sc.nextInt();
		System.out.println();

		System.out.println("RELATÓRIO:");

		System.out.printf("Consumo = R$ %.2f%n", bc.feeding());
		if (bc.feeding() > 30) {
			System.out.printf("Isento de Couvert%n");
		} else {
			System.out.printf("Couvert = R$ %.2f%n", bc.cover());
		}

		System.out.printf("Ingresso = R$ %.2f%n%n", bc.ticket());

		System.out.printf("Valor a pagar = R$ %.2f", bc.total());

		sc.close();

	}

}
