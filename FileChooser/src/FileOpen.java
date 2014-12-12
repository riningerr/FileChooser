import java.io.*;
import java.util.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileOpen {

	/**************************************************
	* Use JFileChooser to get File Name and Directory *
	***************************************************/
	
	public static void open() {
		
		// Create the main "save" window
		JFrame myWindow = new JFrame();
		
		// Set style to current system being used
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		// Create filechooser
		JFileChooser fChooser = new JFileChooser();
		fChooser.setDialogTitle("Open");
		FileNameExtensionFilter binType = new FileNameExtensionFilter("Binary File (.bin)", "bin");
		fChooser.addChoosableFileFilter(binType);
		fChooser.setFileFilter(binType);
	
		// Variable to store user selection
		int selection = fChooser.showOpenDialog(myWindow);
		
		// Only if user selects "Open"
		if(selection == JFileChooser.APPROVE_OPTION) {
			File openThisFile = fChooser.getSelectedFile();
			
			/*************************
			 * Actually Open the File * 
			 **************************/
			System.out.println("Opening File...");
			try {
				FileInputStream fileIn = new FileInputStream(openThisFile);
				ObjectInputStream objectIn = new ObjectInputStream(fileIn);
				
				// Read opened file (arraylist) into variable "opened"
				@SuppressWarnings("unchecked")
				ArrayList<Person> fileOpened = (ArrayList<Person>) objectIn.readObject();
				
				// Close the output stream
				objectIn.close();
				System.out.println("Finished Opening File");
				
				// DO STUFF WITH THE FILE
				Person pplVar = new Person();
				for(int i = 0; i < fileOpened.size(); i++) {
					pplVar = fileOpened.get(i);
					System.out.println("Name: " + pplVar.getFirstName() + " " + pplVar.getLastName() + "; Age: " + pplVar.getAge());
				}
			}
			catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}
