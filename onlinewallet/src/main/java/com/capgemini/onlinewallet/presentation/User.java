
package com.capgemini.onlinewallet.presentation;


import java.util.Map;
import java.util.Scanner;

import com.capgemini.onlinewallet.exception.AccountException;
import com.capgemini.onlinewallet.service.WalletBalanceService;

public class User {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		WalletBalanceService service = new WalletBalanceService();
		while (true) {
			System.out.println("Menu");
			System.out.println("1.Show Account Balance");
			System.out.println("2.Exit");
			System.out.println("Enter Your Choice");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				double balance;
				Map<Integer, Double> map = service.getDao().getMap();
				System.out.println(map);
				
				System.out.println("Please Enter Your 10 Digit  Account Id");
				Integer accountId = scan.nextInt();
				boolean isValid = false;
				try {
					isValid = service.isValidAccountId(accountId);
				} catch (AccountException e) {

					System.out.println(e.getMessage());
					System.out.println("Please Enter Valid Account Id");
				}

				if (isValid) {
					balance = service.getDao().accountBalance(accountId);
					System.out.println("Your Available Account Balance is " + balance);
				}

				break;
			case 2:
				System.out.println("Thank You Visit Again ");
				System.exit(0);
				break;
			default:
				System.err.println("Entered choice is invalid");
				System.out.println("Please Enter Correct Choice");
				break;
			}

		}

	}

}
