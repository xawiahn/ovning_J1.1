package com.xawiahn.ovning_J1_1;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		/* �VNING J1.2
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
		*/
		
		
		/* �VNING J1.3
		int tal1, tal2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Skriv in tal1: ");
		tal1 = sc.nextInt();
		System.out.print("Skriv in tal2: ");
		tal2 = sc.nextInt();
		if(tal1 > tal2)
		{
			System.out.println(tal1 + " �r st�rre �n " + tal2);
		}
		else if(tal1 == tal2)
		{
			System.out.println(tal1 + " och " + tal2 + " �r lika stora");
		}
		else
		{
			System.out.println(tal2 + " �r st�rre �n " + tal1);
		}
		*/
		
		
		/* �VNING J1.4
		int tal[] = new int[3], storsta = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Skriv in tal1: ");
		tal[0] = sc.nextInt();
		System.out.print("Skriv in tal2: ");
		tal[1] = sc.nextInt();
		System.out.print("Skriv in tal3: ");
		tal[2] = sc.nextInt();
		for(int i = 0; i < 3; i++)
		{
			if(tal[i] > storsta)
			{
				storsta = tal[i];
			}
		}
		System.out.println(storsta + " �r det st�rsta talet");
		*/
		
		
		/* �VNING J1.5
		int summa = 0, tal;
		Scanner sc = new Scanner(System.in);
		System.out.println("Skriv '0' f�r att avsluta programmet");
		do
		{
			System.out.print("Skriv in ett tal: ");
			tal = sc.nextInt();
			summa += tal;
			
			
		}while(tal != 0);
		System.out.println("Summan av de talen du skrev in blir: " + summa);
		*/
		
		/* �VNING J.6
		int tal[] = new int[10], jamnfortal, antal = 0;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 10; i++)
		{
			System.out.print("Skriv in ett tal: ");
			tal[i] = sc.nextInt();			
			
		}
		System.out.print("Skriv in ett tal att j�mf�ra med: ");
		jamnfortal = sc.nextInt();
		for(int n = 0; n < 10; n++)
		{
			if(tal[n] > jamnfortal)
			{
				antal += 1;
			}
		}
		System.out.println(antal + " av dom talen du skrev in innan �r st�rre �n talet du j�mf�rde med");
		*/
		
		
		double poang[] = new double[10], rensadepoang[] = new double[8], storsta = 0, minsta, slutpoang = 0;
		int raknare = 0;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 10; i++)
		{
			System.out.print("Skriv in ett domarpo�ng: ");
			poang[i] = sc.nextDouble();			
		}
		minsta = poang[0];
		for(int n = 0; n < 10; n++)
		{
			if(poang[n] > storsta)
			{
				storsta = poang[n];
			}
			if(poang[n] < minsta)
			{
				minsta = poang[n];
			}
		}
		for(int m = 0; m < 10; m++)
		{
			if(storsta != poang[m] && minsta != poang[m])
			{
				rensadepoang[raknare] = poang[m];
				raknare += 1;
			}
		}
		System.out.println("Original domarepo�ng: ");
		for(int p = 0; p < 10; p++)
		{
			System.out.print(poang[p] + " ");
		}
		System.out.println("Domarepo�ng med minsta och st�rsta v�rdet borttagit: ");
		for(int t = 0; t < 8; t++)
		{
			System.out.print(rensadepoang[t] + " ");
		}
		for(int r = 0; r < 8; r++)
		{
			slutpoang += rensadepoang[r];
		}
		slutpoang /= 8;
		System.out.println("Slutpoang blir: " + slutpoang);
	}

}
