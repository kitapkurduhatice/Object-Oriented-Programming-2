
public class Bird extends Pet implements livesInCage{
	String type;
	String name;
	double price;
	int minCageSize;
	public void setMinCageSize(int minCageSize) {
		this.minCageSize = minCageSize;
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
	
	public Bird( String name, int age, String type,char gender, double price, int minCageSize) {
		super(gender, age);
		this.type = type;
		this.name = name;
		this.price = price;
		this.minCageSize = minCageSize;
	}
	public void eats() {
		System.out.println("Bird eats feed");
	}
	public void sounds() {
		System.out.println("Bird sounds cik ");
	}
	public int getMinCageSize(int minCageSize) {
		return minCageSize;
	}
	@Override
	public String toString() {
		return "Bird \nAdý: " + name +"\nYaþý: " + age+ "\nCinsi: " + type +"\nCinsiyeti: " + gender + "\nFiyatý: " + price + "\nMinimum Kafes Boyutu: "+minCageSize;
	}

	
}
