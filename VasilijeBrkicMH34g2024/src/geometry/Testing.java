
package geometry;

public class Testing {

	public static void main(String[] args) {

		// KREIRANJE OBJEKTA KLASE POINT
		Point p1 = new Point();

		// Enkapsulacija - pristup preko get i set metoda
		p1.setX(50);

		System.out.println(p1.getX());
		System.out.println(p1.getY());
		System.out.println(p1.isSelected());

		// RAD SA REFERENCAMA I OBJEKTIMA

		Point p2 = new Point();

		p1.setX(50);
		p1.setX(20);

		p2.setY(40);
		p1.setY(30);

		p1 = p2;

		p1.setX(200);
		p2.setY(100);

		p2 = new Point(200, 100);

		// KLASA LINE

		Line l1 = new Line();

		l1.setStartPoint(p1);
		l1.setEndPoint(new Point());

		// KLASA RECTANGLE

		Rectangle r1 = new Rectangle();

		r1.setUpperLeft(p1);
		r1.setWidth(20);
		r1.setHeight(10);

		// System.out.println("POVRSINA PRAVOUGAONIKA " + r1.area());
		// System.out.println("OBIM PRAVOUGAONIKA " + r1.circumference());

		// KLASA CIRCLE

		Circle c1 = new Circle();

		c1.setRadius(5);
		c1.setCenter(p2);

		// System.out.println("RADIUS KRUGA " + c1.getRadius());
		// System.out.println("POVRSINA KRUGA " + c1.area());
		// System.out.println("OBIM KRUGA " + c1.circumference());

		// VEZBE 4 - KONSTRUKTOR

		Rectangle r2 = new Rectangle(new Point(20, 20), 50, 50);

		// toString metoda
		System.out.println(r2.toString());
		System.out.println(r2);

		// equals metoda - poredjenje objekata

		Rectangle r4 = new Rectangle(new Point(20, 20), 50, 50);

		System.out.println(r2.equals(r4));

		// INSTANCEOF OPERATOR

		System.out.println("Da li su pravougaonici instance klase Object?");
		System.out.println(r2 instanceof Object);

		Object ob = new Object();

		System.out.println("Objekti klase Object nisu instance bilo koje druge klase");
		System.out.println(ob instanceof Rectangle);

		// TESTIRANJE TOSTRING METODE

		System.out.println("Testiranje toString metode:");

		System.out.println(p1);
		System.out.println(l1);
		System.out.println(c1);
		System.out.println(r2);

		// TESTIRANJE EQUALS METODE

		System.out.println("Testiranje equals metode:");

		System.out.println(p1.equals(r2));
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(ob));

		Line l2 = new Line();

		Point p3 = new Point(200, 100);

		l2.setStartPoint(p3);
		l2.setEndPoint(new Point());

		System.out.println(l1.equals(l2));

		Circle c2 = new Circle(5, p3);

		System.out.println(c1.equals(c2));

		System.out.println(" ");

		System.out.println(r1);
		System.out.println(r2);

		// r2.setWidth(20);
		// r2.setHeight(10);

		System.out.println(r1.equals(r2));

		// ISPRAVKA

		System.out.println();
		System.out.println("ispravak");

		System.out.println(l1);
		System.out.println(l2);

		System.out.println(l1.equals(l2));

		Line l3 = new Line(new Point(200, 100), new Point(0, 0));

		System.out.println(l3);
		System.out.println(l3.equals(l2));

		Donut d1 = new Donut(new Point(50,50));
		System.out.println("Centar kruga je: " + d1.getCenter());
		System.out.println("Poluprecnik velikog kruga je: " + d1.getRadius());
		System.out.println("Povrsina donuta je: " + d1.area());

		System.out.println(d1 instanceof Donut);
		System.out.println(d1 instanceof Circle);
		System.out.println(d1 instanceof Object);
		
		System.out.println(c1 instanceof Donut);
	}
}

// PROFESOR VOLI DA PITA APSTRAKTNU KLASU NA ODBRANI "abstract", ne moguce je napraviti objekat te klase ali tip reference moze
