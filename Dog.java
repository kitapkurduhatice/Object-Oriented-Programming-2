
public class Dog extends Pet {
	String type;
	String name;
	double price;
	
	void sound() {
		System.out.println("Dog sounds Hav");
	}
	public static void eat() {
		 System.out.println("Dog eats Hotdog");
	}
	 public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Dog(String name, int age,String type,char gender,  double price) {
		super(gender, age);
		this.type = type;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Köpek\nAdý : " + name + "\nYaþ : " + age + "\nTürü : " + type + "\nCinsiyet : " + gender + "\nFiyatý : " + price;
		
	}

	
	
	
	
	

}
