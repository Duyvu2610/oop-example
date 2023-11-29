package oop;

public class Main {
	public static void main(String[] args) {
		// Encapsulation
		Person person = new Student("Duy Vu", 25, "D123");
		System.out.println("Name: " + person.getName() + ", Age: " + person.getAge());

		// Inheritance
		Student student = new Student("Nguyen Van A", 20, "S12345");
		System.out.println("Name: " + student.getName() + ", Age: " + student.getAge() + ", Student ID: "
				+ student.getStudentId());
		student.goToWork();

		// Polymorphism
		Shape circle = new Circle();
		Shape rectangle = new Rectangle();
		circle.draw();
		rectangle.draw();

		// Abstraction
		Person dev = new Developer("Duy Vu", 25, "Java");
		dev.goToWork();
	}
}
