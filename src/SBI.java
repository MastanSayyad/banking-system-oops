package com.oops.bankingsystem;

public class SBI extends Bank {

	SBI(String name, double initialAmount) {
		super(name, initialAmount);
		
	}

	@Override
	public void deposit(double amount) {
		setBalance(getBalance() + amount);
        System.out.println("Deposited " + amount + " in SBI account");

	}

	@Override
	public void withdraw(double amount) {
		if(amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrew " + amount + " from SBI account");
        } else {
            System.out.println("Insufficient Balance in SBI account");
        }
	}

}
