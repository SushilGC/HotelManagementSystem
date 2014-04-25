/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reusableClass;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import database.DBConnect;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;

/**
 *
 * @author SUSHIL
 */
public class Function  {
    public static final String SUN_JAVA_COMMAND = "sun.java.command";
      public static void AddSelectInCombo(JComboBox jc){
      jc.insertItemAt("SELECT", 0);
      jc.setSelectedIndex(0);
    }
     public static String[] returnSecondColumn(Object data[][]){
       String[] strName = new String[data.length];
    
       for(int i =0;i<data.length; i++){
         // System.out.println(data[i][1]);
           strName[i] = data[i][1].toString();
           
       }
     
       
       
       return strName;
   }
      public static Date returnSystemDate(){
             PreparedStatement stmtset;
    ResultSet rs;
    Date date = null;
    boolean open = false;
    boolean close = false;
    int id = 0;
   
    String strget = "select system_date_id,date from system_date where  system_date_id = (select max(system_date_id) from system_date)";
//    String stropen = "UPDATE system_date SET open_status = 1 where system_date_id = ?";
    DBConnect db =  new DBConnect();
    try{
       
       db.initConnection();
//        conn.setAutoCommit(false);
        stmtset = db.conn.prepareStatement(strget);
        rs = stmtset.executeQuery();
        while(rs.next()){
        
         date = rs.getDate("date");
//           System.out.println(id);
           
        }
    
      
    }
    catch(SQLException se){
        JOptionPane.showMessageDialog(null, se+"from returnSystemDate"/*+getClass().getName()*/);
       
    }
    finally{
        db.closeConnection();
    }
    return date;
        }
      public static boolean checkSystemDateExist(){
    PreparedStatement stmtdate;
    ResultSet rsdate;
     int rows =0;
     DBConnect db =  new DBConnect();
    try{
        db.initConnection();
        stmtdate = db.conn.prepareStatement("SELECT system_date_id FROM system_date",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        rsdate= stmtdate.executeQuery();
        rsdate.last();
       rows = rsdate.getRow();
        rsdate.beforeFirst();
       
    }
    catch(SQLException se){
        JOptionPane.showMessageDialog(null, "From checkSystemDateExist:");
    }
    finally{
        db.closeConnection();
    }
     return rows != 0;
}
      //this return the object of the department that particulat use will hold
      public static Object[][] getRespectiveDepartment(int userid){
    PreparedStatement stmt = null;
      ResultSet rs;
      ArrayList<Object[]> data = new ArrayList<>();
      DBConnect db = new DBConnect();
      try{
          db.initConnection();
          stmt = db.conn.prepareStatement("SELECT department_info.department_id,department_info.department_name from department_user INNER JOIN department_info ON department_user.department_id = department_info.department_id WHERE user_id = ?");
         stmt.setInt(1, userid);
          rs = stmt.executeQuery();
          while(rs.next()){
         Object[] row = new Object[]{rs.getObject(1),rs.getObject(2)};
         data.add(row);
           
          }
          
      }
      catch(SQLException se ){
          JOptionPane.showMessageDialog(null, se+"from getRespectiveDepartment "+Function.class.getClass().getName());
      }
      finally{
          db.closeConnection();
      }
      return data.toArray(new Object[data.size()][]);
  }
       public static int returnCurrentItentityBillId(String tablename){
     //Boolean ExistingStatus = null; 
        int id = 0;
        int em =0;
        String TableName = tablename;
        String strempty = "SELECT  autoinc_billid as id FROM generate_billid WHERE bill_status = 0  LIMIT 1  ";
    String strCheck = "INSERT INTO  generate_billid (bill_status)   VALUES(1) ";
//    String strGetId = " SELECT @@IDENTITY as id";
    String strGetId = " SELECT last_insert_id()";
    DBConnect check = new DBConnect();
    PreparedStatement stmtcheck ;
    try{
        check.initConnection();
       check.conn.setAutoCommit(false);
        stmtcheck = check.conn.prepareStatement(strempty);
        ResultSet rse = stmtcheck.executeQuery();
       while(rse.next()){
           em = rse.getInt("id");
//           System.out.println(em);
//           break;
       }
       if(em != 0 ){
           id = em;
//           System.out.println("wala");
            check.conn.setAutoCommit(false);
           stmtcheck = check.conn.prepareStatement("UPDATE generate_billid SET bill_status = 1 WHERE autoinc_billid = ?");
           stmtcheck.setInt(1, id);
          stmtcheck.executeUpdate();
//          System.out.println(id);
       }
       else{
            check.conn.setAutoCommit(false);
        stmtcheck = check.conn.prepareStatement(strCheck);
        stmtcheck.executeUpdate();
         check.conn.setAutoCommit(false);
        stmtcheck = check.conn.prepareStatement(strGetId);
//     stmtcheck.setString(1, oid);
        ResultSet rs = stmtcheck.executeQuery();
        while(rs.next()){
        id = rs.getInt(1);
//        System.out.println("wala"+id);
        }
       }
       check.conn.commit();
        
       
        
        
    }
    catch(SQLException se){
        JOptionPane.showMessageDialog(null, se+"from returncurrentIdentityid");
    }
   
    finally{
        check.closeConnection();
    }
    return id;
    
}
       public  static void MakeCurrentItentityIdFalse(int orderid){
     //Boolean ExistingStatus = null; 
        
        int oid = orderid;
        String strempty = "UPDATE  generate_billid SET  bill_status = 0 WHERE autoinc_billid = ?   ";
   
    DBConnect check = new DBConnect();
    PreparedStatement stmtcheck ;
    try{
        check.initConnection();
      
        stmtcheck = check.conn.prepareStatement(strempty);
        stmtcheck.setInt(1, oid);
       stmtcheck.executeUpdate();
      
     
     
        
       
        
        
    }
    catch(SQLException se){
        JOptionPane.showMessageDialog(null, se+"from MakecurrentIdentityidFalse");
    }
    finally{
        check.closeConnection();
    }
   
    
}
       
       public static final class SetTextFieldFocusListener implements FocusListener{
      JTextField jf;
        public SetTextFieldFocusListener(JTextField field){
         jf = field;   
        }

        @Override
        public void focusGained(FocusEvent e) {
         //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       SwingUtilities.invokeLater(new Runnable(){

             @Override
             public void run() {
           jf.setBackground(new Color(136,249,168));
            jf.selectAll();
             }
             
         });
        }

