package geometry;

public class Point {

    private int x;
    private int y;
    private boolean selected;

    // Podrazumevani konstruktor
    public Point() {

    }

    // Overloading - vise konstruktora sa razlicitim parametrima
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, boolean selected) {
        this(x, y);
        this.selected = selected;
    }

    // Racunanje rastojanja izmedju dve tacke
    public double distance(Point p) {
        int dx = x - p.getX();
        int dy = y - p.getY();

        return Math.sqrt(dx * dx + dy * dy);
    }

    // Provera da li se tacka nalazi u blizini zadatih koordinata
    public boolean contains(int x, int y) {
        return distance(new Point(x, y)) <= 2;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Point) {
            Point temp = (Point) o;

            if (this.x == temp.getX() && this.y == temp.getY()) {
                return true;
            }
        }

        return false;
    }

    // GET metode
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isSelected() {
        return selected;
    }

    // SET metode
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}