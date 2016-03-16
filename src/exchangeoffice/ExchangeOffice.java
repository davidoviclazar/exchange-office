package exchangeoffice;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfacespecification.ExchangeOfficeInterface;

public class ExchangeOffice implements ExchangeOfficeInterface {
	private LinkedList<Currency> currencies = new LinkedList<Currency>();

	public ExchangeOffice(LinkedList<Currency> currencies) {
		super();
		this.currencies = currencies;
	}

	public LinkedList<Currency> getCurrencies() {
		return currencies;
	}

	public void setCurrencies(LinkedList<Currency> currencies) {
		if (currencies != null)
			this.currencies = currencies;
		else
			throw new RuntimeException("List of currencies may not be null!");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((currencies == null) ? 0 : currencies.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExchangeOffice other = (ExchangeOffice) obj;
		if (currencies == null) {
			if (other.currencies != null)
				return false;
		} else if (!currencies.equals(other.currencies))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ExchangeOffice [currencies=" + currencies + "]";
	}

	@Override
	public void addRate(Currency rate) {
		if (rate == null)
			throw new RuntimeException("The rate may not be null!");

		if (currencies.contains(rate))
			throw new RuntimeException("The course has already been entered!");

		currencies.add(rate);

	}

	@Override
	public void deleteRate(Currency rate) {
		if (rate == null)
			throw new RuntimeException("The rate may not be null!");

		if (!currencies.contains(rate))
			throw new RuntimeException("Rate does not exist!");

		currencies.remove(rate);

	}

	@Override
	public Currency findRate(String currency, GregorianCalendar date) {
		if (currency == null || date == null)
			throw new RuntimeException("Currency name and date may not be null!");

		for (int i = 0; i < currencies.size(); i++) {
			if ((currencies.get(i).getName().equals(currency) || currencies.get(i).getShortName().equals(currency))
					&& currencies.get(i).getDate().equals(date))
				return currencies.get(i);

		}
		return null;

	}
}