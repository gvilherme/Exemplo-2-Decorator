package main;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import accountFilters.FilterByAge;
import accountFilters.FilterByBalance;
import entities.Account;

public class Main {

	public static void main(String[] args) {
		List<Account> accounts = new ArrayList<Account>() {{
			add(new Account("Guilherme Rodrigues", 400000.0));
			add(new Account("GF", 11.0));
			add(new Account("Pedro", 500.0));
			add(new Account("Gengis", 500.0, LocalDate.of(1955, Month.MAY, 19)));
			add(new Account("O Mais pica", 500.0, LocalDate.of(1999, Month.SEPTEMBER, 1)));
		}};
		
		FilterByBalance filter = new FilterByBalance(new FilterByAge());
		List<Account> filteredAccounts = filter.getFilteredList(accounts);
		for (Account account : filteredAccounts) {
			System.out.println(account);
		}
	}

}
