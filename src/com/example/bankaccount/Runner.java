package com.example.bankaccount;

public class Runner {

	public static void main(String[] args) {
		
		BankAccount connor = new BankAccount("Connor", "Voice", 7, 520000);
		
		System.out.println(connor.getName());
		
		connor.setName("John");
		
		System.out.println(connor.getName());
		
		connor.greet();
		
		
	}
}
