/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * DashBoard.java
 *
 * Created on Jun 22, 2015, 11:52:19 PM
 */
package inventorymanagement;

import Object.UserObj;

/**
 *
 * @author Rahat
 */
public class DashBoard extends javax.swing.JFrame {
     private UserObj user;
     
    /** Creates new form DashBoard */
    public DashBoard() {
        initComponents();
        this.user = user;
    }
    
    public UserObj getUser() {
        return user;
    }

    public void setUser(UserObj user) {
        this.user = user;
        String a = "Guest"; // Guest is from dropdown of Combobox
        
        if(this.user.getuserType().equals(a)){
            menuUsers.hide();  // Hide the menuBackup
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

        dashBoard = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuUsers = new javax.swing.JMenu();
        menuInsertUser = new javax.swing.JMenuItem();
        menuUpdateUser = new javax.swing.JMenuItem();
        menuReportUser = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        menuInsertSupplier = new javax.swing.JMenu();
        menuInsertCategory = new javax.swing.JMenuItem();
        menuSupplierInsert = new javax.swing.JMenuItem();
        menuItemReg = new javax.swing.JMenuItem();
        menuSalesInsert = new javax.swing.JMenuItem();
        menuReturnInsert = new javax.swing.JMenuItem();
        menuDamageInsert = new javax.swing.JMenuItem();
        menuUpdate = new javax.swing.JMenu();
        menuUpdateCategory = new javax.swing.JMenuItem();
        menuUpdateSupplier = new javax.swing.JMenuItem();
        menuItemUpdate = new javax.swing.JMenuItem();
        menuSalesUpdate = new javax.swing.JMenuItem();
        menuReturnUpdate = new javax.swing.JMenuItem();
        menuDamageUpdate = new javax.swing.JMenuItem();
        menuBackup = new javax.swing.JMenu();
        menuDbBackup = new javax.swing.JMenuItem();
        menuReport = new javax.swing.JMenu();
        menuReportCategory = new javax.swing.JMenuItem();
        menuReportSupplier = new javax.swing.JMenuItem();
        menuViewItem = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuReportDamage = new javax.swing.JMenuItem();
        menuReportReturn = new javax.swing.JMenuItem();
        menuHelp = new javax.swing.JMenu();
        menuLogOut = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inventory Management System");
        setAlwaysOnTop(true);

        dashBoard.setBackground(new java.awt.Color(51, 153, 255));
        dashBoard.setAutoscrolls(true);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jMenuBar1.setAutoscrolls(true);
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuBar1.setMargin(new java.awt.Insets(20, 20, 0, 0));
        jMenuBar1.setOpaque(false);

        menuUsers.setText("Users");
        menuUsers.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        menuInsertUser.setText("Insert");
        menuInsertUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInsertUserActionPerformed(evt);
            }
        });
        menuUsers.add(menuInsertUser);

        menuUpdateUser.setText("Update");
        menuUpdateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUpdateUserActionPerformed(evt);
            }
        });
        menuUsers.add(menuUpdateUser);

        menuReportUser.setText("Report");
        menuUsers.add(menuReportUser);

        jMenuItem3.setText("Change Password");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuUsers.add(jMenuItem3);

        jMenuBar1.add(menuUsers);

        menuInsertSupplier.setText("Insert");
        menuInsertSupplier.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menuInsertSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInsertSupplierActionPerformed(evt);
            }
        });

        menuInsertCategory.setText("Category");
        menuInsertCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInsertCategoryActionPerformed(evt);
            }
        });
        menuInsertSupplier.add(menuInsertCategory);

        menuSupplierInsert.setText("Supplier");
        menuSupplierInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSupplierInsertActionPerformed(evt);
            }
        });
        menuInsertSupplier.add(menuSupplierInsert);

        menuItemReg.setText("Item");
        menuItemReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRegActionPerformed(evt);
            }
        });
        menuInsertSupplier.add(menuItemReg);

        menuSalesInsert.setText("Sales");
        menuSalesInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalesInsertActionPerformed(evt);
            }
        });
        menuInsertSupplier.add(menuSalesInsert);

        menuReturnInsert.setText("Return Item");
        menuReturnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReturnInsertActionPerformed(evt);
            }
        });
        menuInsertSupplier.add(menuReturnInsert);

        menuDamageInsert.setText("Damage Item");
        menuDamageInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDamageInsertActionPerformed(evt);
            }
        });
        menuInsertSupplier.add(menuDamageInsert);

        jMenuBar1.add(menuInsertSupplier);

        menuUpdate.setText("Update");
        menuUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        menuUpdateCategory.setText("Category");
        menuUpdateCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUpdateCategoryActionPerformed(evt);
            }
        });
        menuUpdate.add(menuUpdateCategory);

        menuUpdateSupplier.setText("Supplier");
        menuUpdateSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuUpdateSupplierActionPerformed(evt);
            }
        });
        menuUpdate.add(menuUpdateSupplier);

        menuItemUpdate.setText("Items");
        menuItemUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemUpdateActionPerformed(evt);
            }
        });
        menuUpdate.add(menuItemUpdate);

        menuSalesUpdate.setText("Sales");
        menuSalesUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalesUpdateActionPerformed(evt);
            }
        });
        menuUpdate.add(menuSalesUpdate);

        menuReturnUpdate.setText("Return Item");
        menuReturnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReturnUpdateActionPerformed(evt);
            }
        });
        menuUpdate.add(menuReturnUpdate);

        menuDamageUpdate.setText("Damage Item");
        menuDamageUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDamageUpdateActionPerformed(evt);
            }
        });
        menuUpdate.add(menuDamageUpdate);

        jMenuBar1.add(menuUpdate);

        menuBackup.setText("Back Up");
        menuBackup.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        menuDbBackup.setText("Backup Database");
        menuDbBackup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDbBackupActionPerformed(evt);
            }
        });
        menuBackup.add(menuDbBackup);

        jMenuBar1.add(menuBackup);

        menuReport.setText("Report");
        menuReport.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menuReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReportActionPerformed(evt);
            }
        });

        menuReportCategory.setText("Category");
        menuReportCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReportCategoryActionPerformed(evt);
            }
        });
        menuReport.add(menuReportCategory);

        menuReportSupplier.setText("Supplier");
        menuReportSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReportSupplierActionPerformed(evt);
            }
        });
        menuReport.add(menuReportSupplier);

        menuViewItem.setText("Items");
        menuViewItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuViewItemActionPerformed(evt);
            }
        });
        menuReport.add(menuViewItem);

        jMenuItem2.setText("Sales");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuReport.add(jMenuItem2);

        menuReportDamage.setText("Damage");
        menuReportDamage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReportDamageActionPerformed(evt);
            }
        });
        menuReport.add(menuReportDamage);

        menuReportReturn.setText("Return");
        menuReportReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReportReturnActionPerformed(evt);
            }
        });
        menuReport.add(menuReportReturn);

        jMenuBar1.add(menuReport);

        menuHelp.setText("Help ?");
        menuHelp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuBar1.add(menuHelp);

        menuLogOut.setText("Log Out");
        menuLogOut.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menuLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLogOutActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Log Out");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuLogOut.add(jMenuItem1);

        jMenuBar1.add(menuLogOut);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 1586, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashBoard, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void menuInsertUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInsertUserActionPerformed
