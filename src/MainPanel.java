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
      param.setLayout(new FlowLayout());
      param.add(parameters);

      top=new JPanel();
      top.setLayout(new BorderLayout());
      top.add(title,BorderLayout.CENTER);
      top.add(param,BorderLayout.NORTH);

      setLayout(new GridLayout(2,1));
      add(top);
      add(bottom);

   }
}
