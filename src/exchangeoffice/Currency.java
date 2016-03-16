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
		if (name == null)
			throw new RuntimeException("Name can not be null!");
		this.name = name;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		if (shortName == null)
			throw new RuntimeException("Short name can not be null!");
		this.shortName = shortName;
	}

	public double getSales() {
		return sales;
	}

	public void setSales(double sales) {
		if (sales < 0)
			throw new RuntimeException("Sales rate should not be a negative number!");
		this.sales = sales;
	}

	public double getPurchasable() {
		return purchasable;
	}

	public void setPurchasable(double purchasable) {
		if (purchasable < 0)
			throw new RuntimeException("Purchasable rate should not be a negative number!");
		this.purchasable = purchasable;
	}

	public double getMiddle() {
		return middle;
	}

	public void setMiddle(double middle) {
		if (middle < 0)
			throw new RuntimeException("Middle rate should not be a negative number!");
		this.middle = middle;
	}

	public GregorianCalendar getDate() {
		return date;
	}

	public void setDate(GregorianCalendar date) {
		if (date == null) 
			throw new RuntimeException("Date of course can not be null!");
		this.date = date;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		long temp;
		temp = Double.doubleToLongBits(middle);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		temp = Double.doubleToLongBits(purchasable);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(sales);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((shortName == null) ? 0 : shortName.hashCode());
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
		Currency other = (Currency) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (Double.doubleToLongBits(middle) != Double.doubleToLongBits(other.middle))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(purchasable) != Double.doubleToLongBits(other.purchasable))
			return false;
		if (Double.doubleToLongBits(sales) != Double.doubleToLongBits(other.sales))
			return false;
		if (shortName == null) {
			if (other.shortName != null)
				return false;
		} else if (!shortName.equals(other.shortName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Currency [name=" + name + ", shortName=" + shortName + ", sales=" + sales + ", purchasable="
				+ purchasable + ", middle=" + middle + ", date=" + date + "]";
	}

}