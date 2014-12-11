import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 1L; //required for eclipse to quit whining.
	private String firstName;
	private String lastName;
	private int age;
	
	// Constructor for Person (w/ Arguments)
	public Person(String firstName, String lastName, int age) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	// Constructor for Person (w/o Arguments)
	public Person() {
	}
	
	// Setters
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	// Getters
	public String getFirstName() {
		return(this.firstName);
	}
	
	public String getLastName() {
		return(this.lastName);
	}
	
	public int getAge() {
		return(this.age);
	}
}
