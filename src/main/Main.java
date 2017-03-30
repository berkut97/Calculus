package main;

import javax.swing.*;
import main.FormManager;

public  class Main implements FormManager {
	private JFrame escobar;
	private JFrame client;
	private JFrame creditor;
	private JFrame password;
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
	        @Override
	        public void run() {
	            new Main();
	        }
	    });
	}
	public Main() {
	    escobar = new form.Escobar(this);
	    client = new form.client.Client(this);
	    creditor = new form.creditor.Creditor(this);
	    password = new main.Password(this);
	    escobar.setVisible(true);
	}

	@Override
	public void toggleForms() {
		// TODO Auto-generated method stub
		escobar.setVisible(!escobar.isVisible());
		client.setVisible(!client.isVisible());
	}
	public void toggleForms1() {
		// TODO Auto-generated method stub
		escobar.setVisible(!escobar.isVisible());
		creditor.setVisible(!creditor.isVisible());
		password.setVisible(!password.isVisible());
	}
	public void toggleForms2() {
		// TODO Auto-generated method stub
		password.setVisible(!password.isVisible());
	}
}
