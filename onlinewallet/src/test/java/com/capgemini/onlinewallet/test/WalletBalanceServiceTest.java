package com.capgemini.onlinewallet.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.capgemini.onlinewallet.beans.WalletAccount;
import com.capgemini.onlinewallet.exception.AccountException;
import com.capgemini.onlinewallet.service.WalletBalanceService;

class WalletBalanceServiceTest {
	static WalletAccount wallet;
	
	@BeforeAll
	public static void account() {
		wallet=new WalletAccount();
		wallet.setAccountBalance(5000.0);
	}

	@Test
	void testAccountBalance() {
assertEquals(5000.0, wallet.getAccountBalance());
	}

	
	}


