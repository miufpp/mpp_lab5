package lab5.prob3;

public class Triangle implements IShape{

	private final double base, height;
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	@Override
	public double computeArea() {
		return 0.5 * height * base;
	}

}
