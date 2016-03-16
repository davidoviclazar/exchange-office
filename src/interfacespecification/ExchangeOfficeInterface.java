package interfacespecification;

import java.util.GregorianCalendar;

import exchangeoffice.Currency;

public interface ExchangeOfficeInterface {

	public void addRate(Currency rate);

	public void deleteRate(Currency rate);

	public Currency findRate(String currency, GregorianCalendar date);

}