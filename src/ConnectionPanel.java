package app;

import java.awt.*;
import java.io.*;
import javax.swing

public class ConnectionPanel extends Jpanel {
	private JLabel title;
	private JTextField text;
	private JButton connect;
	private JButton back;
	
	public ConnectionPanel() {
		initComponents();
	}
	
	public void initComponents() {
		title = new JLabel("Paramètres");
		text = new JTextField("Mot de passe");
		connect = new JButton("Se connecter");
		back = new JButton("Retour au menu");
		
		