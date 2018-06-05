package app;
import java.awt.event.*;

public class ButtonListener implements ActionListener{

   private MainFrame frame;
   private MainPanel mp;
   private ConnectionPanel cp;
   private AddPillsPanel app;

   public ButtonListener(MainFrame frame,MainPanel mp,ConnectionPanel cp,AddPillsPanel app){
      this.frame=frame;
      this.mp=mp;
      this.cp=cp;
      this.app=app;
   }
   public void actionPerformed(ActionEvent ev){

      if(ev.getSource()==mp.getParameters()){
         frame.setFrame(mp,cp);
      }
      if(ev.getSource()==cp.getBackButton()){
         frame.setFrame(cp,mp);
      }
      if(ev.getSource()==cp.getConnectButton()){
         frame.setFrame(cp,app);
      }
      if(ev.getSource()==app.getEnd()){
         frame.setFrame(app,mp);
      }
   }
}
