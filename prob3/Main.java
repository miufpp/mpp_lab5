package lab5.prob3;

public class Main {
	public static void main(String[] args) {

        IShape[] IShapes = {new Circle(3.0),
                new Rectangle(10, 5),
                new Triangle(10, 10)};

        double totalAreaSum = 0.0;
        for (IShape IShape : IShapes) {
            totalAreaSum += IShape.computeArea();
        }

        System.out.printf("Sum of Area: %.2f", totalAreaSum);
    }
}
