package form.creditor;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

import main.CalcClassic;
import main.FormManager;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Creditor extends JFrame {
	private final FormManager manager;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	public Creditor(final FormManager manager) {
		setTitle("Кредитор");
	    this.manager = manager;
	    setPreferredSize(new Dimension(500,400));
	    pack();
	    getContentPane().setLayout(null);
	    
	    JLabel label = new JLabel("Кредитор");
	    label.setFont(new Font("Tahoma", Font.PLAIN, 18));
	    label.setBounds(201, 11, 85, 29);
	    getContentPane().add(label);
	    
	    JLabel label_1 = new JLabel("Сумма кредита");
	    label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    label_1.setBounds(22, 49, 151, 23);
	    getContentPane().add(label_1);
	    
	    textField = new JTextField();
	    textField.setText("10000");
	    textField.setColumns(10);
	    textField.setBounds(200, 52, 86, 20);
	    getContentPane().add(textField);
	    
	    textField_2 = new JTextField();
	    textField_2.setColumns(10);
	    textField_2.setBounds(201, 120, 86, 20);
	    getContentPane().add(textField_2);
	    
	    JLabel label_2 = new JLabel("Руб.");
	    label_2.setBounds(317, 55, 46, 14);
	    getContentPane().add(label_2);
	    
	    JButton button = new JButton("Выход");
	    button.addActionListener(new ActionListener() {
	    	@Override
	    	public void actionPerformed(ActionEvent arg0) {
	    		manager.toggleForms1();
	    	}
	    });
	    button.setBounds(394, 329, 80, 23);
	    getContentPane().add(button);
	    
	    JLabel label_3 = new JLabel("Срок кредитования");
	    label_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    label_3.setBounds(22, 83, 151, 23);
	    getContentPane().add(label_3);
	    
	    JComboBox comboBox = new JComboBox();
	    comboBox.setEditable(true);
	    comboBox.setBounds(201, 86, 69, 20);
	    getContentPane().add(comboBox);
	    comboBox.setModel(new DefaultComboBoxModel(new String[] {"1 год", "2 года", "3 года", "4 года", "5 лет"}));
	    
	    JComboBox comboBox_1 = new JComboBox();
	    comboBox_1.setEditable(true);
	    comboBox_1.setBounds(280, 86, 69, 20);
	    getContentPane().add(comboBox_1);
	    comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"0 мес", "1 мес", "2 мес", "3 мес", "4 мес", "5 мес", "6 мес", "7 мес", "8 мес", "9 мес", "10 мес", "11 мес"}));
	    
	    JComboBox comboBox_2 = new JComboBox();
	    comboBox_2.setBounds(201, 154, 241, 20);
	    getContentPane().add(comboBox_2);
	    comboBox_2.addItem("Получатель зарплаты в банке");
	    comboBox_2.addItem("Получатель пенсии в банке");
	    comboBox_2.addItem("Общие условия");
	    
	    JButton button_1 = new JButton("Рассчитать");
	    button_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		CalcClassic cc = new CalcClassic();
	    		 double bet = 0;
	    		 int month = 0;
	    		 int year = 0; 
	    		 int sum = Integer.parseInt(textField.getText());
	    		 int mainProfit = Integer.parseInt(textField_3.getText());
	    		 int oftheyear = comboBox.getSelectedIndex();
	    		 int months = comboBox_1.getSelectedIndex();
	    		 int CategoryBorrower = comboBox_2.getSelectedIndex();
	    		 switch(CategoryBorrower){
	    		 case 0: bet = 1.15; break;
	    		 case 1: bet = 1.12; break;
	    		 case 2: bet = 1.18; break;
	    		 }
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
	    		 if (((sum*bet)/time > mainProfit) || (Integer.parseInt(textField_2.getText()) < 18)){
	    			 textField_4.setText("Отклонен");
	    			 textField_1.setText("");
	    		 }else{
	    			 textField_4.setText("Одобрен");
	    			 textField_1.setText(cc.getP(sum, bet, time));
	    		 }
	    	}
	    });
	    button_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    button_1.setBounds(10, 327, 116, 23);
	    getContentPane().add(button_1);
	    
	    JLabel label_4 = new JLabel("Ежемесечный платеж");
	    label_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    label_4.setBounds(22, 293, 161, 23);
	    getContentPane().add(label_4);
	    
	    textField_1 = new JTextField();
	    textField_1.setColumns(10);
	    textField_1.setBounds(201, 296, 86, 20);
	    getContentPane().add(textField_1);
	    
	    JLabel label_5 = new JLabel("Руб.");
	    label_5.setBounds(317, 299, 46, 14);
	    getContentPane().add(label_5);
	    
	    JLabel label_6 = new JLabel("Категория заемщика");
	    label_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    label_6.setBounds(22, 151, 151, 23);
	    getContentPane().add(label_6);
	    
	    JLabel label_7 = new JLabel("Возраст");
	    label_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    label_7.setBounds(22, 117, 151, 23);
	    getContentPane().add(label_7);
	    
	    JLabel label_8 = new JLabel("Основной доход");
	    label_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    label_8.setBounds(22, 185, 151, 23);
	    getContentPane().add(label_8);
	    
	    JLabel label_9 = new JLabel("Статус кредита");
	    label_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    label_9.setBounds(22, 259, 151, 23);
	    getContentPane().add(label_9);
	    
	    
	    textField_3 = new JTextField();
	    textField_3.setColumns(10);
	    textField_3.setBounds(201, 188, 86, 20);
	    getContentPane().add(textField_3);
	    
	    textField_4 = new JTextField();
	    textField_4.setColumns(10);
	    textField_4.setBounds(201, 262, 180, 20);
	    getContentPane().add(textField_4);
	    
	    
	    JLabel label_10 = new JLabel("Руб.");
	    label_10.setBounds(317, 191, 46, 14);
	    getContentPane().add(label_10);
	}
}

