package GUIs;

import javax.swing.*;

import edu.century.finalproject.Currency;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyGui extends JFrame{
	//choice strings
	private String[] FROM = new String[] {"USD","EURO","POUND","PESO","YEN","CSD"};
	private String[] TO = new String[] {"USD","EURO","POUND","PESO","YEN","CSD"};
	//labels
	JLabel input = new JLabel("Input currency");
	JLabel fromCurrency = new JLabel("From");
	JLabel toCurrency = new JLabel("To");
	JLabel outputL = new JLabel("Output");
	//Fields
	JTextField inputF = new JTextField(10);
	JTextField outputF = new JTextField(10);
	//Choice box
	JComboBox<String> fromChoice = new JComboBox<String>(FROM);
	JComboBox<String> toChoice = new JComboBox<String>(TO);
	//Button
	JButton run = new JButton("Convert");
	//panels
	JPanel p1 = new JPanel(new FlowLayout());
	JPanel p2 = new JPanel(new FlowLayout());
	JPanel p3 = new JPanel(new FlowLayout());
	JPanel p4 = new JPanel(new FlowLayout());
	
	
	public class CurrencyCalc implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			String from = (String)fromChoice.getSelectedItem();
			String to = (String)toChoice.getSelectedItem();
			double start = Double.parseDouble(inputF.getText());
			
			if(to == "USD") {
				
				outputF.setText(String.valueOf(Currency.toUsd(start, from)));
				
			}else if(to == "EURO") {
				outputF.setText(String.valueOf(Currency.toEuro(start, from)));
			}
			else if(to == "POUND") {
				outputF.setText(String.valueOf(Currency.toPound(start, from)));
			}
			else if(to == "YEN") {
				outputF.setText(String.valueOf(Currency.toYen(start, from)));
			}
			else if(to == "PESO") {
				outputF.setText(String.valueOf(Currency.toPeso(start, from)));
			}
			else if(to == "CSD") {
				outputF.setText(String.valueOf(Currency.toCanadian(start, from)));
			}else {
				outputF.setText("Error calculating");
			}
		}
		
	}
	
	
	public CurrencyGui(String title) {
		super(title);
		setSize(300,250);
		setLayout(new GridLayout(4,1));
		
		run.addActionListener(new CurrencyCalc());
		
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
		p2.add(fromCurrency);
		p2.add(fromChoice);
		p2.add(toCurrency);
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
		CurrencyGui frame = new CurrencyGui("Currency");
		frame.setVisible(true);
	}
}
