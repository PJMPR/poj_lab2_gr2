package invoiceproject.model;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {

		Product tv = new Product();
		
		tv.setCode("abc123");
		tv.setName("tv");
		tv.setPrice(1000);
		tv.setTax(Product.TAX_23);

		Product tv2 = new Product();
		
		tv2.setCode("abc123");
		tv2.setName("tv");
		tv2.setPrice(1000);
		tv2.setTax(Product.TAX_23);
		

		Product radio = new Product();
		
		radio.setCode("def123");
		radio.setName("radio");
		radio.setPrice(500);
		radio.setTax(Product.TAX_23);
		
		Invoice invoice = new Invoice();
		invoice.addProduct(tv);
		invoice.addProduct(radio);
		invoice.addProduct(tv2);
		
		Invoice.print(invoice);
		
	}

}
