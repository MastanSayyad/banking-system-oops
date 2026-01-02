package com.oops.bankingsystem;

public class HDFC extends Bank{

	HDFC(String name, double initialAmount) {
		super(name, initialAmount); // calling parent constructor
	}

	@Override
	public void deposit(double amount) {
		setBalance(getBalance()+amount);
        System.out.println("Deposited " + amount + " in HDFC account");

	}

	@Override
	public void withdraw(double amount) {
		if(amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrew " + amount + " from HDFC account");
        } else {
            System.out.println("Insufficient Balance in HDFC account");
        }
	}
		
}

