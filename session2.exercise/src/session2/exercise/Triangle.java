package session2.exercise;

public class Triangle extends Shape {
	
	private int side1, side2, side3;
	
	public Triangle(int s1, int s2, int s3) {
		super(3);
		side1 = s1;
		side2 = s2;
		side3 = s3;
		
	}

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawling a triangle of s1: " + side1 + " s2: " + side2 + " s3: " + side3);
	}

	@Override
	double contour() {
		// TODO Auto-generated method stub
		return side1 + side2 + side3;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		double p = (side1 + side2 + side3)/2;
		return Math.sqrt(p * (p - side2) * (p-side2) * (p - side3));
	}

}
