package geometry;

public class Line extends Shape {

	private Point startPoint;
	private Point endPoint;

	public Line() {

	}

	public Line(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}

	public Line(Point startPoint, Point endPoint, boolean selected) {
		this(startPoint, endPoint);
		this.selected = selected;
	}

	public double lenght() {
		return startPoint.distance(endPoint);
	}

	@Override
	public void moveTo(int x, int y) {
		// Metoda bez implementacije

	}

	@Override
	public void moveBy(int byX, int byY) {
		startPoint.moveBy(byX, byY);
		endPoint.moveBy(byX, byY);
	}

	public boolean contains(int x, int y) {
		Point click = new Point(x, y);
		return (lenght() - (startPoint.distance(click) + endPoint.distance(click))) <= 2;
	}

	@Override
	public String toString() {
		return String.format("(%s, %s) --> (%s, %s)", startPoint.getX(), startPoint.getY(), endPoint.getX(),
				endPoint.getY());

	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Line) {
			Line temp = (Line) o;
			if (this.startPoint.getX() == temp.getStartPoint().getX()
					&& this.startPoint.getY() == temp.getStartPoint().getY()
					&& this.endPoint.getX() == temp.getEndPoint().getX()
					&& this.endPoint.getY() == temp.getEndPoint().getY()) {
				return true;
			}
		}
		return false;
	}

	public Point getStartPoint() {
		return startPoint;
	}

	public Point getEndPoint() {
		return endPoint;
	}

	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}

	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}

	@Override
	public boolean containts(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int compareTo(Shape o) {
		if (o instanceof Line) {
			Line temp = (Line) o;
			return(int) (lenght() - temp.lenght());
		}
		return 0;
	}

}
