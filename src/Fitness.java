
public class Fitness {
	public static void main(String[] args) {
	Person Tom = new Person("Tom", 'H', 152.5, 5, 6);
	Person Leslie = new Person("Leslie", "Knope", 'K', 32, 122.9, 4, 11);
	Person Ron = new Person("Ron", "Swanson", 222.2, 6, 0);
	Person April = new Person("April", "Ludgate", 110.5, 5, 5);
	
	//I could also just make a string that says "Tom" instead of getFirstName, but I figured you'd want it this way.
	System.out.println(Tom.getFirstName() + " : " + Tom.calculateBMI());
	System.out.println(Leslie.getFirstName() + " : " +Leslie.calculateBMI());
	System.out.println(Ron.getFirstName() + " : " +Ron.calculateBMI());
	System.out.println(April.getFirstName() + " : " +April.calculateBMI());
	
	//EXTRA CREDIT : accesses toString method
	/*
	System.out.println(Tom);
	System.out.println(Leslie);
	System.out.println(Ron);
	System.out.println(April);
	*/
	}
}