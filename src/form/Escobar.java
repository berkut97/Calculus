package form;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import main.FormManager;
import javax.swing.JLabel;
import java.awt.Window.Type;
import java.awt.Font;

public class Escobar extends JFrame {
	private FormManager manager;
	
	public Escobar(FormManager manager) {
	    this.manager = manager;
	    setPreferredSize(new Dimension(410, 370));
	    pack();
	    getContentPane().setLayout(null);
	    
	    JButton button = new JButton("Клиент");
	    button.addActionListener(new ActionListener() {
	    	 @Override
	    	public void actionPerformed(ActionEvent e) {
	    		 manager.toggleForms();
	    	}
	    });
	    button.setBounds(21, 168, 89, 36);
	    getContentPane().add(button);
	    
	    JButton button_1 = new JButton("Кредитор");
	    button_1.addActionListener(new ActionListener() {
	    	@Override
	    	public void actionPerformed(ActionEvent arg0) {
	    		manager.toggleForms2();
	    	}
	    });
	    button_1.setBounds(283, 168, 94, 36);
	    getContentPane().add(button_1);
	    
	    JButton button_2 = new JButton("Выход");
	    button_2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		System.exit(0);
	    	}
	    });
	    button_2.setBounds(304, 297, 80, 23);
	    getContentPane().add(button_2);
	    
	    JLabel label = new JLabel("Выберите пользователя ");
	    label.setFont(new Font("Tahoma", Font.PLAIN, 18));
	    label.setBounds(95, 74, 234, 44);
	    getContentPane().add(label);
	    
	}
}

