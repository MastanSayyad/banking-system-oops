package com.oops.bankingsystem;


public abstract class Bank implements BankOperations {
	
	protected String userName;
	private double balance;
	
	Bank(String name, double initialAmount){
		this.userName=name;
		this.balance=initialAmount;
		
	}
	
	public void checkBalance() {
		System.out.println("Current Balance for " + userName + " is " + balance);
	}
	
	protected void setBalance(double balance) {
		this.balance=balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	
}
