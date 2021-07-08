
public class Interfaces implements CarInterface, PersonInterface{
	public static void main(String[] args) {
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("my car is starting");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}
}
interface CarInterface{
	void start();
}
interface PersonInterface{
	void walk();
}
