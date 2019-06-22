package model.entities;

import model.exceptions.DomainException;

public class Account {
	
	private int number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {
		
	}

	public Account(int number, String holder, Double balance, Double withdrawLimit) {
		
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdraw() {
		return withdrawLimit;
	}
	
	public void deposit(Double amount) {
		
		this.balance += amount;
	}
	
	public void withdraw(Double amount) throws DomainException {
		if(amount > withdrawLimit) {
			throw new DomainException("The amount exceeds withdraw limit");
		}else if(amount > balance) {
			throw new DomainException("Not enough balance");
		}else {
		this.balance -= amount;
		}
	}
	
	@Override
	public String toString() {
		return "New Balance: "+getBalance();
	}
	

}
