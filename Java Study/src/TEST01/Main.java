package TEST01;

public class Main {

	public static void main(String[] args) {
		Context test = new Context(new OperationAdd());
		test.excuteStrategy(11, 10);
	}

}
