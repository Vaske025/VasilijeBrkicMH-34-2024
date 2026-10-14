package vezbe;

import java.util.Scanner;

public class Main {
	
// Deklarisanje i inicalizacija
	public static void prvaVezba() {
//    	Deklarisanje
		int broj;
//		Inicilizacija
		broj = 50;
		broj = 20;
		broj = 30;
//		Nevalidno
//		broj = "Tekst";
//		broj = 50.5;
		
//		Deklarisanje i inicalizacija istovrmeneo
		double decimalniBroj = 50.5;
		String tekst = "Nas prvi string";
		
		System.out.println(broj);
		System.out.println("Decimalni broj koji imamo je: " + decimalniBroj);
		System.out.println(tekst);
	}
	
	
// 	Parni i neparni brojevi - if else struktura	
	public static void drugaVezba() {
// Scanner sluzi za prikupljanje inputa za konzole
		Scanner scanner = new Scanner(System.in);
		System.out.println("Unesite broj : ");
		int broj = scanner.nextInt();
		
		if(broj % 2 == 0) {
			System.out.println("Broj " + broj + " je paran");
		}else {
			System.out.println("Broj " + broj + " je neparan");
		}
		
		
	}

	
	public static void trecaVezba() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Unesite broj : ");
	int broj = scanner.nextInt();
	
//		For petlja
		for(int i = 0; i <= broj; i++ ) {
			System.out.println(i);
		}
	
//		While petlja
		int i = 0;
		while(i <= broj) {
			System.out.println(i);
			i++;
			
		}
				
	}
	
	
	public static void main(String[] args) {
		trecaVezba();

	}

}
