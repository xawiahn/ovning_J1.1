package com.xawiahn.ovning_J1_1;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		double tal1, tal2, tal3, summa, medelvardet;
		Scanner sc = new Scanner(System.in);
		System.out.print("Skriv in tal1: ");
		tal1 = sc.nextDouble();
		System.out.print("Skriv in tal2: ");
		tal2 = sc.nextDouble();
		System.out.print("Skriv in tal3: ");
		tal3 = sc.nextDouble();
		summa = tal1 + tal2 + tal3;
		medelvardet = summa / 3;
		System.out.println("(" + tal1 + " + " + tal2 + " + " + " + " + tal3 + ") / 3 = " + medelvardet);
	}

}