// TODO add your handling code here:
        UserRegister userReg = new UserRegister();
        dashBoard.removeAll();
        dashBoard.repaint();
        dashBoard.add(userReg);
        userReg.setVisible(true); 
}//GEN-LAST:event_menuInsertUserActionPerformed

private void menuLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLogOutActionPerformed
// TODO add your handling code here:
        System.exit(0);
}//GEN-LAST:event_menuLogOutActionPerformed

private void menuUpdateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUpdateUserActionPerformed
// TODO add your handling code here:
        UserList userList = new UserList();
        dashBoard.removeAll();
        dashBoard.repaint();
        dashBoard.add(userList);
        userList.setVisible(true); 
}//GEN-LAST:event_menuUpdateUserActionPerformed

private void menuInsertCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInsertCategoryActionPerformed
// TODO add your handling code here:
        CategoryRegister userReg = new CategoryRegister();
        dashBoard.removeAll();
        dashBoard.repaint();
        dashBoard.add(userReg);
        userReg.setVisible(true); 
}//GEN-LAST:event_menuInsertCategoryActionPerformed

private void menuUpdateCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUpdateCategoryActionPerformed
// TODO add your handling code here:
        CategoryList catList = new CategoryList();
        dashBoard.removeAll();
        dashBoard.repaint();
        dashBoard.add(catList);
        catList.setVisible(true);
}//GEN-LAST:event_menuUpdateCategoryActionPerformed

