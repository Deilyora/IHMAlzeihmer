package app;
import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel{

   private JButton find;
   private JButton sort;
   private JButton parameters;
   private JLabel title;
   private JPanel bottom;
   private JPanel top;
   private JPanel param;
   private JPanel tit;

   public MainPanel(){
      title=new JLabel("PILLS FINDER");
      find=new JButton("Trouver les médicaments");
      sort=new JButton("Répartir les médicaments");
      parameters=new JButton("Paramètres");

      bottom=new JPanel();
      bottom.setLayout(new FlowLayout());
      bottom.add(find);
      bottom.add(sort);

      param=new JPanel();
      param.setLayout(new BorderLayout());
      param.add(parameters,BorderLayout.EAST);

      tit=new JPanel();
      tit.setLayout(new FlowLayout());
      tit.add(title);

      top=new JPanel();
      top.setLayout(new BorderLayout());
      top.add(tit,BorderLayout.CENTER);
      top.add(param,BorderLayout.NORTH);

      setLayout(new GridLayout(2,1));
      add(top);
      add(bottom);

   }

   public JButton getParameters(){
      return this.parameters; 
   }

}
