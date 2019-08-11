/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ReturnList.java
 *
 * Created on Jun 27, 2015, 1:00:07 PM
 */
package inventorymanagement;

import BusinessLayer.ItemBl;
import BusinessLayer.ReturnBl;
import DatabaseLayer.GlobalConnection;
import ObjectFactory.ItemOF;
import ObjectFactory.ReturnOF;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chhabi
 */
public class ReturnList extends javax.swing.JInternalFrame {
    
    GlobalConnection db = new GlobalConnection();
    ArrayList<String> ar = new ArrayList<String>();
    
    /** Creates new form ReturnList */
    public ReturnList(){
        initComponents();
        
        // item name in combo box
        ItemBl it = new ItemBl();
        try{
            ArrayList<ItemOF> itm = it.getItemList();
            for( int i=0; i<itm.size(); ++i){
                cmbItemName.addItem(itm.get(i).getItem_name());
            }
        
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex);
        }
        
        rturn = new ReturnOF();
        blRturn = new ReturnBl();
        DefaultTableModel dtm = new DefaultTableModel();
        
        try{
            dtm.addColumn("Return Id");
            dtm.addColumn("Return Name");
            dtm.addColumn("Return Quantity");            
            dtm.addColumn("Return Date");
            dtm.addColumn("Item Name");
            
            ArrayList<ReturnOF> rturn = blRturn.getRturnList();
            for(int i=0; i<rturn.size(); ++i ){
              Object[] data = { rturn.get(i).getReturn_id(), rturn.get(i).getReturn_name() ,rturn.get(i).getReturn_quantity(), rturn.get(i).getReturn_date(), rturn.get(i).getItem_name() };
              dtm.addRow(data);
            }
            tblReturnList.setModel(dtm);
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex);
        } 
            
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtReturnSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReturnList = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtItemReturnQuantity = new javax.swing.JTextField();
        cmbItemName = new javax.swing.JComboBox();
        txtItemReturnDate = new com.toedter.calendar.JDateChooser();
        btnReturnUpdate = new javax.swing.JButton();
        btnReturnDelete = new javax.swing.JButton();
        btnReturnSearch = new javax.swing.JButton();
        btnSelectedReturn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtReturnId = new javax.swing.JTextField();
        txtReturnName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Return Items List");

        tblReturnList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", ""
            }
        ));
        jScrollPane1.setViewportView(tblReturnList);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Edit Return Item Detail");

        jLabel3.setText("Item Retun Date : ");

        jLabel4.setText("Retun Item Quantity : ");

        jLabel5.setText("Item Name : ");

        txtItemReturnDate.setDateFormatString("yyyy-MM-dd");

        btnReturnUpdate.setText("Update");
        btnReturnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnUpdateActionPerformed(evt);
            }
        });

        btnReturnDelete.setText("Delete");
        btnReturnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnDeleteActionPerformed(evt);
            }
        });

        btnReturnSearch.setText("Search");
        btnReturnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnSearchActionPerformed(evt);
            }
        });

        btnSelectedReturn.setText("Edit Selected Item");
        btnSelectedReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectedReturnActionPerformed(evt);
            }
        });

        jLabel6.setText("Return Id : ");

        txtReturnId.setEditable(false);

        jLabel7.setText("Return Name : ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSelectedReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtReturnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(btnReturnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(91, 91, 91))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnReturnDelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtReturnName)
                                    .addComponent(txtReturnId, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnReturnUpdate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtItemReturnDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbItemName, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtItemReturnQuantity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(55, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtReturnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReturnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSelectedReturn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(11, 11, 11))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtReturnId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtReturnName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(txtItemReturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtItemReturnQuantity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(35, 35, 35)
                        .addComponent(btnReturnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnReturnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void btnSelectedReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectedReturnActionPerformed
// TODO add your handling code here: 
   try{
        String rId    = tblReturnList.getValueAt(tblReturnList.getSelectedRow(), 0).toString();
        String rName  = tblReturnList.getValueAt(tblReturnList.getSelectedRow(), 1).toString();
        String rQty   = tblReturnList.getValueAt(tblReturnList.getSelectedRow(), 2).toString();
        String rDate  = tblReturnList.getValueAt(tblReturnList.getSelectedRow(), 3).toString();
        String itemName  = tblReturnList.getValueAt(tblReturnList.getSelectedRow(), 4).toString();
        
        txtReturnId.setText(rId);
        txtReturnName.setText(rName);
        txtItemReturnQuantity.setText(rQty);
   
        // Date load in edit form
        SimpleDateFormat oFormat = new SimpleDateFormat("yyyy-MM-dd");
        txtItemReturnDate.setDate((Date)oFormat.parse(rDate));
  
        cmbItemName.setSelectedItem(itemName);
    
    }catch(Exception ex){
        JOptionPane.showMessageDialog(this, ex);
    }
        
}//GEN-LAST:event_btnSelectedReturnActionPerformed

private void btnReturnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnUpdateActionPerformed
// TODO add your handling code here:
    try {
       rturn = new ReturnOF();
       rturn.setReturn_id(Integer.parseInt(txtReturnId.getText()));
       rturn.setReturn_name(txtReturnName.getText());
       rturn.setReturn_quantity( Integer.parseInt(txtItemReturnQuantity.getText())); 
       
       Date dtt = txtItemReturnDate.getDate();
       SimpleDateFormat ftt = new SimpleDateFormat("yyyy-MM-dd");
       rturn.setReturn_date(ftt.format(dtt).toString());
       
       rturn.setItem_name(cmbItemName.getSelectedItem().toString());
       
       blRturn = new ReturnBl(rturn);   
       if(blRturn.updateRturn()){
           JOptionPane.showMessageDialog(this, "Return Item Updated Successfully", "Operation Successfull", JOptionPane.INFORMATION_MESSAGE);
           this.dispose();
           DashBoard.dashBoard.add( new CategoryList());
           
            }else{
                JOptionPane.showMessageDialog(this, "Unable to Update Return Item", "Error Occured", JOptionPane.ERROR_MESSAGE);
            }
       
     }catch(Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error Occured", JOptionPane.ERROR_MESSAGE);
     }
    
}//GEN-LAST:event_btnReturnUpdateActionPerformed

private void btnReturnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnDeleteActionPerformed
// TODO add your handling code here:
    try{
        rturn = new ReturnOF();
        rturn.setReturn_id(Integer.parseInt(txtReturnId.getText()));
        blRturn = new ReturnBl(rturn);
        if(blRturn.deleteRturn()){
            JOptionPane.showMessageDialog(this, "Return Item Deleted Successfully", "Operation Successfull", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
            DashBoard.dashBoard.add( new CategoryList());
        }else{
            JOptionPane.showMessageDialog(this, "Unabale to Delete Return Item", "Error Occured", JOptionPane.ERROR_MESSAGE );
        }
    }catch( Exception ex){
        JOptionPane.showMessageDialog(this,ex.getMessage(), "Error Occured", JOptionPane.ERROR_MESSAGE);
    }
}//GEN-LAST:event_btnReturnDeleteActionPerformed

private void btnReturnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnSearchActionPerformed
// TODO add your handling code here:
        try{
            rturn.setReturn_name(txtReturnSearch.getText().toString());
            DefaultTableModel dtm = new DefaultTableModel();
            dtm.addColumn("Return Id");
            dtm.addColumn("Return Name");
            dtm.addColumn("Return Quantity");            
            dtm.addColumn("Return Date");
            dtm.addColumn("Item Name");
           
            blRturn = new ReturnBl(rturn);
            ArrayList<ReturnOF>rturns = blRturn.searchRturn();
                if(rturns.size() > 0){
                    for( int i=0; i<rturns.size(); i++){
                        Object[] data = { rturns.get(i).getReturn_id(), rturns.get(i).getReturn_name() ,rturns.get(i).getReturn_quantity(),rturns.get(i).getReturn_date(),rturns.get(i).getItem_name(),};
                        dtm.addRow(data);                    
                    }
                    tblReturnList.setModel(dtm);
                
                }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex);        
        }
}//GEN-LAST:event_btnReturnSearchActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReturnDelete;
    private javax.swing.JButton btnReturnSearch;
    private javax.swing.JButton btnReturnUpdate;
    private javax.swing.JButton btnSelectedReturn;
    private javax.swing.JComboBox cmbItemName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblReturnList;
    private com.toedter.calendar.JDateChooser txtItemReturnDate;
    private javax.swing.JTextField txtItemReturnQuantity;
    private javax.swing.JTextField txtReturnId;
    private javax.swing.JTextField txtReturnName;
    private javax.swing.JTextField txtReturnSearch;
    // End of variables declaration//GEN-END:variables
    private ReturnOF rturn;
    private ReturnBl blRturn;
}
