package TEST02;

public class Fish extends Animal {

	public Fish(String kind, String name){
		this.kind = kind;
		this.name = name;
	}
	
	public void eat(Food food){
		System.out.println(kind+" ["+name+"]"+"�� "+food.name+"�� �Դ´�.");
	};
	public void drink(Drink drink){
		System.out.println(kind+" ["+name+"]"+"�� "+drink.name+"�� ���Ŵ�.");
	};
	public void sleep(Location location){
		System.out.println(kind+" ["+name+"]"+"�� "+location.name+"���� �ܴ�.");
	};

	public void Swim(){
		System.out.println(kind+" ["+name+"]"+"�� ���ģ��.");
	}
	
}
