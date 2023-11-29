package oop;

//Tính chất Inheritance
class Student extends Person {
	private String studentId;

	// Constructor
	public Student(String name, int age, String studentId) {
		super(name, age);
		this.studentId = studentId;
	}

	// Phương thức getter và setter cho studentId
	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	@Override
	public void goToWork() {
		// TODO Auto-generated method stub
		System.out.println("Studying .....");
	}
	
}
