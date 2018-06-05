package app;

import java.awt.*;
import java.io.*;
import javax.swing.*;

public class ConnectionPanel extends JPanel {
	private JLabel title;
	private JPasswordField text;
	private JButton connect;
	private JButton back;

	public ConnectionPanel() {
		initComponents();
	}

	public void initComponents() {
		title = new JLabel("Paramètres");
		text = new JPasswordField("xxxxxx");
		connect = new JButton("Se connecter");
		back = new JButton("Retour au menu");
		setLayout(new GridLayout(4,1));
		add(title);
		add(text);
		add(connect);
		add(back);
		
		
	}
	
	public JButton getConnectButton() {
		return this.connect;
	}
	
	public JButton getBackButton() {
		return this.back;
	}
}