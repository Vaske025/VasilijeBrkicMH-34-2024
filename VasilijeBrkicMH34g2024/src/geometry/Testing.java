package geometry;

public class Testing {

	public static void main(String[] args) {
		
		Point p1 = new Point(); //new znaci alocirati mesto u memoriji, Point() - konstruktor (napravi mi objekat ove klase)
		
		//p1.x = 50; ne bo ovako trebali da radimo zbog enkapsulacije
		p1.setX(50);
		System.out.println(p1.getX()); // p1 je REFERENCA na objekat a ne objekat
		System.out.println(p1.getY());
		System.out.println(p1.isSelected());
		

	}

}
