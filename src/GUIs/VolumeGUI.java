package GUIs;

import javax.swing.*;

import edu.century.finalproject.Volume;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VolumeGUI extends JFrame{
	//choice strings
	private String[] FROM = new String[] {"US liquid gallon","US liquid quart", "US liquid pint", "US legal cup", "US fluid ounce", "US tablespoon", "US teaspoon", "cubic meter", "liter", "milliliter", "imperial gallon", "imperial quart", "imperial pint", "imperial cup", "imperial fluid ounce", "imperial tablespoon", "imperial teaspoon", "cubic foot", "cubic inch"};
	private String[] TO = new String[] {"US liquid gallon","US liquid quart", "US liquid pint", "US legal cup", "US fluid ounce", "US tablespoon", "US teaspoon", "cubic meter", "liter", "milliliter", "imperial gallon", "imperial quart", "imperial pint", "imperial cup", "imperial fluid ounce", "imperial tablespoon", "imperial teaspoon", "cubic foot", "cubic inch"};
	//labels
	JLabel input = new JLabel("Input Volume:");
	JLabel fromTemperature = new JLabel("From:");
	JLabel toTemperature = new JLabel("To:");
	JLabel outputL = new JLabel("Output:");
	//Fields
	JTextField inputF = new JTextField(10);
	JTextField outputF = new JTextField(10);
	//Choice box
	JComboBox<String> fromChoice = new JComboBox<String>(FROM);
	JComboBox toChoice = new JComboBox(TO);
	//Button
	JButton run = new JButton("Convert");
	//panels
	JPanel p1 = new JPanel(new FlowLayout());
	JPanel p2 = new JPanel(new FlowLayout());
	JPanel p3 = new JPanel(new FlowLayout());
	JPanel p4 = new JPanel(new FlowLayout());
	
		public VolumeGUI(String title) {
		super(title);
		setSize(300,250);
		setLayout(new GridLayout(4,1));
		
		run.addActionListener(new VolumeCalc());
		
		createp1();
		createp2();
		createp3();
		createp4();
		
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		
	}
	
	public void createp1() {
		p1.add(input);
		p1.add(inputF);
	}
	
	public void createp2() {
		p2.add(fromTemperature);
		p2.add(fromChoice);
		p2.add(toTemperature);
		p2.add(toChoice);
	}
	
	public void createp3() {
		p3.add(run);
	}
	
	public void createp4() {
		p4.add(outputL);
		p4.add(outputF);
	}
	private class VolumeCalc implements ActionListener{

		public void actionPerformed(ActionEvent e) {
            String from = (String) fromChoice.getSelectedItem();
            String to = (String)toChoice.getSelectedItem();
            double value = Double.parseDouble(inputF.getText());

            Volume v = new Volume();
            String result = v.convertToLiters(from, to, value)+"";
			}
        }}
