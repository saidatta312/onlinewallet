
package com.capgemini.onlinewallet.presentation;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

import com.capgemini.onlinewallet.exception.AccountException;
import com.capgemini.onlinewallet.service.WalletBalanceService;

public class User {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		WalletBalanceService service = new WalletBalanceService();
	
while(true){
		System.out.println("Menu");
		System.out.println("1.Show Account Balance");
		System.out.println("2.Exit");
		System.out.println("Enter Your Choice");
			int choice=0;
			boolean error=false;
			do {
			try {
				error=false;
			
			choice = scan.nextInt();
			
			
			}catch(InputMismatchException e) {
				error=true;
				System.out.println("choice should be only numeric ");
				System.out.println("please re-enter your choice");
				//flush buffer
				scan.nextLine();
			}
			}while(error);
			
			switch (choice) {
			case 1:
				double balance;
				Map<Integer, Double> map = service.getDao().getMap();
				System.out.println("Please Enter Your 5 Digit  Account Id");
				Integer accountId=0;
				boolean isValid = false;
				do {
				try {
					error=false;
					
				 accountId = scan.nextInt();// input should in integer range i.e:+,-2147483647
				
				 isValid = service.isValidAccountId(accountId);
					if (isValid) {
						if (map.containsKey(accountId)) {

							balance = service.getDao().accountBalance(accountId);
							System.out.println("Your Available Account Balance is " + balance);
						}
						else
							System.out.println("Entered Account Id Does not Exit  ");
					}
				}
				catch(InputMismatchException e) {
									
					error=true;
					System.out.println("Account Id should be numeric");
					System.out.println("please re-enter a valid 5 digit  account id ");
					scan.nextLine();
				}catch (AccountException e) {
		               error=true;
						System.out.println(e.getMessage());
					
						scan.nextLine();
					}
				
				}
				while(error);
				

				break;
			case 2:
				System.out.println("Thank You Visit Again ");
				System.exit(0);
				break;
			default:
				System.err.println("Entered choice is invalid .Please Enter Correct Choice");
				break;
			}

		}
	

	}
}

