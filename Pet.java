
public class Pet {
	char gender;
	int age;
	
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Pet(char gender, int age) {
		super();
		this.gender = gender;
		this.age = age;
	}
	public void eats() {
		System.out.println("Pet eats..");
	}
	public void sounds() {
		System.out.println("Pet sounds..");
	}
	public Pet() {
		super();
	}
	@Override
	public String toString() {
		return "Cinsiyet : " + gender + "\nYaş : " + age;
	}
	
}
