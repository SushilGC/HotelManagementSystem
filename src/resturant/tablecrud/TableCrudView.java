/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package resturant.tablecrud;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemListener;
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

/**
 *
 * @author SUSHIL
 */
public class TableCrudView extends javax.swing.JDialog {
    private  int TableGroupId ;
    private int TableId;
    private DefaultComboBoxModel modelTableGroup;
    private final ListSelectionModel selectionModelTableGroup;
    private final ListSelectionModel selectionModelTable;

    /**
     * Creates new form TableCrudView
     * @param parent
     * @param modal
     */
    public TableCrudView(JFrame parent,boolean modal) {
        super(parent,modal);
        
        initComponents();
        selectionModelTableGroup = tblGroupTable.getSelectionModel();
        selectionModelTableGroup.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        selectionModelTable = tblTable.getSelectionModel();
        selectionModelTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        setButtonForEnter(btnTableAdd);
        setButtonForEnter(btnTableCancel);
        setButtonForEnter(btnTableEdit);
        setButtonForEnter(btnTableDelete);
        setButtonForEnter(btnTableGroupAdd);
        setButtonForEnter(btnTableGroupCancel);
        setButtonForEnter(btnTableGroupDelete);
        setButtonForEnter(btnTableGroupEdit);
        setButtonForEnter(btnTableSearch);
        txtTableGroupName.addFocusListener(new SetFocusListener(txtTableGroupName));
        txtTableGroupRate.addFocusListener(new SetFocusListener(txtTableGroupRate));
        txtTableName.addFocusListener(new SetFocusListener(txtTableName));
        txtTableSearch.addFocusListener(new SetFocusListener(txtTableSearch));
         /*
         * centering the frame
         */
        setLocationRelativeTo(null);
        jLabel2.setVisible(false);
        txtTableGroupRate.setVisible(false);
        checkboxRate.setVisible(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TabbedPanel = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        checkboxRate = new javax.swing.JCheckBox();
        txtTableGroupName = new javax.swing.JTextField();
        txtTableGroupRate = new javax.swing.JTextField();
        btnTableGroupAdd = new javax.swing.JButton();
        btnTableGroupCancel = new javax.swing.JButton();
        btnTableGroupEdit = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGroupTable = new javax.swing.JTable();
        btnTableGroupDelete = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtTableName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        comboTableGroup = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        checkboxTableAvailability = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        txtTableSearch = new javax.swing.JTextField();
        btnTableSearch = new javax.swing.JButton();
        btnTableAdd = new javax.swing.JButton();
        btnTableEdit = new javax.swing.JButton();
        btnTableCancel = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTable = new javax.swing.JTable();
        btnTableDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Table Crud Window");

        TabbedPanel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TabbedPanel.setName("Category Setup"); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Table Group"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Table Group Name:*");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Rate:");

        checkboxRate.setSelected(true);
        checkboxRate.setText("check");
        checkboxRate.setActionCommand("checkboxRate");

        txtTableGroupRate.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(checkboxRate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTableGroupRate, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTableGroupName, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTableGroupName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTableGroupRate, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(checkboxRate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );

        btnTableGroupAdd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTableGroupAdd.setMnemonic('A');
        btnTableGroupAdd.setText("Add");
        btnTableGroupAdd.setActionCommand("TableGroupAdd");

        btnTableGroupCancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTableGroupCancel.setMnemonic('C');
        btnTableGroupCancel.setText("Cancel");
        btnTableGroupCancel.setActionCommand("TableGroupCancel");

        btnTableGroupEdit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTableGroupEdit.setMnemonic('E');
        btnTableGroupEdit.setText("Edit");
        btnTableGroupEdit.setActionCommand("TableGroupEdit");
        btnTableGroupEdit.setEnabled(false);
        btnTableGroupEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTableGroupEditActionPerformed(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Table Group Info"));

        tblGroupTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblGroupTable);
        tblGroupTable.getTableHeader().setReorderingAllowed(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnTableGroupDelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTableGroupDelete.setMnemonic('D');
        btnTableGroupDelete.setText("Delete");
        btnTableGroupDelete.setActionCommand("TableGroupDelete");
        btnTableGroupDelete.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTableGroupAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTableGroupEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnTableGroupDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTableGroupCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTableGroupDelete)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnTableGroupAdd)
                        .addComponent(btnTableGroupCancel)
                        .addComponent(btnTableGroupEdit)))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        TabbedPanel.addTab("Group Setup", jPanel1);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Table CRUD"));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Table Name:*");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Table Group:*");

        comboTableGroup.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboTableGroup.setActionCommand("comboTableGroupName");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Availability:");

        checkboxTableAvailability.setSelected(true);
        checkboxTableAvailability.setText("Unclick it If  Table not Available");
        checkboxTableAvailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxTableAvailabilityActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 255));
        jLabel6.setText("Search for Table");

        btnTableSearch.setText("Search");
        btnTableSearch.setActionCommand("TableSearch");
        btnTableSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTableSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(75, 75, 75)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTableName)
                            .addComponent(comboTableGroup, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(checkboxTableAvailability, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTableSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTableSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTableSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTableSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTableName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboTableGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkboxTableAvailability))
                .addContainerGap())
        );

        btnTableAdd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTableAdd.setMnemonic('A');
        btnTableAdd.setText("Add");
        btnTableAdd.setActionCommand("TableAdd");

        btnTableEdit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTableEdit.setMnemonic('E');
        btnTableEdit.setText("Edit");
        btnTableEdit.setActionCommand("TableEdit");
        btnTableEdit.setEnabled(false);
        btnTableEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTableEditActionPerformed(evt);
            }
        });

        btnTableCancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTableCancel.setMnemonic('C');
        btnTableCancel.setText("Cancel");
        btnTableCancel.setActionCommand("TableCancel");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Table Info"));

        tblTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblTable);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnTableDelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnTableDelete.setMnemonic('D');
        btnTableDelete.setText("Delete");
        btnTableDelete.setActionCommand("TableDelete");
        btnTableDelete.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnTableAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTableEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTableDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTableCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTableAdd)
                    .addComponent(btnTableCancel)
                    .addComponent(btnTableEdit)
                    .addComponent(btnTableDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TabbedPanel.addTab("Individuall setup", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TabbedPanel)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TabbedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTableGroupEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTableGroupEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTableGroupEditActionPerformed

    private void btnTableEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTableEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTableEditActionPerformed

    private void checkboxTableAvailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxTableAvailabilityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkboxTableAvailabilityActionPerformed

    private void btnTableSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTableSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTableSearchActionPerformed
    //
    //TabbedPanel.addTab("Category Setup",);
    public void setTableGroupName(String name){
        txtTableGroupName.setText(name);
    }
    public String getTableGroupName(){
        return txtTableGroupName.getText();
    }
    public void setTableGroupRate(String rate){
        txtTableGroupRate.setText(rate);
    }
    public String getTableGroupRate(){
         return txtTableGroupRate.getText();
    }
    public int getTableGroupId(){
        return TableGroupId;
    }
    public void setTableGroupId(int id){
        TableGroupId = id;
    }
    public void setTableId(int id){
        TableId = id;
    }
    public int getTableId(){
        return TableId;
    }
    public void setTableName(String name){
        txtTableName.setText(name);
    }
    public String getTableName(){
        return txtTableName.getText();
    }
    public void setComboTableGroup(String[] group){
            modelTableGroup = new DefaultComboBoxModel(group);
            comboTableGroup.setModel(modelTableGroup);
    }
    public void setComboTableGroup(String item){
        comboTableGroup.setSelectedItem(item);
    }
    public String getComboTableGroup(){
        return comboTableGroup.getSelectedItem().toString();
    }
    public void setTableSearch(String st){
        txtTableSearch.setText(st);
    }
    public String getTableSearch(){
         return txtTableSearch.getText();
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
    public void addTableGroupAddListener(ActionListener ListenForAdd){
        btnTableGroupAdd.addActionListener(ListenForAdd);
    }
    public void addTableGroupEditListener(ActionListener ListenForEdit){
        btnTableGroupEdit.addActionListener(ListenForEdit);
    }
    public void addTableGroupCancelListener(ActionListener ListenForCancel){
        btnTableGroupCancel.addActionListener(ListenForCancel);
    }
    public void addTableGroupDeleteListener(ActionListener ListenForCancel){
        btnTableGroupDelete.addActionListener(ListenForCancel);
    }
    public void addTableAddListener(ActionListener ListenForAdd){
        btnTableAdd.addActionListener(ListenForAdd);
    }
    public void addTableEditListener(ActionListener ListenForEdit){
        btnTableEdit.addActionListener(ListenForEdit);
    }
    public void addTableCancelListener(ActionListener ListenForCancel){
        btnTableCancel.addActionListener(ListenForCancel);
    }
     public void addTableDeleteListener(ActionListener ListenForCancel){
        btnTableDelete.addActionListener(ListenForCancel);
    }
    public void addCheckBoxRateListener(ActionListener ListenForCheck){
        checkboxRate.addActionListener(ListenForCheck);
    }
     public void addCheckBoxRateListener(ItemListener ListenForCheck){
        checkboxRate.addItemListener(ListenForCheck);
    }
    public void addTableGroupListSelectionListener(ListSelectionListener ListenForList){
        selectionModelTableGroup.addListSelectionListener(ListenForList);
    }
    public void addTableListSelectionListener(ListSelectionListener ListenForList){
        selectionModelTable.addListSelectionListener(ListenForList);
    }
    public void addTabbedPaneChangeListener(ChangeListener ListenForChange){
        TabbedPanel.addChangeListener(ListenForChange);
    }
    public void addComboTableGroupListener(ActionListener ListenForClick){
        comboTableGroup.addActionListener(ListenForClick);
    }
    public void addTableSearchListener(ActionListener ListenForSearch){
        btnTableSearch.addActionListener(ListenForSearch);
    }
    public void addTextTableSearchListener(ActionListener ListenForSearch){
        txtTableSearch.addActionListener(ListenForSearch);
    }
    public void setTableGroupRateEditableTrue(){
    txtTableGroupRate.setEditable(true);
}
    public void setTableGroupRateEditableFalse(){
        txtTableGroupRate.setEditable(false);
    }
    public void setSearchEditableTrue(){
    txtTableSearch.setEditable(true);
}
    public void setSearchEditableFalse(){
        txtTableSearch.setEditable(false);
    }
    public  void checkedTableGroupRate(){
        checkboxRate.setSelected(true);
    }
    public void uncheckedTableGroupRate(){
        checkboxRate.setSelected(false);
    }
     public  void checkedTableAvailability(){
        checkboxTableAvailability.setSelected(true);
    }
    public void uncheckedTableAvailability(){
        checkboxTableAvailability.setSelected(false);
    }
     public  boolean RateStatus(){
        return checkboxRate.isSelected();
        
    }
     public  boolean TableAvailabilityStatus(){
        return checkboxTableAvailability.isSelected();
        
    }
     public String[] getTableGroup(){
         String info[] = new String[3];
         info[0] = String.valueOf(getTableGroupId());
         info[1] = getTableGroupName();
//        if(RateStatus()){
//             info[2] = "";
//         }
//         else{
//        
//         info[2] = getTableGroupRate();
//                 }
         return info;
     }
     public void setTableGroup(String[] data){
         setTableGroupId(Integer.parseInt(data[0]));
         setTableGroupName(data[1]);
//         if(data[2].isEmpty()){
//           checkedTableGroupRate();
//           setTableGroupRate("");
//           setTableGroupRateEditableFalse();
//         }
//         else{
//         setTableGroupRate(data[2]);
//         uncheckedTableGroupRate();
//         setTableGroupRateEditableTrue();
//         }
     }
     public String[] getTable(){
         String info[] = new String[5];
         info[0] = String.valueOf(getTableId());
         info[1] = getTableName();
         info[2] = String.valueOf(getTableGroupId());
         info[3] = getComboTableGroup();
         info[4] = String.valueOf(TableAvailabilityStatus());
         return info;
     }
     public void setTable(String[] st){
         setTableId(Integer.parseInt(st[0]));
         setTableName(st[1]);
         setComboTableGroup(st[2]);
         if(st[3].equalsIgnoreCase("false")){
             uncheckedTableAvailability();
         }
         else
         {
          checkedTableAvailability();   
         }
        
         
     }
     public void  clearGroupTable(){
         setTableGroupId(0);
         setTableGroupName("");
         setTableGroupRate("");
         
     }
     
     public void clearTable(){
         setTableId(0);
         setTableName("");
          setTableSearch("");
         
         comboTableGroup.setSelectedIndex(0);
     }
    public void enableTableGroupAdd(){
        btnTableGroupAdd.setEnabled(true);
    }
     public void AddSelectInCombo(JComboBox jc){
      jc.insertItemAt("SELECT", 0);
      jc.setSelectedIndex(0);
    }
     public JComboBox returnComboTableGroup(){
         return comboTableGroup;
     }
    
    public void disableTableGroupAdd(){
        btnTableGroupAdd.setEnabled(false);
    }
     public void enableTableSearch(){
        btnTableSearch.setEnabled(true);
    }
    
    public void disableTableSearch(){
        btnTableSearch.setEnabled(false);
    }
    public void enableTableGroupEdit(){
        btnTableGroupEdit.setEnabled(true);
    }
    public void disableTableGroupEdit(){
        btnTableGroupEdit.setEnabled(false);
    }
      public void enableTableGroupDelete(){
        btnTableGroupDelete.setEnabled(true);
    }
        public void disableTableGroupDelete(){
        btnTableGroupDelete.setEnabled(false);
    }
    public void enableTableAdd(){
        btnTableAdd.setEnabled(true);
    }
    public void disableTableAdd(){
        btnTableAdd.setEnabled(false);
    }
    public void enableTableEdit(){
        btnTableEdit.setEnabled(true);
    }
    public void disableTableEdit(){
        btnTableEdit.setEnabled(false);
    }
     public void enableTableDelete(){
        btnTableDelete.setEnabled(true);
    }
    public void disableTableDelete(){
        btnTableDelete.setEnabled(false);
    }
    public void refreshGroupTableJTable(DefaultTableModel model){
        tblGroupTable.setModel(model);
    }
    public void refreshTableJTable(DefaultTableModel model){
        tblTable.setModel(model);
    }
    public void addGroupTableListSelectionListener(ListSelectionListener ListenForSelect){
        selectionModelTableGroup.addListSelectionListener(ListenForSelect);
    }
    
    public final class SetFocusListener implements FocusListener{
      JTextField jf;
        public SetFocusListener(JTextField field){
         jf = field;   
         
         
        }

        @Override
        public void focusGained(FocusEvent e) {
         //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         jf.setBackground(new Color(136,249,168));
         jf.selectAll();
        }

        @Override
        public void focusLost(FocusEvent e) {
        //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       jf.setBackground(Color.white);
        }
        
    }
   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TableCrudView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableCrudView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableCrudView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableCrudView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableCrudView(new JFrame(),true).setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TabbedPanel;
    private javax.swing.JButton btnTableAdd;
    private javax.swing.JButton btnTableCancel;
    private javax.swing.JButton btnTableDelete;
    private javax.swing.JButton btnTableEdit;
    private javax.swing.JButton btnTableGroupAdd;
    private javax.swing.JButton btnTableGroupCancel;
    private javax.swing.JButton btnTableGroupDelete;
    private javax.swing.JButton btnTableGroupEdit;
    private javax.swing.JButton btnTableSearch;
    private javax.swing.JCheckBox checkboxRate;
    private javax.swing.JCheckBox checkboxTableAvailability;
    private javax.swing.JComboBox comboTableGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable tblGroupTable;
    public javax.swing.JTable tblTable;
    private javax.swing.JTextField txtTableGroupName;
    private javax.swing.JTextField txtTableGroupRate;
    private javax.swing.JTextField txtTableName;
    private javax.swing.JTextField txtTableSearch;
    // End of variables declaration//GEN-END:variables
}