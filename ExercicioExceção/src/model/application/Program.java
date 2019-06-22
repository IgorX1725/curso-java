package model.application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.println("Enter account data");
		System.out.print("Number:");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder:");
		String holder = sc.nextLine();
		System.out.print("initial balance:");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit:");
		Double withdrawLimit = sc.nextDouble();
		
		Account acc1 = new Account(number, holder, balance, withdrawLimit);
		
		System.out.print("Enter amount for withdraw: ");
		Double amount = sc.nextDouble();
		
		acc1.withdraw(amount);
		System.out.println(acc1.toString());
		
		}catch(DomainException e) {
			System.out.println("Withdraw error:"+e.getMessage());
		}catch(RuntimeException e) {
			System.out.println("Unexpected error! "+e.getMessage());
		}
		
		sc.close();
	}

}
