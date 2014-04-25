/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package resturant.waiter;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import reusableClass.Function;

/**
 *
 * @author SUSHIL
 */
public class WaiterView extends javax.swing.JDialog {
    private int WaiterId ;
    private int DesignationId;
    private int StaffDesignationId;
    private ListSelectionModel WaiterListModel ;
    private ListSelectionModel DesignationModel;
    /**
     * Creates new form WiaterView
     */
    public WaiterView(JFrame parent,boolean modal) {
        super(parent,modal);
        initComponents();
        WaiterListModel = tblWaiterInfo.getSelectionModel();
        WaiterListModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        DesignationModel = tblDesignation.getSelectionModel();
        DesignationModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setButtonForEnter(btnAdd);
        setButtonForEnter(btnEdit);
        setButtonForEnter(btnDelete);
        setButtonForEnter(btnCancel);
        //Designation
        setButtonForEnter(btnDesignationAdd);
        setButtonForEnter(btnDesignationEdit);
        setButtonForEnter(btnDesignationDelete);
        setButtonForEnter(btnDesignationCancel);
        txtWaiterAddress.addFocusListener(new Function.SetTextFieldFocusListener(txtWaiterAddress));
        txtWaiterName.addFocusListener(new Function.SetTextFieldFocusListener(txtWaiterName));
        txtWaiterPhone.addFocusListener(new Function.SetTextFieldFocusListener(txtWaiterPhone));
        //desingation
        txtDesignationTitle.addFocusListener(new Function.SetTextFieldFocusListener(txtDesignationTitle));
        txtDescription.addFocusListener(new Function.SetTextFieldFocusListener(txtDescription));
         /*
         * centering the frame
         */
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        TabbedPane = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnDesignationCancel = new javax.swing.JButton();
        txtDesignationTitle = new javax.swing.JTextField();
        btnDesignationDelete = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnDesignationEdit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDesignation = new javax.swing.JTable();
        btnDesignationAdd = new javax.swing.JButton();
        txtDescription = new javax.swing.JTextField();
        CheckBoxWaiter = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        txtWaiterAddress = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        txtWaiterName = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWaiterInfo = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        txtWaiterPhone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ComboDesignationName = new javax.swing.JComboBox();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Waiter Info");

        btnDesignationCancel.setText("Cancel");
        btnDesignationCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesignationCancelActionPerformed(evt);
            }
        });

        txtDesignationTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDesignationTitleActionPerformed(evt);
            }
        });

        btnDesignationDelete.setText("Delete");
        btnDesignationDelete.setEnabled(false);
        btnDesignationDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesignationDeleteActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Designation Title:*");

        btnDesignationEdit.setText("Edit");
        btnDesignationEdit.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Description:");

        tblDesignation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblDesignation);
        tblWaiterInfo.getTableHeader().setReorderingAllowed(false);

        btnDesignationAdd.setText("Add");
        btnDesignationAdd.setPreferredSize(new java.awt.Dimension(30, 23));

        txtDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescriptionActionPerformed(evt);
            }
        });

        CheckBoxWaiter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CheckBoxWaiter.setText("Waiter");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDescription))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDesignationTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(CheckBoxWaiter, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnDesignationAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(btnDesignationEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDesignationDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDesignationCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDesignationAdd, btnDesignationEdit});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDesignationTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CheckBoxWaiter))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDesignationDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDesignationAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDesignationCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnDesignationEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDesignationAdd, btnDesignationEdit});

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 492, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        TabbedPane.addTab("Designation Setup", jPanel2);

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        txtWaiterName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWaiterNameActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText(" Name:*");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Address:");

        btnEdit.setText("Edit");
        btnEdit.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Phone/Mobile:");

        tblWaiterInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblWaiterInfo);
        tblWaiterInfo.getTableHeader().setReorderingAllowed(false);

        btnAdd.setText("Add");
        btnAdd.setPreferredSize(new java.awt.Dimension(30, 23));

        txtWaiterPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWaiterPhoneActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Designation:*");

        ComboDesignationName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEdit)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(ComboDesignationName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtWaiterPhone))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtWaiterName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtWaiterAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdd, btnCancel, btnDelete, btnEdit});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel6});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtWaiterName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(ComboDesignationName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWaiterPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWaiterAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete)
                    .addComponent(btnCancel))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel3, jLabel4});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtWaiterAddress, txtWaiterPhone});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAdd, btnCancel, btnDelete, btnEdit});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel6});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ComboDesignationName, txtWaiterName});

        TabbedPane.addTab("Staff Setup", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtWaiterNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWaiterNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWaiterNameActionPerformed

    private void txtWaiterPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWaiterPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWaiterPhoneActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnDesignationCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesignationCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDesignationCancelActionPerformed

    private void txtDesignationTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDesignationTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDesignationTitleActionPerformed

    private void btnDesignationDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesignationDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDesignationDeleteActionPerformed

    private void txtDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescriptionActionPerformed
    public void setWaiterId(int id){
        WaiterId = id;
    }
    public int getWaiterId(){
        return WaiterId;
    }
    public void setDesignationId(int id){
        DesignationId = id;
    }
    public int getDesignationId(){
        return DesignationId;
    }
      public void setStaffDesignationId(int id){
        StaffDesignationId = id;
    }
    public int getStaffDesignationId(){
        return StaffDesignationId;
    }
    public void setWaiterName(String name){
        txtWaiterName.setText(name);
    }
    public String getWaiterName(){
        return txtWaiterName.getText().trim();
    }
     public void setDesignationTitle(String name){
        txtDesignationTitle.setText(name);
    }
    public String getDesignationTitle(){
        return txtDesignationTitle.getText().trim();
    }
    public void setDescription(String st){
        txtDescription.setText(st);
    }
    public String getDescription(){
        return txtDescription.getText().trim();
    }
    public void setWaiterPhone(String phone){
        txtWaiterPhone.setText(phone);
    }
    public String getWaiterPhone(){
        return txtWaiterPhone.getText().trim();
    }
    public void setWaiterAddress(String add){
        txtWaiterAddress.setText(add);
    }
    public String getWaiterAddress(){
        return txtWaiterAddress.getText().trim();
    }
    public void setComboDepartmentTitle(Object[] obj){
        DefaultComboBoxModel model = new DefaultComboBoxModel(obj);
        ComboDesignationName.setModel(model);
    }
    public void setComboDepartmentTitle(String obj){
        ComboDesignationName.setSelectedItem(obj);
    }
    public String getComboDepartmentTitle(){
        return ComboDesignationName.getSelectedItem().toString();
    }
    public JComboBox returnComboDepartmentTitle(){
        return ComboDesignationName;
    }
    public void refreshJTableWaiterInfo(DefaultTableModel model){
        tblWaiterInfo.setModel(model);
    }
     public void refreshJTableDesignationInfo(DefaultTableModel model){
        tblDesignation.setModel(model);
    }
    public String[] getTableInfo(){
        String[] info = new String[5];
        info[0] = String.valueOf(getWaiterId());
        info[1] = getWaiterName();
        info[2] = getWaiterPhone();
        info[3] = getWaiterAddress();
        info[4] =String.valueOf(getStaffDesignationId());
        return info;
    }
    public String[] getDesignationInfo(){
        String[] info = new String[4];
        info[0] = String.valueOf(getDesignationId());
        info[1] = getDesignationTitle();
        info[2] = getDescription();
        info[3] = String.valueOf(CheckBoxWaiter.isSelected());
        return info;
    }
    public void setDesignationInfo(String[] data){
        setDesignationId(Integer.parseInt(data[0]));
        setDesignationTitle(data[1]);
        setDescription(data[2]);
        CheckBoxWaiter.setSelected(Boolean.parseBoolean(data[3]));
    }
    public void setTableInfo(String[] data){
        setWaiterId(Integer.parseInt(data[0]));
        setWaiterName(data[1]);
        setWaiterPhone(data[2]);
        setWaiterAddress(data[3]);
        setComboDepartmentTitle(data[4]);
    }
    public void clearAllWaiterInfo(){
       setWaiterId(0);
        setWaiterName("");
        setWaiterPhone("");
        setWaiterAddress("");
        ComboDesignationName.setSelectedIndex(0);
    }
    public void clearAllDesignationInfo(){
        setDesignationId(0);
        setDesignationTitle("");
        setDescription("");
    }
    public void addAddWaiterListener(ActionListener ListenForAdd){
        btnAdd.addActionListener(ListenForAdd);
    }
    public void addEditWaiterListener(ActionListener ListenForEdit){
        btnEdit.addActionListener(ListenForEdit);
    }
    public void addDeleteWaiterListener(ActionListener ListenForDelete){
        btnDelete.addActionListener(ListenForDelete);
    }
    public void addCancelWaiterListener(ActionListener ListenForCancel){
        btnCancel.addActionListener(ListenForCancel);
    }
    public void addListSelectionListener(ListSelectionListener ListenForSelect){
        WaiterListModel.addListSelectionListener(ListenForSelect);
    }
    public void addComboDesignationListener(ActionListener Listen){
        ComboDesignationName.addActionListener(Listen);
    }
    //designation add listener
    public void addAddDesignationListener(ActionListener listen){
        btnDesignationAdd.addActionListener(listen);
    }
    public void addEditDesignationListener(ActionListener listen){
        btnDesignationEdit.addActionListener(listen);
    }
    public void addDeleteDesignationListener(ActionListener Listen){
        btnDesignationDelete.addActionListener(Listen);
    }
    public void addCancelDesignationListener(ActionListener Listen){
        btnDesignationCancel.addActionListener(Listen);
    }
    public void addDesignationListSelectionListener(ListSelectionListener Listen){
        DesignationModel.addListSelectionListener(Listen);
    }
    public void addTabbedPaneListener(ChangeListener listen){
        TabbedPane.addChangeListener(listen);
    }
    public void setAddVisibleTrue(){
        btnAdd.setEnabled(true);
    }
    public void setAddVisibleFalse(){
        btnAdd.setEnabled(false);
    }
    public void setEditVisibleTrue(){
        btnEdit.setEnabled(true);
    }
    public void setEditVisibleFalse(){
        btnEdit.setEnabled(false);
    }
    public void setDeleteVisibleTrue(){
        btnDelete.setEnabled(true);
    }
    public void setDeleteVisibleFalse(){
        btnDelete.setEnabled(false);
    }
    public void setDesignationAdd(boolean bl){
        btnDesignationAdd.setEnabled(bl);
    }
    public void setDesignationEdit(boolean bl){
        btnDesignationEdit.setEnabled(bl);
    }
    public void setDesignationDelete(boolean bl){
        btnDesignationDelete.setEnabled(bl);
    }
     public final void setButtonForEnter(JButton jb){
         jb.registerKeyboardAction(jb.getActionForKeyStroke(
                                      KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
                                      KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
                                      JComponent.WHEN_FOCUSED);
 
        jb.registerKeyboardAction(jb.getActionForKeyStroke(
                                      KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
                                      KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
                                      JComponent.WHEN_FOCUSED);
        
    }
     
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(WaiterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(WaiterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(WaiterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(WaiterView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new WaiterView(new JFrame(),true).setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBoxWaiter;
    private javax.swing.JComboBox ComboDesignationName;
    public javax.swing.JTabbedPane TabbedPane;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDesignationAdd;
    private javax.swing.JButton btnDesignationCancel;
    private javax.swing.JButton btnDesignationDelete;
    private javax.swing.JButton btnDesignationEdit;
    private javax.swing.JButton btnEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable tblDesignation;
    public javax.swing.JTable tblWaiterInfo;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtDesignationTitle;
    private javax.swing.JTextField txtWaiterAddress;
    private javax.swing.JTextField txtWaiterName;
    private javax.swing.JTextField txtWaiterPhone;
    // End of variables declaration//GEN-END:variables
}
