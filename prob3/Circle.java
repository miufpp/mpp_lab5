package lab5.prob3;

public class Circle implements IShape{
	
	private final double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	@Override
	public double computeArea() {
		return Math.PI * radius * radius;
	}

}