private void menuInsertSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInsertSupplierActionPerformed
// TODO add your handling code here:
  
}//GEN-LAST:event_menuInsertSupplierActionPerformed

private void menuSupplierInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSupplierInsertActionPerformed
// TODO add your handling code here:
        SupplierRegister supplierReg = new SupplierRegister();
        dashBoard.removeAll();
        dashBoard.repaint();
        dashBoard.add(supplierReg);
        supplierReg.setVisible(true);
}//GEN-LAST:event_menuSupplierInsertActionPerformed

private void menuUpdateSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuUpdateSupplierActionPerformed
// TODO add your handling code here:
        SupplierList supplierList = new SupplierList();
        dashBoard.removeAll();
        dashBoard.repaint();
        dashBoard.add(supplierList);
        supplierList.setVisible(true);
}//GEN-LAST:event_menuUpdateSupplierActionPerformed

private void menuSalesInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalesInsertActionPerformed
// TODO add your handling code here:
        SalesRegister salesReg = new SalesRegister();
        dashBoard.removeAll();
        dashBoard.repaint();
        dashBoard.add(salesReg);
        salesReg.setVisible(true); 
}//GEN-LAST:event_menuSalesInsertActionPerformed

private void menuReturnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReturnInsertActionPerformed
// TODO add your handling code here:
        ReturnRegister rturnReg = new ReturnRegister();
        dashBoard.removeAll();
        dashBoard.repaint();
        dashBoard.add(rturnReg);
        rturnReg.setVisible(true);
}//GEN-LAST:event_menuReturnInsertActionPerformed

private void menuReturnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReturnUpdateActionPerformed
// TODO add your handling code here:
        ReturnList rturnList = new ReturnList();
        dashBoard.removeAll();
        dashBoard.repaint();
        dashBoard.add(rturnList);
        rturnList.setVisible(true);
}//GEN-LAST:event_menuReturnUpdateActionPerformed

private void menuSalesUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalesUpdateActionPerformed
// TODO add your handling code here:
        SalesList salesList = new  SalesList();
        dashBoard.removeAll();
        dashBoard.repaint();
        dashBoard.add(salesList);
        salesList.setVisible(true);
}//GEN-LAST:event_menuSalesUpdateActionPerformed

private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
// TODO add your handling code here:
        System.exit(0);
}//GEN-LAST:event_jMenuItem1ActionPerformed

private void menuItemRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRegActionPerformed
// TODO add your handling code here:
        ItemRegister itemReg = new ItemRegister();
        dashBoard.removeAll();
        dashBoard.repaint();
        dashBoard.add(itemReg);
        itemReg.setVisible(true);
}//GEN-LAST:event_menuItemRegActionPerformed

private void menuItemUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemUpdateActionPerformed
// TODO add your handling code here:
        ItemList itemList = new ItemList();
        dashBoard.removeAll();
        dashBoard.repaint();
        dashBoard.add(itemList);
        itemList.setVisible(true);
}//GEN-LAST:event_menuItemUpdateActionPerformed

private void menuDamageInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDamageInsertActionPerformed
// TODO add your handling code here:
        DamageRegister damageReg = new DamageRegister();
        dashBoard.removeAll();
        dashBoard.repaint();
        dashBoard.add(damageReg);
        damageReg.setVisible(true);
}//GEN-LAST:event_menuDamageInsertActionPerformed

private void menuDamageUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDamageUpdateActionPerformed
// TODO add your handling code here:
        DamageList damageList = new DamageList();
        dashBoard.removeAll();
        dashBoard.repaint();
        dashBoard.add(damageList);
        damageList.setVisible(true);
}//GEN-LAST:event_menuDamageUpdateActionPerformed

