import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class FileSave {

	
	/**************************************************
	* Use JFileChooser to get File Name and Directory *
	***************************************************/
	
	public static void saveFile(Object obj) {
		
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
		fChooser.setDialogTitle("Save As");
	
		// Variable to store user selection
		int selection = fChooser.showSaveDialog(myWindow);
		
		// Only if user selects "Save"
		if(selection == JFileChooser.APPROVE_OPTION) {
			File saveThisFile = fChooser.getSelectedFile();
			
			// Print the file name and directory to the console (debugging)
			System.out.println("File Directory: " + saveThisFile.getAbsolutePath());
			System.out.println("Name of File: "+saveThisFile.getName());
		
			/*************************
			 * Actually Save the File * 
			 **************************/

			try {
				FileOutputStream fileOut = new FileOutputStream(saveThisFile);
				ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
				objectOut.writeObject(obj);
				// Close the output stream
				objectOut.close();
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
