package com.oops.bankingsystem;

public class LaunchBank {
	public static void main(String[] args) {
		Bank hdfc = new HDFC("Mastan", 10000); //polymorphism
		Bank sbi = new SBI("John", 30000);
		
		sbi.checkBalance();
		System.out.println("============= After Deposit and Withdraw ============");
		sbi.deposit(10000);
		sbi.withdraw(2000);
		sbi.checkBalance();

		 System.out.println();
        System.out.println("-------------------------------------------------------");
		 System.out.println();

		 
		hdfc.checkBalance();
		System.out.println("============= After Deposit and Withdraw ============");
		hdfc.deposit(10000);
		hdfc.withdraw(2000);
		hdfc.checkBalance();

		
	}

}
