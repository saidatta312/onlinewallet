
package com.capgemini.onlinewallet.dao;


import java.util.HashMap;

import java.util.Map;
import java.util.Random;

import com.capgemini.onlinewallet.beans.WalletAccount;


public class WalletBalanceDAO implements IWalletBalanceDAO {
	static Map<Integer,Double> map= new HashMap<Integer,Double>();
	static WalletAccount transact= new WalletAccount();
	static Random random= new Random();
	static {
		transact.setAccountBalance(4000);
		//System.out.println(random.nextInt()+1000000000);
		map.put(1234567892, transact.getAccountBalance());
		transact.setAccountBalance(5000);
		map.put(1026258482,transact.getAccountBalance());
		transact.setAccountBalance(6000);
		map.put(1035362882,transact.getAccountBalance());
		transact.setAccountBalance(3000);
		map.put(1045368283,transact.getAccountBalance());

	}
	public double accountBalance(int accountId) {
		double balance = 0;
		
		if(map.containsKey(accountId))
		{
			balance=map.get(accountId);
		}
		
		return balance;
		}

	public Map<Integer, Double> getMap() {
		return map;
	}

	
	
}