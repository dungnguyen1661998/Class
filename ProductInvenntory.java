package test_1;

import java.util.*;

class Product {
	public double price;
	private String id;
	private int quantity;
	
	public Product(String id, double price,  int quantity){
		this.price = price;
		this.id = id;
		this.quantity = quantity;
	}
	
	public void addQuantity(int _quantity) {
		this.quantity +=_quantity;
	}
	
	public void minusQuantity(int _quantity) {
		this.quantity = Math.max(this.quantity-_quantity, 0);
	}
	
	public int getQuantity(){
		return this.quantity;
	}
	
	public String getProduct(){
		return String.format("%s\t%.2f\t%d",id,price,quantity);
	}
}

class Inventory {
	private List<Product> products;
	
	public Inventory(){
		products = new ArrayList<Product>();
	}
	
	public void addProduct(Product _product){
		products.add(_product);
	}
	
	public void getInventory(){
		double sum = 0;
		for(Product p : products){
			System.out.println(p.getProduct());
			sum+=p.price*p.getQuantity();
		}
		System.out.println("Inventory value: " + sum);
	}
}
	
	
public class ProductInvenntory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product("sp001", 15.30, 2);
		Product p2 = new Product("sp002", 33, 6);
		Product p3 = new Product("sp003", 10.45, 4);
		
		Inventory inv = new Inventory();
		inv.addProduct(p1);
		inv.addProduct(p2);
		inv.addProduct(p3);
		
		p1.minusQuantity(1);
		p2.addQuantity(3);
		
		inv.getInventory();
	}

}
