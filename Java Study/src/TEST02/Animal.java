package TEST02;

public class Animal{
	
	String kind;
	String name;
	String food;
	String drink;
	String location;
	
	public void eat(){
		System.out.println("먹는다.");
	};
	public void drink(){
		System.out.println("마신다.");
	};
	public void sleep(){
		System.out.println("잔다.");
	}
	
	public void Swim() {
		System.out.println("헤엄친다.");
		
	}
	public void Run() {
		System.out.println("달린다.");
		
	}
	public void Fly() {
		System.out.println("날라다닌다.");
		
	}
	
}
