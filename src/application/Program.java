package application;

import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		
		int n;
		Rent[] rent = new Rent[10];
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("How many rooms will be rented? ");
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.printf("\nRent #%d:%n", i + 1);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			rent[room] = new Rent(name, email);
		}
		
		System.out.println("\nBusy rooms:");
		for(int i = 0; i < rent.length; i++) {
			if(rent[i] != null) {
				System.out.printf("%d: %s%n", i, rent[i]);
			}
		} 
		
		sc.close();
	}
}
