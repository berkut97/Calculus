package main;

import java.awt.Dimension;

import javax.swing.JFrame;

import main.FormManager;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Password extends JFrame{
	private FormManager manager;
	private JTextField textField;

	public Password(FormManager manager) {
		setTitle("Кредитор");
	    this.manager = manager;
	    setPreferredSize(new Dimension(300, 200));
	    pack();
	    getContentPane().setLayout(null);
	    
	    JLabel lblNewLabel = new JLabel("Введите пароль");
	    lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
	    lblNewLabel.setBounds(90, 32, 108, 25);
	    getContentPane().add(lblNewLabel);
	    
	    textField = new JTextField();
	    textField.setBounds(97, 70, 89, 20);
	    getContentPane().add(textField);
	    textField.setColumns(10);
	    
	    JButton button = new JButton("Вход");
	    button.addActionListener(new ActionListener() {
	    	@Override
	    	public void actionPerformed(ActionEvent arg0) {
	    		PasswordClassic pp = new PasswordClassic();
	    		int pass = Integer.parseInt(textField.getText());
	    		int x = (pp.getP(pass));
	    		if (x == 1){
	    		manager.toggleForms1();
	    }
	    	}
	    });
	    button.setBounds(97, 111, 89, 23);
	    getContentPane().add(button);
	    
}
}
