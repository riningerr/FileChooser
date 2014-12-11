import java.io.*;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;


public class FileSaveAs {

	
	/**************************************************
	* Use JFileChooser to get File Name and Directory *
	***************************************************/
	
	public static void saveAs(Object obj) {
		
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
		FileNameExtensionFilter binType = new FileNameExtensionFilter("Binary File (.bin)", "bin");
		fChooser.addChoosableFileFilter(binType);
		fChooser.setFileFilter(binType);
	
		// Variable to store user selection
		int selection = fChooser.showSaveDialog(myWindow);
		
		// Only if user selects "Save"
		if(selection == JFileChooser.APPROVE_OPTION) {
			File saveThisFile = fChooser.getSelectedFile();
			
			//Ensure file has correct .bin extension
			String filePath = saveThisFile.getAbsolutePath();
			if(!filePath.endsWith(".bin")) {
				saveThisFile = new File(filePath + ".bin");
			}
			
			// Print the file name and directory to the console (debugging)
			//System.out.println("File Directory: " + saveThisFile.getAbsolutePath());
			//System.out.println("Name of File: "+saveThisFile.getName());
		
			/*************************
			 * Actually Save the File * 
			 **************************/
			System.out.println("Saving File...");
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
			System.out.println("Finished Saving File");
		}
	}
}
