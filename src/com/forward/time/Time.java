package com.forward.time;

import java.awt.BorderLayout;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Time extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = -9102690604463004381L;
	JTextField jTextField;
	JPanel jpanel;
	public Time() {
		init();
		this.setSize(210, 90);
		this.setLocationRelativeTo(null);
		//this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	private void init() {
		jTextField = new JTextField();
		jTextField.setSize(200, 50);
		jTextField.setBackground(Color.GRAY);
		Date date = new Date();
		String pattern = "yyyy-MM-dd'at'HH'h'mm'm'ss's'";
		SimpleDateFormat f = new SimpleDateFormat(pattern);
		String time = f.format(date);
		jTextField.setText("date"+time);
		this.add(jTextField);
		this.setLayout(new BorderLayout());
		this.setTitle("获得当前系统时间");
	}
	
	public static void main(String[] args) {
		new Time();
	}
}
