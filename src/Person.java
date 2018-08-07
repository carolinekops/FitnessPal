public class Person {
	
	private String firstName;
	private String lastName;
	private char lastNameInitial;
	private int age;
	private double weight;
	private int feet;
	private int inches;

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public char getLastNameInitial() {
		return lastNameInitial;
	}
	public void setLastNameInitial(char lasrrNameInitial) {
		this.lastNameInitial = lasrrNameInitial;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getFeet() {
		return feet;
	}
	public void setFeet(int feet) {
		this.feet = feet;
	}
	public int getInches() {
		return inches;
	}
	public void setInches(int inches) {
		this.inches = inches;
	}
//Constructor with firstName, lastName, weight, feet, inches
Person(String firstName, String lastName, double weight, int feet, int inches) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.weight = weight;
	this.feet = feet;
	this.inches = inches;
}
//Constructor two with firstName, lastNameInitial, weight, feet, inches
Person(String firstName, char lastNameInitial, double weight, int feet, int inches){
	this.firstName = firstName;
	this.lastNameInitial = lastNameInitial;
	this.weight = weight;
	this.feet = feet;
	this.inches = inches;	
}
//Constructor with all attributes
Person(String firstName, String lastName, char lastNameInitial, int age, double weight, int feet, int inches) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.lastNameInitial = lastNameInitial;
	this.age = age;
	this.weight = weight;
	this.feet = feet;
	this.inches = inches;	
}
//toString for Extra Credit, will print out all attributes of object if printed
public String toString() {
	return(this.firstName  + "\n" + this.lastName  + "\n" + this.lastNameInitial + "\n" + this.age + "\n" + this.weight + "\n" + this.feet + "\n" + this.inches);
}
//Behavior method
String calculateBMI() {
	int heightInInches = (this.feet * 12)+this.inches;
	double BMI = (this.weight * 703)/(heightInInches * heightInInches);
	String bmiLevel;
		if(BMI < 18.5) {
			bmiLevel = "Underweight";
		}
		else if(BMI >= 18.5 && BMI <= 24.9) {
			bmiLevel = "Normal";
		}
		else if (BMI >= 25 && BMI <= 29.9) {
			bmiLevel = "Overweight";
		}
		else {
			bmiLevel = "Obese";
		}
	return(BMI + " : " + bmiLevel);
}

}
