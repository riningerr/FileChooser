import java.io.File;
import java.util.ArrayList;

import javax.swing.JFileChooser;
import javax.swing.JFrame;



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
		
		/**************************************************
		* Use JFileChooser to get File Name and Directory *
		***************************************************/
		
		// Create the main "save" window
		JFrame myWindow = new JFrame();
		//Create the filechooser
		JFileChooser fChooser = new JFileChooser();
		fChooser.setDialogTitle("Save As");
		
		int selection = fChooser.showSaveDialog(myWindow);
		// Only if user selects "Save"
		if(selection == JFileChooser.APPROVE_OPTION) {
			File saveThisFile = fChooser.getSelectedFile();
			
			// Print the file name and directory to the console (debugging)
			System.out.println("Save As File" + saveThisFile.getAbsolutePath());
		}
		
		
	}
}