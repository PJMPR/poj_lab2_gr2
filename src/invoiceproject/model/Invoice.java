package invoiceproject.model;

import java.util.ArrayList;
import java.util.List;

public class Invoice {

	private List<InvoicePosition> positions = new ArrayList<InvoicePosition>();

	public List<InvoicePosition> getPositions() {
		return positions;
	}
	
	
	public void addProduct(Product product){
		InvoicePosition position = findPositionWithProduct(product);
		if(position!=null){
			position.setCount(position.getCount()+1);
			return;
		}
		positions.add(new InvoicePosition(product));
	}


	private InvoicePosition findPositionWithProduct(Product product) {
		
		for(InvoicePosition position : this.positions){
			if(position.getProduct().getCode().equalsIgnoreCase(product.getCode())){
				return position;
			}
		}
		
		return null;
	}
	
	public static void print(Invoice invoice){
		System.out.println("|NAZWA\t|ILOŚĆ\t|CENA NETTO\t|CENA BRUTTO\t| PODATEK");
		System.out.println("*********************************************************");
		for (InvoicePosition position : invoice.positions) {
			InvoicePosition.print(position);
			System.out.println("----------------------------------------------------------");
		}
	}
	
	
	
	
	
	
	
	
}
