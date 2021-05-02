import java.util.Scanner;
public class RedApple extends Apple {//subclass for Apple
	Scanner s = new Scanner(System.in);
	private String country;
	private double weight, price;

	public RedApple(String name, String colour, double price) {
		super(name, colour);
		this.price = price;
		
		
		System.out.println("\nEnter how many kg of Red Apple you want to buy");
		this.weight = s.nextDouble();
	}
	//overloading
	public String country() {
		System.out.println("Import from : ");	
		System.out.println("Country : United States");
		return country;
	}
	public String country(String a) {
		System.out.println("Country : " + a);
		return a;
	}
	public String country(String b, String c) {
			System.out.println("Country : " + b + "\nCountry : " + c);
		return b;
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
		return "\nName : " + super.getName() +
				"\n" + "Colour : " + super.getColour() +
				"\nWeight : " + this.weight + "kg" +
				"\nPrice : RM" + this.price;				
	}

}
