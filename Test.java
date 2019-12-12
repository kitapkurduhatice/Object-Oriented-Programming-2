
public class Test {
	public static void tellPetType(Pet pet) 
	{
		System.out.print(pet.getClass().getName()+" ");
		if (pet.getClass().getName().equals("Cat")) 
		{

			System.out.print(((Cat) pet).getName()+" ");
		}
		if (pet.getClass().getName().equals("Dog")) 
		{

			System.out.print(((Dog) pet).getName()+" ");
		}
		if (pet.getClass().getName().equals("Bird")) 
		{

			System.out.print(((Bird) pet).getName()+" ");
		}
		
		// instanceof ile yapýmý
		/*if (pet instanceof Cat) 
		{
			System.out.print(((Cat) pet).getName()+" ");

		}*/

		System.out.print(pet.getGender());

	}
	
	public static void main(String[] args) 
	{
		
		Dog dog = new Dog("Rüzgar",3,"Golden",'E',500);
		System.out.println(dog);
		dog.eats();
		dog.sounds();
		System.out.println();
		Cat cat = new Cat("Duman",1,"Ýran Kedisi",'D',1000);
		System.out.println(cat);
		cat.eats();
		cat.sounds();
		System.out.println();
		Bird bird = new Bird("Maviþ",3,"Muhabbet Kuþu",'D',300,100);
		System.out.println(bird);
		bird.eats();
		bird.sounds();

		//tellPetType((Pet) cat);

		
	}

}
