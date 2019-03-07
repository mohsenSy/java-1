package session2.exercise;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(10);
		System.out.println("Circle contour is " + c.contour());
		System.out.println("Circle area is " + c.area());
		c.draw();
		
		// Rectangle
		Rectangle rect = new Rectangle(10, 20);
		System.out.println("Rectangle contour is " + rect.contour());
		System.out.println("Rectangle area is " + rect.area());
		rect.draw();
		
		// Square
		Square sq = new Square(10);
		System.out.println("Square contour is " + sq.contour());
		System.out.println("Square area is " + sq.area());
		sq.draw();
		
		// Triangle
		Triangle tr = new Triangle(10, 20, 25);
		System.out.println("Triangle contour is " + tr.contour());
		System.out.println("Triangle area is " + tr.area());
		tr.draw();

	}

}
