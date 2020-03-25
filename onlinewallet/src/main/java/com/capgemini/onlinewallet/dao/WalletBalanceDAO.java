
package com.capgemini.onlinewallet.dao;


import java.util.HashMap;

import java.util.Map;


import com.capgemini.onlinewallet.beans.WalletAccount;


public class WalletBalanceDAO implements IWalletBalanceDAO {
	static Map<Integer,Double> map= new HashMap<Integer,Double>();


	static WalletAccount transact= new WalletAccount();
	
	static {
		transact.setAccountBalance(4000);
		map.put(10001, transact.getAccountBalance());
		transact.setAccountBalance(5000);
		map.put(10002,transact.getAccountBalance());
		transact.setAccountBalance(6000);
		map.put(10003,transact.getAccountBalance());
		transact.setAccountBalance(3000);
		map.put(10004,transact.getAccountBalance());
		transact.setAccountBalance(7000);
		map.put(10005,transact.getAccountBalance());
		
		}

	
	public  double accountBalance(int accountId) {
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