package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter account data!");
			System.out.print("Number: ");
			int numberAccount = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double limit = sc.nextDouble();
			System.out.println();
			
			Account account = new Account(numberAccount,holder,balance,limit);
		
			System.out.print("Enter amoun for withdraw: ");
			double amount = sc.nextDouble();
			account.withdraw(amount);	
			
			System.out.println(account.toString());
		}
		catch (DomainException e) {
			System.out.println("Withdraw erro: "+ e.getMessage());
		}
		
		sc.close();
	}

}
