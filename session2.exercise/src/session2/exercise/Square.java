package session2.exercise;

public class Square extends Rectangle {
	
	public Square(int side) {
		super(side, side);
	}
	
	public void draw() {
		System.out.println("Drawling a Square of side: " + this.length);
	}

}
