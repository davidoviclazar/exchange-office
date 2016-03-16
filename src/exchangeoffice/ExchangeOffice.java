package exchangeoffice;

import java.util.LinkedList;

public class ExchangeOffice {
	private LinkedList<Currency> currencies = new LinkedList<Currency>();

	public ExchangeOffice(LinkedList<Currency> currencies) {
		super();
		this.currencies = currencies;
	}

	public LinkedList<Currency> getCurrencies() {
		return currencies;
	}

	public void setCurrencies(LinkedList<Currency> currencies) {
		this.currencies = currencies;
	}

}