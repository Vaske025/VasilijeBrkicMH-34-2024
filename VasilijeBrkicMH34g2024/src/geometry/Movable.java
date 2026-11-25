package geometry;

public interface Movable {

//	Interface-i dozvoljavaju samo staticke konstante
//	public static final boolean VALID = true;
//	Interface-i mogu da imaju samo apstraktne metode
//	public abstract void primer();	
//	S obzirom da se ocekuje da su metode javne i apstraktne public i abstract kljucne reci se mogu izostaviti
	
	void moveTo(int x, int y);
	
	void moveBy(int byX, int byY);
	
}
