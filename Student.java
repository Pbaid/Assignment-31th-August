import java.utils.*;

public class Student {
	
	int rollNo;
	String firstName;
	String lastName;
	int studentAge;
	
	public Student(int rollNo, String firstName, String lastName, int studentAge) {
		
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentAge = studentAge;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	@Override
	public String toString() {
		return "Student [getRollNo()=" + getRollNo() + ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + ", getStudentAge()=" + getStudentAge() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + rollNo;
		result = prime * result + studentAge;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (rollNo != other.rollNo)
			return false;
		if (studentAge != other.studentAge)
			return false;
		return true;
	}
	
	public static void main(String[] args) {
		
		Student stu = new Student(30,"Paras","Baid",21);
		System.out.println(stu.toString());
		System.out.println(stu.hashCode());
	}
}
