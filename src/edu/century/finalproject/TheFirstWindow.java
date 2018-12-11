package edu.century.finalproject;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import GUIs.*;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import java.awt.*;

public class TheFirstWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TheFirstWindow window = new TheFirstWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TheFirstWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		JButton temp = new JButton("Temperature");	
		CalcAction action = new CalcAction();
		JButton cur = new JButton("Currency");
		JButton vol = new JButton("Volume");
		JButton mas = new JButton("Mass");
		
		temp.addActionListener(action);
		cur.addActionListener(action);
		vol.addActionListener(action);
		mas.addActionListener(action);
		
		//panels
		JPanel p1 = new JPanel(new FlowLayout());
		JPanel p2 = new JPanel(new FlowLayout());
		JPanel p3 = new JPanel(new FlowLayout());
		JPanel p4 = new JPanel(new FlowLayout());
		
		p1.add(temp);
		p2.add(cur);
		p3.add(vol);
		p4.add(mas);
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));

		frame.getContentPane().add(p1);
		frame.getContentPane().add(p2);
		frame.getContentPane().add(p3);
		frame.getContentPane().add(p4);
	}
	
	class CalcAction implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton btn = (JButton)e.getSource();
			switch(btn.getText()) {
			case "Temperature":
				TemperatureGUI window = new TemperatureGUI("Temperature Converter");
				window.setVisible(true);
				break;
			case "Currency":
				CurrencyGui window1 = new CurrencyGui("Currency Converter");
				window1.setVisible(true);
				break;
			case "Volume":
				VolumeGUI window2 = new VolumeGUI("Volume Converter");
				window2.setVisible(true);
				break;
			case "Mass":
				MassGui window3 = new MassGui("Mass Converter");
				window3.setVisible(true);
				break;
				
			}
		}
	}
}
