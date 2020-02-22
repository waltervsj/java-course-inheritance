package entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class UsedProduct extends Product {
	
	public static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufacturedDate;

	public Date getManufacturedDate() {
		return manufacturedDate;
	}

	public void setManufacturedDate(Date manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufacturedDate) {
		super(name, price);
		this.manufacturedDate = manufacturedDate;
	}
	
	@Override
	public String priceTag() {
		return this.name 
				+ " (used) $" + this.price 
				+ " (Manufactured date: " + dateFormat.format(this.manufacturedDate) + ")";
	}
}
