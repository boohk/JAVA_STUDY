package TEST02;

public class MainAnimal{

	public static void main(String[] args) {

		Bird bird1 = new Bird("Owl","Tachin");
		bird1.drink(new Drink("��"));
		bird1.eat(new Food("��"));
		bird1.fly();
		bird1.sleep(new Location("������"));
		
		
	}

}
