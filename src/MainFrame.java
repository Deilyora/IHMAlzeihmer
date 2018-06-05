package app;

import java.awt.*;
import java.io.*;
import javax.swing.*;

public class MainFrame extends JFrame {

	public MainFrame() {
		initComponents();
	}

	public void initComponents() {
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("PILLS FINDER");
		MainPanel mp = new MainPanel();
		ConnectionPanel cp = new ConnectionPanel();
		AddPillsPanel app = new AddPillsPanel();
		ButtonListener b= new ButtonListener(this,mp,cp,app);
		mp.getParameters().addActionListener(b);
		cp.getBackButton().addActionListener(b);
		cp.getConnectButton().addActionListener(b);
		app.getEnd().addActionListener(b);
		setLayout(new BorderLayout());
		add(mp,BorderLayout.CENTER);
		pack();
	}


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainFrame().setVisible(true);
			}
		});
	}

	public void setFrame(JPanel oldPanel,JPanel newPanel){
		remove(oldPanel);
		add(newPanel,BorderLayout.CENTER);
		revalidate();
		pack();
	}

}
