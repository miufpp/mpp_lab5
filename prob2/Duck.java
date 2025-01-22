package lab5.prob2;

public class Duck implements FlyBehavior, QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Quack by squeaking");
	}

	@Override
	public void fly() {
		System.out.println("Flying with wings");
	}
	
	public void swim() {
		System.out.println("Swimming");
	};
	
	public void display() {
		System.out.println("Displaying");
	};
}
