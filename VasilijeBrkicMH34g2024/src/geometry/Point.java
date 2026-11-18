package geometry;

public class Point {

	private int x;
	private int y;
	private boolean selected;

	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public boolean isSelected() { // metode uvek public, za sada bar
		return selected;
	}
	
	public void setX(int x) {
		this.x = x; // sablon - uvek ovao radimo, ovde je x parametar a gore u private int x je atribut(5. linija)
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
}
