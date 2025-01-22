package lab5.prob2;

public class DecoyDuck extends Duck{


	@Override
	public void fly() {
		System.out.println("Can not fly");
	}
	
	@Override
	public void quack() {
		System.out.println("Can not quack");
	}



}
