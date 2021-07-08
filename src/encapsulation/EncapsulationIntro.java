package encapsulation;

public class EncapsulationIntro {

	public static void main(String[] args) {
		Laptop l1 = new Laptop();
		l1.setPrice(43);
	}

}
class Laptop {
	int ram;
	private int price;
	
	public void setPrice(int price) {
		// you can check here if user is an admin
		this.price = price;
	}
}