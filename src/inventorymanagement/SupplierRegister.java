/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SupplierRegister.java
 *
 * Created on Jun 24, 2015, 11:16:56 PM
 */
package inventorymanagement;

import BusinessLayer.SupplierBl;
import ObjectFactory.SupplierOF;
import javax.swing.JOptionPane;

/**
 *
 * @author chhabi
 */
public class SupplierRegister extends javax.swing.JInternalFrame {

    /** Creates new form SupplierRegister */
    public SupplierRegister() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSupplierName = new javax.swing.JTextField();
        txtSupplierPhone = new javax.swing.JTextField();
        txtSupplierAddress = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSupplierDetail = new javax.swing.JTextArea();
        btnSupplierRegister = new javax.swing.JButton();
        btnSupplierReset = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Supplier Register Form");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Register New Supplier");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Name : ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Phone Number : ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Address : ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Details : ");

        txtSupplierDetail.setColumns(20);
        txtSupplierDetail.setRows(5);
        jScrollPane1.setViewportView(txtSupplierDetail);

        btnSupplierRegister.setText("Register");
        btnSupplierRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplierRegisterActionPerformed(evt);
            }
        });

        btnSupplierReset.setText("Reset");
        btnSupplierReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplierResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(txtSupplierAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(txtSupplierPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(txtSupplierName, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSupplierRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSupplierReset, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSupplierPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSupplierAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSupplierRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSupplierReset, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void btnSupplierRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplierRegisterActionPerformed
// TODO add your handling code here:
    try{
      String errorMsg = "";
        if("".equals(txtSupplierName.getText())){
          errorMsg += "Supplier Name cannot be empty \n";
        }
        if("".equals(txtSupplierPhone.getText())){
          errorMsg +=  "Supplier Phone cannot be empty \n";
        }
        else{
            Validation v = new Validation();
            
            if (!v.checkValidation("text", txtSupplierName.getText()))
                errorMsg += "Supplier Name supports only numbers \n";   
            
            if (!v.checkValidation("phone", txtSupplierPhone.getText()))
                errorMsg += "Phone number like xxx-xxxxxx \n";   
                                  
        }
      if(errorMsg.isEmpty()){  
        
        supplier = new SupplierOF();
        supplier.setSupplier_id(0);
        supplier.setSupplier_name(txtSupplierName.getText());
        supplier.setSupplier_phone(txtSupplierPhone.getText());
        supplier.setSupplier_address(txtSupplierAddress.getText());
        supplier.setSupplier_detail(txtSupplierDetail.getText());
        blsupplier = new SupplierBl(supplier);
        if(blsupplier.insertsupplier()){
          JOptionPane.showMessageDialog(this, "Supplier Created Successfully", "Operation Successful", JOptionPane.INFORMATION_MESSAGE);
        }else{
          JOptionPane.showMessageDialog(this, "Unable to add Supplier", "Error Occured", JOptionPane.ERROR_MESSAGE);
        }
      }else{
          JOptionPane.showMessageDialog(this, errorMsg, "Error Occured", JOptionPane.ERROR_MESSAGE);
      }      
    }catch(Exception ex){
      JOptionPane.showMessageDialog(this, ex.getMessage(), "Error Occured", JOptionPane.ERROR_MESSAGE);
    }
}//GEN-LAST:event_btnSupplierRegisterActionPerformed

private void btnSupplierResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplierResetActionPerformed
// TODO add your handling code here:
    txtSupplierName.setText("");
    txtSupplierPhone.setText("");
    txtSupplierAddress.setText("");
    txtSupplierDetail.setText("");
}//GEN-LAST:event_btnSupplierResetActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSupplierRegister;
    private javax.swing.JButton btnSupplierReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtSupplierAddress;
    private javax.swing.JTextArea txtSupplierDetail;
    private javax.swing.JTextField txtSupplierName;
    private javax.swing.JTextField txtSupplierPhone;
    // End of variables declaration//GEN-END:variables
    private SupplierBl blsupplier;
    private SupplierOF supplier;
    
    // Imput validation for supplier phone
  public boolean isNumber(String n) {
        try {
                Integer.parseInt(n);
                return true;
        } catch (NumberFormatException nfe) {
                return false;
        }
    }
}
