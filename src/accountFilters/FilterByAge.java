package accountFilters;

import java.util.List;

import entities.Account;

public class FilterByAge extends Filter {

	
	public FilterByAge() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FilterByAge(Filter anotherFilter) {
		super(anotherFilter);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected List<Account> filter(List<Account> accounts) {
		return getListFromStream(accounts.stream().filter(a -> a.getAgeInMonths() < 1));
	}

}
