public class Chocolate extends Food {

	@Override
	void eaten(Animal animal){
	  	System.out.println(animal.getClass().getSimpleName().toLowerCase()+" eats chocolate");
	}

}
