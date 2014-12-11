import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;


public class MyProgram extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		
		/*****************
	    * Create the GUI *
	    ******************/
		
		// Create new frame
		JFrame mainWindow = new JFrame();
		mainWindow.setTitle("My Program");
		mainWindow.setSize(800, 600);
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.setVisible(true);
		

		// Create panel for main window
		JPanel mainPanel = new JPanel(new BorderLayout());
		JPanel menuPanel = new JPanel(new BorderLayout());

		// Add panels to container
		Container pane = mainWindow.getContentPane();
		pane.add(mainPanel, BorderLayout.CENTER);
		pane.add(menuPanel, BorderLayout.NORTH);
		
		// Create MenuBar
		JMenuBar menuBar = new JMenuBar();
		
		// Create Menu
		JMenu fileMenu = new JMenu("File");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		
		// Create Menu Items
		JMenuItem save = new JMenuItem("Save");
		JMenuItem saveAs = new JMenuItem("Save As");
		JMenuItem open = new JMenuItem("Open");

		// Add Menu Items to File Menu
		fileMenu.add(open);
		fileMenu.add(save);
		fileMenu.add(saveAs);
		
		// Add File Menu to menuBar
		menuBar.add(fileMenu);
		menuPanel.add(menuBar);
		
		/*******************************************
		* INSTANTIATE OBJECTS AND CREATE ARRAYLIST *
		********************************************/
		//Create 3 instances of Person
		Person A = new Person("Jim", "Smith", 33);
		Person B = new Person("Henry", "Jones", 28);
		Person C = new Person("Christine", "Adams", 22);
		
		// Print the fields of each person (debugging)
		//System.out.println(A.getFirstName() + " " + A.getLastName() + "; Age: " + A.getAge());
		//System.out.println(B.getFirstName() + " " + B.getLastName() + "; Age: " + B.getAge());
		//System.out.println(C.getFirstName() + " " + C.getLastName() + "; Age: " + C.getAge());
		
		// Create new arrayList (<Person> indicates that only objects from class Person can be added)
		ArrayList<Person> aList = new ArrayList<Person>();
		// Check size of arrayList (debugging)
		//System.out.println("Size of array list is " + aList.size());
		
		// Add objects to arrayList
		aList.add(A);
		aList.add(B);
		aList.add(C);
		
		// Check size of arrayList (debugging)
		//System.out.println("Size of array list is " + aList.size());
		
		// Test accessing second element in ArrayList
		//Person pplVar = new Person();
		//pplVar = aList.get(1);
		
		//System.out.println("Second Element is: " + pplVar.getFirstName() + " " + pplVar.getLastName() + " " + pplVar.getAge());
	
		// Action Listener for "Open" menu item
		open.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// Add File Open Method Here
			}
		});
		
		// Action Listener for "Save" menu item
		save.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// Add File Save Method Here
			}
		});
		
		// Add Action Listener for "Save As" menu item
		saveAs.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				FileSaveAs.saveAs(aList);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}