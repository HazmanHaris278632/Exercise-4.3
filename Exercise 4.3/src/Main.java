import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		YubariMelon a = new YubariMelon("Yubari Melon", "Yellow-Green", "Sweet", "Hokkaido, Japan", 1.6, 800.00);
		System.out.println(a); //print using overriding method
		a.calcTotal();
		System.out.println();
		
		Durian b = new Durian("Musang King", "Yellow", "Sweet", "Pahang, Malaysia", 4.0, 90);
		System.out.println(b); 
		b.calcTotal();
		System.out.println();
		
		Apple c = new Apple("Apple", "Green & Red");
		System.out.println(c);
		
		GreenApple d = new GreenApple("Green Apple", "Green", "Australia", 10);
		System.out.println(d);
		d.calcTotal();
		System.out.println();
		
		RedApple e = new RedApple("Red Apple", "Red", "United States", 20);
		System.out.println(e);
		e.calcTotal();
		
				
		
	}
	

}
