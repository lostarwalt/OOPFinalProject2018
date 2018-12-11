package GUIs;


import javax.swing.*;

import edu.century.finalproject.Mass;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MassGui extends JFrame{
	
	//box choices
	String[] toArray = new String[] {"Lbs","Oz","Gram"};
	String[] fromArray = new String[] {"Lbs","Oz","Gram"};
	//fields
	JTextField input = new JTextField(10);
	JTextField output = new JTextField(15);
	//Button
	JButton calc = new JButton("Calculate");
	//Jcombobox
	JComboBox toBox = new JComboBox(toArray);
	JComboBox fromBox = new JComboBox(fromArray);
	//Labels
	JLabel inputL = new JLabel("Input Weight:");
	JLabel to = new JLabel("To:");
	JLabel from = new JLabel("From:");
	JLabel outputL = new JLabel("Converted Weight:");
	//Panels
	JPanel p1 = new JPanel(new FlowLayout());
	JPanel p2 = new JPanel(new FlowLayout());
	JPanel p3 = new JPanel(new FlowLayout());
	JPanel p4 = new JPanel(new FlowLayout());

	
	
	public class CalcAction implements ActionListener{
		public void actionPerformed(ActionEvent e) {	
		String to = (String)toBox.getSelectedItem();
		String from = (String)fromBox.getSelectedItem();
		int num = Integer.parseInt(input.getText());
		double num2 = Double.parseDouble(input.getText());
		
		if(to == "Lbs") {
			if(from == "Lbs") {
				int x = num*16;
				output.setText(Mass.toLbs(x));
			}else if(from == "Oz") {
				int x = num;
				output.setText(Mass.toLbs(x));
			}else if(from == "Gram") {
				double x = num2;
				output.setText(Mass.toLbs(x));
			}
		}else if(to == "Oz") {
			if(from == "Lbs") {
				int x = num*16;
				output.setText(x +" Oz");
			}else if(from == "Oz") {
				int x = num;
				output.setText(x + " Oz");
			}else if(from == "Gram") {
				double x = num2;
				output.setText(Mass.toOz(x));
			}
		}else if(to == "Gram") {
			if(from == "Lbs") {
				int x = num*16;
				output.setText(Mass.toGrams(x));
			}else if(from == "Oz") {
				double x = num * .03;
				output.setText(x + " Oz");
			}else if(from == "Gram") {
				double x = num2;
				output.setText(x + " Grams");
			}
		}else {
			output.setText("Error");
		}
		
		
		}
		
	}
		
	public MassGui(String title) {
		super(title);
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(4,1));
		
		calc.addActionListener(new CalcAction());
		
		createp1();
		createp2();
		createp3();
		createp4();
		
		add(p1);
		add(p2);
		add(p4);
		add(p3);
		
	}

	public void createp1() {
		p1.add(inputL);
		p1.add(input);
	}
	
	public void createp2() {
		p2.add(from);
		p2.add(fromBox);
		p2.add(to);
		p2.add(toBox);
	}
	
	public void createp3() {
		p3.add(outputL);
		p3.add(output);
	}
	
	public void createp4() {
		p4.add(calc);
	}
	
	public static void main(String[] args) {
		MassGui frame = new MassGui("Mass");
		frame.setVisible(true);
		
		
	}
}
