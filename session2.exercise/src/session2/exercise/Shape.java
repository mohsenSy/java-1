package session2.exercise;

public abstract class Shape {
	
	public Shape(int num) {
		this.sidesNum = num;
	}
	
	private int sidesNum; // The number of sides for a shape
	
	abstract void draw(); // A method to draw the shape
	
	abstract double contour(); // A method that returns the contour of the shape
	
	abstract double area(); // A method that calculates the shape area

}
