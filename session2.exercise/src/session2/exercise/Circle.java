package session2.exercise;

public class Circle extends Shape {
	
	int diameter;
	
	public Circle(int d) {
		super(0);
		diameter = d;
	}

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawling a circle of diameter: " + diameter);
	}

	@Override
	double contour() {
		// TODO Auto-generated method stub
		return 2 * this.diameter * Math.PI;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return diameter * diameter * Math.PI;
	}

}
