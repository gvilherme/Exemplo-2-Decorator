package entities;

import java.time.LocalDate;
import java.time.Period;

public class Account {
	private String holder;
	private LocalDate creationDate;
	private double balance;

	public Account(String holder, double balance) {
		super();
		this.holder = holder;
		this.balance = balance;
		creationDate = LocalDate.now();
	}
	
	public Account(String holder, double balance, LocalDate date) {
		super();
		this.holder = holder;
		this.balance = balance;
		creationDate = date;
	}

	public String getHolder() {
		return holder;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public double getBalance() {
		return balance;
	}

	public int getAgeInMonths() {
		Period period = Period.between(creationDate, LocalDate.now()); 
		return period.getYears() * 12 + period.getMonths();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Holder = " + getHolder()
				+ " Balance = " + getBalance()
				+ " Creation Date = " + getCreationDate().toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		Account acc = (Account) obj;
		if (obj == null) {
			return false;
		}
		else return acc.holder == getHolder();
	}
}
