import encapsulation.EncapsulationIntro;

//OOPS Concepts

public class MainClass {
	public static void main(String[] args) {
//		Person p2 = new Person(32, "Shivam Sharma");
//		Developer d1 = new Developer(21, "Kavish");
//		
//		d1.walk();
		EncapsulationIntro obj = new EncapsulationIntro();
//		obj.doWork();
	}
}
class Developer extends Person {

	public Developer(int age, String name) {
		super(age, name);
	}
	void walk() {
		System.out.println("Developer " + name + " is walking.");
	}
	
}
class Person {
	String name;
	int age;
	
	static int count;
//	public Person() {
//		count++;
//		System.out.println("Creating an object");
//	}
	public Person(int age, String name) {
		this.name = name;
		this.age = age;
	}
	
	void walk() {
		System.out.println(name + " is walking.");
	}
	void eat() {
		System.out.println(name + " is eating.");
	}
	void walk(int steps) {
		System.out.println(name + " walked " + steps);
	}
	void doWork() {
		System.out.println(name + " is working");
	}
	
}
