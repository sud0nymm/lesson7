package lesson7;
import javax.swing.*;
import javax.swing.JFrame; 
import java.awt.*;
import java.awt.event.*;

//approximately the size/difficulty of task 3 on the exam
//if u get this right, ez 5 points

/*general notes: 

learn to define a grid layout in your head
	you can still test shiz 

"if you misunderstand something during the exam don't worry	you 
can still get fully points because I see you don't lack coding skills"
	-mark da goat
*/

public class GUI extends JFrame implements ActionListener{ //JFrame Needed for Container, ActionListener for actionPerformed method
	
	// SECOND STEP	
	// need two buttons, 2 radio buttons, 2 text fields and 3 panels
	private JButton myButton1, myButton2; 
	private JRadioButton myRB1, myRB2;
	private JTextField text1, text2;
	private JPanel panel1, panel2, panel3;
	//next step is to initialize them
	/*
	pane 1 is a text panel, editable
	pane 3 is a 
	 */
	
	//GUI Class
	public GUI() {
		
		// THIRD STEP
		// reference font to use every time:
		Font myFont = new Font("SansSerif", Font.ITALIC, 25);
		
		//making buttons
		myButton2 = new JButton("on");
		myButton2.setFont(myFont);
		myButton1 = new JButton("Copy Text");
		myButton1.setFont(myFont);
		// part of st.5, to make button do something
		myButton2.addActionListener(this);
		myButton1.addActionListener(this);
		
		//making panels
		panel1 = new JPanel();
		panel1.setLayout(new GridLayout(1,2));
		panel1.add(myButton1);
		panel1.add(myButton2);
		
		//making radiob's
		myRB1 = new JRadioButton();
		myRB1.setText("Copy full text");
		myRB1.setFont(myFont);
		myRB1.doClick(); // clicks the radiobutton automatically
		// copying and pasting is very useful
		myRB2 = new JRadioButton();
		myRB2.setText("Copy selected text");
		myRB2.setFont(myFont);
		
		//adding rb's to da panel
		panel2 = new JPanel();
		panel2.setLayout(new GridLayout(2,1)); //YAY!
		panel2.add(myRB1);
		panel2.add(myRB2);
		
		// the middle part of the GUI
			// panels inside of panels!
		panel3 = new JPanel();
		panel3.add(panel1);
		panel3.add(panel2);
		
		// text in da thingy
		text1 = new JTextField();
		text1.setFont(myFont);
		text2 = new JTextField();
		text2.setEditable(false);
		text2.setFont(myFont);
		//text2.setText("FUCKA");
		
		// FIRST STEP
		Container c = getContentPane();
		c.setLayout(new GridLayout(3,1));
		
		// me fucking around
		c.setPreferredSize(new Dimension(600,300)); // how to change c's size when using pack()
		c.setLocation(1000, 600); // doesn't work lmao
		
		// FOURTH STEP CONT.
		c.add(text1); 
		c.add(panel3);
		c.add(text2);
		
		// this should work so far
		
		// FIRST STEP CONT.
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//only this part gives a point, ez money
		
		
	}
	
	// STEP FIVE, actionPerrformed method
		// pressing button 2 should disable editing for the text field
		// its text should also be set to "off"
		// reverse when pressing again

	public void actionPerformed(ActionEvent ae) {
		
		if (ae.getSource() == myButton2) {
			if (myButton2.getText().equals("on")) {
				System.out.println("mb2 off");
				myButton2.setText("off");
				text1.setEditable(false);
			}else {
				System.out.println("mb2 on");
				myButton2.setText("on");
				text1.setEditable(true);
			}
		}
		
		// GUESSING - STEP 6, 
		// make copy selected and copy full text actually copy that shit (to text2)
		if(ae.getSource() == myButton1) { // copy full text
			if (myRB2.isSelected()) {
				
				text2.setText(text1.getSelectedText());
				
			}
			else if(myRB1.isSelected()) {
			
				text2.setText(text1.getText());
				
			}
			
			
			
		} 
	
	}
	
	
	// MAIN
	public static void main(String[] args) {
		// part of FIRST STEP
		GUI myGUI = new GUI();
		
	}
	
}






























