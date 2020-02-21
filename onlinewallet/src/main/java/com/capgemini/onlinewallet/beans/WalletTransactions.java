
package com.capgemini.onlinewallet.beans;

import java.time.LocalDateTime;

public class WalletTransactions {
	private int transactionId;
	private String description;
	private LocalDateTime dateOfTransaction;
	private double amount;
	private double amountBalance;
	
	public WalletTransactions() {
		super();
	}
	
	public WalletTransactions(double amountBalance) {
		super();
		this.amountBalance = amountBalance;
	}

	public WalletTransactions(int transactionId, String description, LocalDateTime dateOfTransaction, double amount,
			double amountBalance) {
		super();
		this.transactionId = transactionId;
		this.description = description;
		this.dateOfTransaction = dateOfTransaction;
		this.amount = amount;
		this.amountBalance = amountBalance;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDateTime getDateOfTransaction() {
		return dateOfTransaction;
	}
	public void setDateOfTransaction(LocalDateTime dateOfTransaction) {
		this.dateOfTransaction = dateOfTransaction;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getAmountBalance() {
		return amountBalance;
	}
	public void setAmountBalance(double amountBalance) {
		this.amountBalance = amountBalance;
	}
	@Override
	public String toString() {
		return "WalletTransactions [transactionId=" + transactionId + ", description=" + description
				+ ", dateOfTransaction=" + dateOfTransaction + ", amount=" + amount + ", amountBalance=" + amountBalance
				+ "]";
	}
	
	
}