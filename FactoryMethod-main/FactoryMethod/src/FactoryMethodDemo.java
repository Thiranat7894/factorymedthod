// Test the Factory Method
public class FactoryMethodDemo {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ConcreteShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("TRIANGLE");
        shape3.draw();
	}
}