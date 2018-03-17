package invoiceproject.model;

public class InvoicePosition {
	
	private Product product;
	private int count;
	
	public InvoicePosition(Product product){
		this.product = product;
		this.count=1;
	}
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double nettoPrice(){
		return this.product.getPrice()*count;
	}
	
	public double grossPrice(){
		return nettoPrice() * (1+product.getTax());
	}

	public double taxValue(){
		return grossPrice()-nettoPrice();
	}
	
	public static void print(InvoicePosition position){
		
		System.out.print("|"+position.getProduct().getName()+"\t|");
		System.out.print(position.getCount()+"\t|");
		System.out.print(position.nettoPrice()+"\t\t|");
		System.out.print(position.grossPrice()+"\t\t|");
		System.out.println(position.taxValue()+"\t\t|");
	}
	
}
