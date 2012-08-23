package com.xawiahn.ovning_J1_1;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		int tal1, tal2, produkt, summa;
		Scanner sc = new Scanner(System.in);
		System.out.print("Skriv in tal1: ");
		tal1 = sc.nextInt();
		System.out.print("Skriv in tal2: ");
		tal2 = sc.nextInt();
		produkt = tal1 * tal2;
		summa = tal1 + tal2;
		System.out.println("Produkten: " + tal1 + " * " + tal2 + " = " + produkt);
		System.out.println("Summan: " + tal1 + " + " + tal2 + " = " + summa);
	}

}
