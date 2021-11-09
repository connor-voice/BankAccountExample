package com.example.bankaccount;

public class BankAccount {

	private String firstName;
	private String secondName;
	private int accountAge;
	private double balance;
	
	public BankAccount(String firstName, String secondName, int accountAge, double balance) {
		this.firstName = firstName;
		this.secondName = secondName;
		this.accountAge = accountAge;
		this.balance = balance;
	}
	
	public void greet() {
		System.out.println("Hello " + firstName + ". Your balance is £" + balance + ".");
		System.out.println("You've held your account with us for " + accountAge + " years");
	}
	
	public String getName() {
		return this.firstName;
	}
	
	public void setName(String firstName) {
		this.firstName = firstName;
	}
}
