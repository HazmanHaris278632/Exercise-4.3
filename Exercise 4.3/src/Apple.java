
public class Apple extends Fruit {
	private String colour;
	
	public Apple(String name, String colour) { //constructor for sub class
		super(name);
		this.colour = colour;
	}
	public String getColour() {
		return this.colour;
	}
	public String toString() { //overriding method
		return "Fruit : " + super.getName() + "\n" + "Colour : " + this.colour;
	}
}
		