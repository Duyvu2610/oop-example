package oop;

//Tính chất Abstraction
public abstract class Person {
	//Tính chất Encapsulation
	private String name;
	private int age;

	// Constructor
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Phương thức getter và setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		}
	}

	public abstract void goToWork();

}
