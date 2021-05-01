import java.util.Scanner;
public class YubariMelon extends Fruit {//subclass of Fruit
	Scanner s = new Scanner(System.in);
	private String colour, country, taste;
	private double weight, price;
	 private int quantity;
	
	public YubariMelon(String name, String colour, String taste, String country, double weight, double price) {
		super(name);
		this.colour = colour;
		this.taste = taste;
		this.country = country;
		this.weight = weight;
		this.price = price;
		
		System.out.println("\nHow many quantity of Yubari Melon you want to buy?");
		this.quantity = s.nextInt();
	}
	public String getColour() {
		return this.colour;
	}
	public String getTaste() {
		return this.taste;
	}
	public String getCountry() {
		return this.country;
	}
	public double getWeight() {
		return this.weight;
	}
	public double getPrice() {
		return this.price;
	}
	public int getQuantity() {
		return this.quantity;
	}
	public void calcTotal() { //overriding method
		double total = quantity*price;
		System.out.printf("Total : RM%.2f",total);	
	}
	public String toString() { //overriding method
		return "Name : " + super.getName() +
				"\n" + "Colour : " + this.colour +
				"\nTaste : " + this.taste +
				"\nCountry : " + this.country +
				"\nWeight : " + this.weight + "kg" +
				"\nPrice : RM" + this.price;	
					
	}
	
}
