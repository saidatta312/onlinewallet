package com.capgemini.onlinewallet.test;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;


import com.capgemini.onlinewallet.beans.WalletAccount;

class WalletBalanceServiceTest {
	static WalletAccount wallet;
	@BeforeAll
	public static void account() {
		wallet=new WalletAccount();
		wallet.setAccountBalance(5000.0);
		wallet.setAccountId(10001);
	}

	@Test
	void testAccountId() {
		assertEquals(10001, wallet.getAccountId());	
	}
	@Test
	void testAccountBalance() {
 assertEquals(5000.0, wallet.getAccountBalance());
	}

	
	}


