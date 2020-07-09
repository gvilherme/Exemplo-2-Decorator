package accountFilters;

import java.util.List;

import entities.Account;

public class FilterByBalance extends Filter {

	
	public FilterByBalance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FilterByBalance(Filter anotherFilter) {
		super(anotherFilter);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected List<Account> filter(List<Account> accounts) {		
		return getListFromStream(accounts.stream().filter(a -> (a.getBalance() < 100.0 || a.getBalance() > 500000.0)));
	}	
}
