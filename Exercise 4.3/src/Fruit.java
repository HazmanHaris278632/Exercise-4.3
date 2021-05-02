
public class Fruit {
	protected String name;

	
	
	public Fruit(String name) { //constructor with argument
		this.name = name;
		System.out.println("\n" + name + " constructor is invoked");
	}
	public String getName() {
		return name;
	}
}
