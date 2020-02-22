
package com.capgemini.onlinewallet.service;



import com.capgemini.onlinewallet.dao.WalletBalanceDAO;
import com.capgemini.onlinewallet.exception.AccountException;

public class WalletBalanceService implements IWalletBalanceService {
WalletBalanceDAO dao= new WalletBalanceDAO();

	public WalletBalanceDAO getDao() {
	return dao;
}

public void setDao(WalletBalanceDAO dao) {
	this.dao = dao;
}

	
	public double accountBalance(int accountId) {
		
		return dao.accountBalance(accountId);
	}
	
	public boolean isValidAccountId (int accountId) throws AccountException {
		boolean flag = false;
		String str= accountId+"";
	flag=	str.matches("[1-9][0-9]{9}");
	if(flag==false) {
		
		throw new AccountException("Entered Invalid Account Id");
		
	}
	
			return flag;	
	}

}
