package accountFilters;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import entities.Account;

public abstract class Filter {
	protected Filter anotherFilter;
	protected List<Account> baseFilter;

	public Filter(Filter anotherFilter) {
		super();
		this.anotherFilter = anotherFilter;
	}

	public Filter() {
		super();
		anotherFilter = null;
		// TODO Auto-generated constructor stub
	}

	public List<Account> getFilteredList(List<Account> accounts){
		return getCombinedFilterList(filter(accounts), getAnotherFilterList(accounts));
	}

	protected abstract List<Account> filter(List<Account> accounts);

	private List<Account> getAnotherFilterList(List<Account> accounts) {
		return anotherFilter != null ? anotherFilter.filter(accounts) : accounts;
	}

	private List<Account> getCombinedFilterList(List<Account> thisFilter, List<Account> baseFilteredAccounts) {		
		return getListFromStream(thisFilter.stream().filter(fa -> baseFilteredAccounts.contains(fa)));
	}

	protected List<Account> getListFromStream(Stream<Account> stream) {
		return stream.collect(Collectors.toList());
	}
}
