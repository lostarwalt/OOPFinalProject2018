package GUIs;

import javax.swing.*;

import edu.century.finalproject.Currency;
import edu.century.finalproject.Temperature;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureGUI extends JFrame {
	// choice strings
	private String[] FROM = new String[] { "Celcius", "Fahrenheit" };
	private String[] TO = new String[] { "Fahrenheit", "Celcius" };
	// labels
	JLabel input = new JLabel("Input Tempurature:");
	JLabel fromTemp = new JLabel("From:");
	JLabel toTemp = new JLabel("To:");
	JLabel outputL = new JLabel("Output:");
	// Fields
	JTextField inputF = new JTextField(10);
	JTextField outputF = new JTextField(10);
	// Choice box
	JComboBox<String> fromChoice = new JComboBox<String>(FROM);
	JComboBox<String> toChoice = new JComboBox<String>(TO);
	// Button
	JButton run = new JButton("Convert");
	// panels
	JPanel p1 = new JPanel(new FlowLayout());
	JPanel p2 = new JPanel(new FlowLayout());
	JPanel p3 = new JPanel(new FlowLayout());
	JPanel p4 = new JPanel(new FlowLayout());
	JFrame field;

	public class TempCalc implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			String from = (String) fromChoice.getSelectedItem();
			String to = (String) toChoice.getSelectedItem();
			double value = Double.parseDouble(inputF.getText());

			if (to == "Fahrenheit") {
				Temperature t = new Temperature();
				String result = t.convertCtoF(value) + "";
				outputF.setText(result);

			} else {
				Temperature t = new Temperature();
				String result = t.convertFtoC(value) + "";
			}

		}
	}

	public TemperatureGUI(String title) {
		super(title);
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(4, 1));

		run.addActionListener(new TempCalc());

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
		p2.add(fromTemp);
		p2.add(fromTemp);
		p2.add(toTemp);
		p2.add(toChoice);
	}

	public void createp3() {
		p3.add(run);
	}

	public void createp4() {
		p4.add(outputL);
		p4.add(outputF);
	}

	public static void main(String[] args) {
		TemperatureGUI frame = new TemperatureGUI("Temperature");
		frame.setVisible(true);
	}
}
