public class Fruit extends Food {

@Override
	void eaten(Animal animal){
	  	System.out.println(animal.getClass().getSimpleName().toLowerCase()+" eats fruit");
	}

}
