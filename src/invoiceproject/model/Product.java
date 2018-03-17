package invoiceproject.model;

public class Product {

	public final static double TAX_5=0.05;
	public final static double TAX_8=0.08;
	public final static double TAX_23=0.23;
	
	private String code;
	private String name;
	private double price;
	private double tax;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
}
