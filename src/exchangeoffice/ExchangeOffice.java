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
			return;

		if (currencies.contains(rate))
			return;

		currencies.add(rate);

	}

	@Override
	public void deleteRate(Currency rate) {
		// TODO Auto-generated method stub

	}

	@Override
	public Currency findRate(String currency, GregorianCalendar date) {
		// TODO Auto-generated method stub
		return null;
	}
}