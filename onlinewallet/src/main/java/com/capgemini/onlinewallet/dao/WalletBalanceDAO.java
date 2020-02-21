
package com.capgemini.onlinewallet.dao;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.capgemini.onlinewallet.beans.WalletAccount;


public class WalletBalanceDAO implements IWalletBalanceDAO {
	static Map<Integer,Double> map= new HashMap<Integer,Double>();
static List<Integer> list=new ArrayList<Integer>();

	static WalletAccount transact= new WalletAccount();
	static Random random= new Random();
	static {
		transact.setAccountBalance(4000);
		//System.out.println(random.nextInt()+1000000000);
		map.put(random.nextInt(999999999)+1000000000, transact.getAccountBalance());
		transact.setAccountBalance(5000);
		map.put(random.nextInt(999999999)+1000000000,transact.getAccountBalance());
		transact.setAccountBalance(6000);
		map.put(random.nextInt(999999999)+1000000000,transact.getAccountBalance());
		transact.setAccountBalance(3000);
		map.put(random.nextInt(999999999)+1000000000,transact.getAccountBalance());
		for (Integer i : map.keySet()) {
			list.add(i);
		}

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

	public  List<Integer> getList() {
		return list;
	}

	public  void setList(List<Integer> list) {
		WalletBalanceDAO.list = list;
	}

	
	
}