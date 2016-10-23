package TEST02;

public class Bird extends Animal {

	public Bird(String kind, String name){
		this.kind = kind;
		this.name = name;
	}
	
	public void eat(Food food){
		System.out.println(kind+" ["+name+"]"+"는 "+food.name+"을 먹는다.");
	};
	public void drink(Drink drink){
		System.out.println(kind+" ["+name+"]"+"는 "+drink.name+"을 마신다.");
	};
	public void sleep(Location location){
		System.out.println(kind+" ["+name+"]"+"는 "+location.name+"에서 잔다.");
	};
	public void fly(){
		System.out.println(kind+" ["+name+"]"+"는 날라다닌다.");
	}
}