        @Override
        public void focusLost(FocusEvent e) {
        //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      
       SwingUtilities.invokeLater(new Runnable(){

             @Override
             public void run() {
           jf.setBackground(Color.white);
             }
             
         });
        }
        
    }
       public static final class SetJFormattedTextFieldFocusListener implements FocusListener{
      JFormattedTextField jf;
        public SetJFormattedTextFieldFocusListener(JFormattedTextField field){
         jf = field;   
        }

        @Override
        public void focusGained(FocusEvent e) {
         //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         SwingUtilities.invokeLater(new Runnable(){

             @Override
             public void run() {
           jf.setBackground(new Color(136,249,168));
          jf.selectAll();
             }
             
         });
           
        }

        @Override
        public void focusLost(FocusEvent e) {
        //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       
       SwingUtilities.invokeLater(new Runnable(){

             @Override
             public void run() {
             jf.setBackground(Color.white);    
             }
             
         });
        }
        
    }
        public static final void setButtonForEnter(JButton jb){
         jb.registerKeyboardAction(jb.getActionForKeyStroke(
                                      KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
                                      KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
                                      JComponent.WHEN_FOCUSED);
 
        jb.registerKeyboardAction(jb.getActionForKeyStroke(
                                      KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
                                      KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
                                      JComponent.WHEN_FOCUSED);
        
    }
         public static String[] displayRowValues(int lead,JTable table){
            JTable mtable = table;
             int columns = mtable.getColumnCount();
            String[] st = new String[columns];
            for(int i = 0;i<columns;i++){
                
                Object o = mtable.getValueAt(lead, i);
         
                if(o!= null){
                st[i] = o.toString();
                
             }
             else{
                 st[i] = "";
              //  System.out.println("wala");
             }
           
            }
            return st;
            
        }
         public static void restartApplication(Runnable runBeforeRestart) throws IOException {
	try {
		// java binary
		String java = System.getProperty("java.home") + "/bin/java";
		// vm arguments
		List<String> vmArguments = ManagementFactory.getRuntimeMXBean().getInputArguments();
		StringBuffer vmArgsOneLine = new StringBuffer();
		for (String arg : vmArguments) {
			// if it's the agent argument : we ignore it otherwise the
			// address of the old application and the new one will be in conflict
			if (!arg.contains("-agentlib")) {
				vmArgsOneLine.append(arg);
				vmArgsOneLine.append(" ");
			}
		}
		// init the command to execute, add the vm args
		final StringBuffer cmd = new StringBuffer("\"" + java + "\" " + vmArgsOneLine);

		// program main and program arguments
		String[] mainCommand = System.getProperty(SUN_JAVA_COMMAND).split(" ");
		// program main is a jar
		if (mainCommand[0].endsWith(".jar")) {
			// if it's a jar, add -jar mainJar
			cmd.append("-jar " + new File(mainCommand[0]).getPath());
		} else {
			// else it's a .class, add the classpath and mainClass
			cmd.append("-cp \"" + System.getProperty("java.class.path") + "\" " + mainCommand[0]);
		}
		// finally add program arguments
		for (int i = 1; i < mainCommand.length; i++) {
			cmd.append(" ");
			cmd.append(mainCommand[i]);
		}
		// execute the command in a shutdown hook, to be sure that all the
		// resources have been disposed before restarting the application
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				try {
					Runtime.getRuntime().exec(cmd.toString());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		// execute some custom code before restarting
		if (runBeforeRestart!= null) {
			runBeforeRestart.run();
		}
		// exit
		System.exit(0);
	} catch (Exception e) {
		// something went wrong
		throw new IOException("Error while trying to restart the application", e);
	}
}
         public  static File returnFileFromBufferedImage(File file,BufferedImage buffImage){
        /*
               * path of the image to save
               */
//    File path = file; 
    if(file != null){
            Path path = Paths.get(("resources/images/"+file.getName()));

        try{
        if(file.getName().toLowerCase().endsWith(".png")){
                      // System.out.println("png type"); 

                      ImageIO.write(buffImage,"png",path.toFile());
        }
        else if(file.getName().toLowerCase().endsWith(".jpg")){
           //   System.out.println("jpg type");
            ImageIO.write(buffImage, "jpg", path.toFile());
        }
        else if(file.getName().toLowerCase().endsWith(".gif")){
           //   System.out.println("gif type");
            ImageIO.write(buffImage, "gif", path.toFile());
        }
        }
        catch(IOException ioe){
            JOptionPane.showMessageDialog(null, ioe+"image not saved");
        }
        return path.toFile();
    }
    else{
        return null;
    }
        
    }
         public static void DeleteImage(Path path) {
       Path relative = Paths.get("resources/images/"+path);
       try {
           // relative.resolve(path);
           // System.out.println(relative +"\n"+path);
            Files.delete(relative);
            
        } catch (IOException ex) {
           // Logger.getLogger(MenuEntryModel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex+"Unable to delete file:"+relative);
        }
   }
}
