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
	}

}
