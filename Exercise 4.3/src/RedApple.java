import java.util.Scanner;
public class RedApple extends Apple {//subclass for Apple
	Scanner s = new Scanner(System.in);
	private String country;
	private double weight, price;

	public RedApple(String name, String colour, String country, double price) {
		super(name, colour);
		this.price = price;
		this.country = country;
		
		System.out.println("\nEnter how many kg of Red Apple you want to buy");
		this.weight = s.nextDouble();
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
	public void calcTotal() { //overriding method
		double total = weight*price;
		System.out.printf("Total : RM%.2f",total);
	}
	public String toString() { //overriding method
		return "Name : " + super.getName() +
				"\n" + "Colour : " + super.getColour() +
				"\nCountry : " + this.country +
				"\nWeight : " + this.weight + "kg" +
				"\nPrice : RM" + this.price;				
	}

}
