package session2.exercise;

public class Rectangle extends Shape {
	
	protected int length; // The width of rectangle
	protected int width; // The length of rectangle
	
	public Rectangle(int w, int l) {
		// TODO Auto-generated constructor stub
		super(4);
		this.width = w;
		this.length = l;
	}

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing rectangle of withd: " + this.width + " and length: " + this.length);
	}

	@Override
	double contour() {
		// TODO Auto-generated method stub
		return this.width *2 + this.length*2;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return this.width * this.length;
	}

}
