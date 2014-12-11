import java.util.ArrayList;


public class FileChooser {

	public static void main(String[] args) {
		
		
		/*******************************************
		* INSTANTIATE OBJECTS AND CREATE ARRAYLIST *
		********************************************/
		//Create 3 instances of Person
		Person A = new Person("Jim", "Smith", 33);
		Person B = new Person("Henry", "Jones", 28);
		Person C = new Person("Christine", "Adams", 22);
		
		// Print the fields of each person (debugging)
		System.out.println(A.getFirstName() + " " + A.getLastName() + "; Age: " + A.getAge());
		System.out.println(B.getFirstName() + " " + B.getLastName() + "; Age: " + B.getAge());
		System.out.println(C.getFirstName() + " " + C.getLastName() + "; Age: " + C.getAge());
		
		// Create new arrayList (<Person> indicates that only objects from class Person can be added)
		ArrayList<Person> aList = new ArrayList<Person>();
		// Check size of arrayList (debugging)
		System.out.println("Size of array list is " + aList.size());
		
		// Add objects to arrayList
		aList.add(A);
		aList.add(B);
		aList.add(C);
		// Check size of arrayList (debugging)
		System.out.println("Size of array list is " + aList.size());
		
		// Test accessing second element in ArrayList
		Person pplVar = new Person();
		pplVar = aList.get(1);
		
		System.out.println("Second Element is: " + pplVar.getFirstName() + " " + pplVar.getLastName() + " " + pplVar.getAge());
		
		
	}
}