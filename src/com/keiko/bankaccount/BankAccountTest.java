package com.keiko.bankaccount;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount b=new BankAccount();
		b.deposit("checking", 50);
		b.deposit("savings", 100);
		b.withdraw("checking", 25);
		b.getBalances();// TODO Auto-generated method stub

	}

}
