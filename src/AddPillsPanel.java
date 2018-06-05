package app;

import java.util.*;
import javax.swing.*;
import java.awt.*;

public class AddPillsPanel extends JPanel {

	private JComboBox<String> med;
	private JCheckBox lundi;
	private JCheckBox mardi;
	private JCheckBox mercredi;
	private JCheckBox jeudi;
	private JCheckBox vendredi;
	private JCheckBox samedi;
	private JCheckBox dimanche;
	private JCheckBox matin;
	private JCheckBox midi;
	private JCheckBox soir;
	private JCheckBox coucher;
	private JButton add;
	private JButton end;
	private final String[] LISTE_MED={"Xanax","Doliprane"};
	private JPanel buttons;
	private JPanel comboBox;
	private JPanel days;
	private JPanel time;


	public AddPillsPanel() {
		this.lundi=new JCheckBox("Lundi");
		this.mardi=new JCheckBox("Mardi");
		this.mercredi=new JCheckBox("Mercredi");
		this.jeudi=new JCheckBox("Jeudi");
		this.vendredi=new JCheckBox("Vendredi");
		this.samedi=new JCheckBox("Samedi");
		this.dimanche=new JCheckBox("Dimanche");
		this.matin=new JCheckBox("Matin");
		this.midi=new JCheckBox("Midi");
		this.soir=new JCheckBox("Soir");
		this.coucher=new JCheckBox("Coucher");
		this.add=new JButton("Ajouter");
		this.end=new JButton("Terminer");
		this.med=new JComboBox<String>(this.LISTE_MED);

		this.buttons=new JPanel();
		this.buttons.setLayout(new FlowLayout());
		this.buttons.add(add);
		this.buttons.add(end);

		this.comboBox=new JPanel();
		this.comboBox.setLayout(new FlowLayout());
		this.comboBox.add(this.med);

		this.days=new JPanel();
		this.days.setLayout(new FlowLayout());
		this.days.add(this.lundi);
		this.days.add(this.mardi);
		this.days.add(this.mercredi);
		this.days.add(this.jeudi);
		this.days.add(this.vendredi);
		this.days.add(this.samedi);
		this.days.add(this.dimanche);

		this.time=new JPanel();
		this.time.setLayout(new FlowLayout());
		this.time.add(matin);
		this.time.add(midi);
		this.time.add(soir);
		this.time.add(coucher);

		setLayout(new GridLayout(4,1));
		add(this.comboBox);
		add(this.days);
		add(this.time);
		add(this.buttons);


	}
	public JButton getEnd(){
		return this.end;
	}
}
