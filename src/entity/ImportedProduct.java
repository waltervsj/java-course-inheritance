package entity;

public final class ImportedProduct extends Product {
	private Double customsFee;

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	@Override
	public String priceTag() {
		return this.name + " $" + this.totalPrice() + " (Customs fee: $" + this.customsFee + ")";
	}
	
	public Double totalPrice() {
		return this.customsFee + this.price;
	}
}
