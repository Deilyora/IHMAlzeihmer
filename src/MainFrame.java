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
		//MainPanel mp = new MainPanel();
		/*
		LocationPanel lp = new LocationPanel();
		FindingPillsPanel fpp = new FindingPillsPanel();
		PillBoxPanel pbp = new PillBoxPanel();
<<<<<<< HEAD
		StoringPillsPanel = new StoringPillsPanels();
		JobDonePanel = new JobDonePanel();
		ConnectionPanel = new ConnectionPanel();
		*/
		AddPillsPanel app= new AddPillsPanel();

		setLayout(new BorderLayout());
		add(app,BorderLayout.CENTER);
=======
		StoringPillsPanel spp = new StoringPillsPanels();
		JobDonePanel jdp = new JobDonePanel();
		*/ConnectionPanel cp = new ConnectionPanel();
		//AddPillsPanel app = new AddPillsPanel();
		add(cp);
		//setLayout(new BorderLayout());
		//add(mp,BorderLayout.CENTER);
>>>>>>> a46afe9ca769d4b1a5fcfede296a36944064d523
		pack();
	}


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainFrame().setVisible(true);
			}
		});
	}

}
