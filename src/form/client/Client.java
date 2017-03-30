package form.client;

import java.awt.BorderLayout;
import java.awt.Dimension;
import main.CalcClassic;

import javax.swing.JFrame;

import main.FormManager;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class Client extends JFrame {
	private final FormManager manager;
	private JTextField textField;
	private JTextField textField_2;
	public Client(final FormManager manager) {
		setTitle("Клиент");
	    this.manager = manager;
	    setPreferredSize(new Dimension(500,300));
	    pack();
	    getContentPane().setLayout(null);
	    
	    JButton button = new JButton("Выход");
	    button.addActionListener(new ActionListener() {
	    	@Override
	    	public void actionPerformed(ActionEvent arg0) {
	    		manager.toggleForms();
	    	}
	    });
	    button.setBounds(394, 227, 80, 23);
	    getContentPane().add(button);
	    
	    JLabel label = new JLabel("Сумма кредита");
	    label.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    label.setBounds(27, 67, 151, 23);
	    getContentPane().add(label);
	    
	    JLabel label_1 = new JLabel("Срок кредитования");
	    label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    label_1.setBounds(27, 116, 151, 23);
	    getContentPane().add(label_1);
	    
	    textField = new JTextField();
	    textField.setText("10000");
	    textField.setBounds(205, 70, 86, 20);
	    getContentPane().add(textField);
	    textField.setColumns(10);
	    
	    
	    textField_2 = new JTextField();
	    textField_2.setColumns(10);
	    textField_2.setBounds(205, 172, 86, 20);
	    getContentPane().add(textField_2);
	    
	    JComboBox comboBox = new JComboBox();
	    comboBox.setBounds(205, 119, 69, 20);
	    getContentPane().add(comboBox);
	    comboBox.setEditable(true);
	    comboBox.setModel(new DefaultComboBoxModel(new String[] {"1 год", "2 года", "3 года", "4 года", "5 лет"}));
	    
	    JComboBox comboBox_1 = new JComboBox();
	    comboBox_1.setBounds(289, 119, 69, 20);
	    getContentPane().add(comboBox_1);
	    comboBox_1.setEditable(true);
	    comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"0 мес", "1 мес", "2 мес", "3 мес", "4 мес", "5 мес", "6 мес", "7 мес", "8 мес", "9 мес", "10 мес", "11 мес"}));
	    
	    JButton btnNewButton = new JButton("Рассчитать");
	    btnNewButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		 CalcClassic cc = new CalcClassic();
	    		 double bet = 1.18;
	    		 int month = 0;
	    		 int year = 0; 
	    		 int sum = Integer.parseInt(textField.getText());
	    		 int oftheyear = comboBox.getSelectedIndex();
	    		 int months = comboBox_1.getSelectedIndex();
	    		 switch(oftheyear){    
	    		 case 0: year = 12; break;
	    		 case 1: year = 24; break;
	    		 case 2: year = 36; break;
	    		 case 3: year = 48; break; 
	    		 case 4: year = 60; break; 
	    		 }
	    		 switch(months){
	    		 case 0: month = 0; break;
	    		 case 1: month = 1; break;
	    		 case 2: month = 2; break;
	    		 case 3: month = 3; break;
	    		 case 4: month = 4; break;
	    		 case 5: month = 5; break;
	    		 case 6: month = 6; break;
	    		 case 7: month = 7; break;
	    		 case 8: month = 8; break;
	    		 case 9: month = 9; break;
	    		 case 10: month = 10; break;
	    		 case 11: month = 11; break;
	    		 }
	    		 int time = year + month;
	    		 textField_2.setText(cc.getP(sum, bet, time));
	    	}
	    });
	    btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    btnNewButton.setBounds(22, 227, 116, 23);
	    getContentPane().add(btnNewButton);
	    
	    JLabel label_2 = new JLabel("Ежемесечный платеж");
	    label_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    label_2.setBounds(27, 169, 161, 23);
	    getContentPane().add(label_2);

	    
	    JLabel lblNewLabel = new JLabel("Клиент");
	    lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
	    lblNewLabel.setBounds(205, 11, 69, 29);
	    getContentPane().add(lblNewLabel);
	    
	    JLabel lblNewLabel_1 = new JLabel("Руб.");
	    lblNewLabel_1.setBounds(312, 73, 46, 14);
	    getContentPane().add(lblNewLabel_1);
	    
	    JLabel label_3 = new JLabel("Руб.");
	    label_3.setBounds(312, 175, 46, 14);
	    getContentPane().add(label_3);
	    

	}
}
