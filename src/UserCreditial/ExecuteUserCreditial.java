/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserCreditial;

import hotelmanagementsystem.MainFrameView;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author SUSHIL
 */
public class ExecuteUserCreditial {
    public UserCreditialView userCreditialView;
    public UserCreditialModel userCreditialModel;
    public UserCreditialController userCreditialController;
//    public MainFrameView mainview;
    
    public ExecuteUserCreditial(final JFrame parent,final boolean modal, final int userid){
//        this.mainview = mainview;
    
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
              
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           userCreditialView = new UserCreditialView(parent, modal);
           userCreditialModel = new UserCreditialModel();
           userCreditialController = new UserCreditialController(userCreditialModel, userCreditialView,(MainFrameView)parent,userid);
           userCreditialView.setVisible(true);
            }
        });
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new ExecuteUserCreditial(new MainFrameView(), true,0);
    }
    
}
