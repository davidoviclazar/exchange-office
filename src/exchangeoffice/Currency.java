package exchangeoffice;

import java.util.GregorianCalendar;

public class Currency {
	private String name, shortName;
	private double sales, purchasable;

	// middle = (sales + purchasable) / 2;
	private double middle;

	private GregorianCalendar date;

	public Currency(String name, String shortName, double sales, double purchasable, double middle,
			GregorianCalendar date) {
		super();
		this.name = name;
		this.shortName = shortName;
		this.sales = sales;
		this.purchasable = purchasable;
		this.middle = middle;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public double getSales() {
		return sales;
	}

	public void setSales(double sales) {
		this.sales = sales;
	}

	public double getPurchasable() {
		return purchasable;
	}

	public void setPurchasable(double purchasable) {
		this.purchasable = purchasable;
	}

	public double getMiddle() {
		return middle;
	}

	public void setMiddle(double middle) {
		this.middle = middle;
	}

	public GregorianCalendar getDate() {
		return date;
	}

	public void setDate(GregorianCalendar date) {
		this.date = date;
	}

}