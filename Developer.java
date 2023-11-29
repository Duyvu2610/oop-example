package oop;

public class Developer extends Person {
	private String language;

	// Constructor
	public Developer(String name, int age, String language) {
		super(name, age);
		this.language = language;
	}

	// Phương thức getter và setter cho studentId
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public void goToWork() {
		// TODO Auto-generated method stub
		System.out.println("Coding ......");
	}

}