private void menuDbBackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDbBackupActionPerformed
// TODO add your handling code here:
        DbBackUp db = new DbBackUp();
        dashBoard.removeAll();
        dashBoard.repaint();
        dashBoard.add(db);
        db.setVisible(true);
}//GEN-LAST:event_menuDbBackupActionPerformed

    private void menuReportCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReportCategoryActionPerformed
        // TODO add your handling code here:
        ReportCategory rc= new  ReportCategory();
     
        dashBoard.removeAll();
        dashBoard.repaint();
        dashBoard.add(rc);
        rc.setVisible(true);
    }//GEN-LAST:event_menuReportCategoryActionPerformed

    private void menuReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReportActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_menuReportActionPerformed

    private void menuReportSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReportSupplierActionPerformed
        // TODO add your handling code here:
        ReportSupplier rs = new ReportSupplier();
        dashBoard.removeAll();
        dashBoard.repaint();
        dashBoard.add(rs);
        rs.setVisible(true);
    }//GEN-LAST:event_menuReportSupplierActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        ReportSales rsa = new ReportSales();
        dashBoard.removeAll();
        dashBoard.repaint();
        dashBoard.add(rsa);
        rsa.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void menuReportDamageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReportDamageActionPerformed
        // TODO add your handling code here:
        ReportDamage rd = new ReportDamage();
        dashBoard.removeAll();
        dashBoard.repaint();
        dashBoard.add(rd);
        rd.setVisible(true);
    }//GEN-LAST:event_menuReportDamageActionPerformed

    private void menuReportReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReportReturnActionPerformed
        // TODO add your handling code here:
        ReportReturn rr = new  ReportReturn();
        dashBoard.removeAll();
        dashBoard.repaint();
        dashBoard.add(rr);
        rr.setVisible(true);
    }//GEN-LAST:event_menuReportReturnActionPerformed

    private void menuViewItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuViewItemActionPerformed
        // TODO add your handling code here:
        ReportItem ri = new ReportItem();
        dashBoard.removeAll();
        dashBoard.repaint();
        dashBoard.add(ri);
        ri.setVisible(true);
    }//GEN-LAST:event_menuViewItemActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        ChangePasswordForm cp= new ChangePasswordForm(user);       
        dashBoard.removeAll();
        dashBoard.repaint();
        dashBoard.add(cp);
        cp.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new DashBoard().setVisible(true);
                //setExtendedState(MAXIMIZED_BOTH);
                //DashBoard.setUndecorated(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane dashBoard;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenu menuBackup;
    private javax.swing.JMenuItem menuDamageInsert;
    private javax.swing.JMenuItem menuDamageUpdate;
    private javax.swing.JMenuItem menuDbBackup;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenuItem menuInsertCategory;
    private javax.swing.JMenu menuInsertSupplier;
    private javax.swing.JMenuItem menuInsertUser;
    private javax.swing.JMenuItem menuItemReg;
    private javax.swing.JMenuItem menuItemUpdate;
    private javax.swing.JMenu menuLogOut;
    private javax.swing.JMenu menuReport;
    private javax.swing.JMenuItem menuReportCategory;
    private javax.swing.JMenuItem menuReportDamage;
    private javax.swing.JMenuItem menuReportReturn;
    private javax.swing.JMenuItem menuReportSupplier;
    private javax.swing.JMenuItem menuReportUser;
    private javax.swing.JMenuItem menuReturnInsert;
    private javax.swing.JMenuItem menuReturnUpdate;
    private javax.swing.JMenuItem menuSalesInsert;
    private javax.swing.JMenuItem menuSalesUpdate;
    private javax.swing.JMenuItem menuSupplierInsert;
    private javax.swing.JMenu menuUpdate;
    private javax.swing.JMenuItem menuUpdateCategory;
    private javax.swing.JMenuItem menuUpdateSupplier;
    private javax.swing.JMenuItem menuUpdateUser;
    private javax.swing.JMenu menuUsers;
    private javax.swing.JMenuItem menuViewItem;
    // End of variables declaration//GEN-END:variables
}
