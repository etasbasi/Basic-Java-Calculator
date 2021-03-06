package com.enes.calculator.app;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class Panel extends JPanel {
		
	private JButton[] b;
	private JButton[] t;
	private static JLabel label;
	private String first = "";
	private String second = "";
	private String equation;
	private Boolean numFirst = true;
	private String sym = "";
	private double fN;
	private String text = "0";
	
		public Panel() {
			
			setLayout(new BorderLayout());
			
			JPanel pnl1 = new JPanel();
			add(pnl1, BorderLayout.NORTH);
			
			label = new JLabel("0");
			label.setFont(new Font("Arial", Font.BOLD, 20));
			pnl1.add(label);
			
			JPanel pnl2 = new JPanel();
			add(pnl2, BorderLayout.CENTER);
			
			pnl2.setLayout(new GridLayout(4, 3));
			
			b  = new JButton[10];
			for(int i = 0; i < 10; i++)
			{
			 b[i] = new JButton(Integer.toString(i));
			 b[i].addActionListener(new Listener1());
			 pnl2.add(b[i]);
			}
			
			JButton equal = new JButton("=");
			pnl2.add(equal);
			
			JButton clear = new JButton("Clear");
			pnl2.add(clear);
			
			JPanel pnl3 = new JPanel();
			add(pnl3, BorderLayout.EAST);
			
			pnl3.setLayout(new GridLayout(4, 1));
			
			t = new JButton[4];
			for(int i = 0; i < 4; i++) {
				t[0] = new JButton("+");
				t[1] = new JButton("-");
				t[2] = new JButton("x");
				t[3] = new JButton("/");
				pnl3.add(t[i]);
			}
		}
			public static void update(String equation) {
				label.setText(equation);
			}
			public class Listener1 implements ActionListener {
			 public void actionPerformed(ActionEvent evt) {
				 ArrayList<String> nums = new ArrayList<String>();
				 if(numFirst == true) {
					 nums.add("0");
				 }
					 switch (evt.getActionCommand()) {
					 case "0":
						 nums.add(Integer.toString(0));
						 text = text + 0;
						 update(text);
						 break;
					 case "1":
						 nums.add(Integer.toString(1));
						 break;
					 case "2":
						 nums.add(Integer.toString(2));
						 break;
					 
					 case "3":
						 nums.add(Integer.toString(3));
						 break;
					 
					 case "4":
						 nums.add(Integer.toString(4));
						 break;
					 
					case "5":
						 nums.add(Integer.toString(5));
						 break;
					 
					case "6":
						 nums.add(Integer.toString(6));
						 break;
					
					case "7":
						 nums.add(Integer.toString(7));
						 break;
					
					case "8":
						 nums.add(Integer.toString(8));
						 break;
					
					case "9":
						 nums.add(Integer.toString(9));
						 break;
					
					 }
			 }
		}
}