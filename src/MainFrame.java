package app;

import java.awt.*;
import java.io.*;

public class MainFrame extends JFrame {
	
	public MainFrame() {
		initComponents();
	}
	
	public void initComponents() {
		setDefaultCloseOperation(java.swing.WindowsConstants.EXIT_ON_CLOSE);
		setTitle("PILLS FINDER");
		MainPanel mp = new MainPanel();
		LocationPanel lp = new LocationPanel();
		FindingPillsPanel fpp = new FindingPillsPanel();
		PillBoxPanel pbp = new PillBoxPanel();
		StoringPillsPanel = new StoringPillsPanels();
		JobDonePanel = new JobDonePanel();
		ConnectionPanel = new ConnectionPanel();
		AddPillsPanel = new AddPillsPanel();
	}
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainFrame().setVisible(true);
			}
		}
	}
	
}