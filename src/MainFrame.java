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
		StoringPillsPanel spp = new StoringPillsPanels();
		JobDonePanel jdp = new JobDonePanel();
		*/ConnectionPanel cp = new ConnectionPanel();
		//AddPillsPanel app = new AddPillsPanel();
		add(cp);
		//setLayout(new BorderLayout());
		//add(mp,BorderLayout.CENTER);
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
