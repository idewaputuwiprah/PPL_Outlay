/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Outlay;

import Outlay.PengeluaranCtrl;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author idewa
 */
public class HalamanMencatat extends javax.swing.JFrame {

    /**
     * Creates new form HalamanUtama
     */
    public HalamanMencatat() {
        initComponents();
        getComboKategori();
    }
    
    private final PengeluaranCtrl pengeluaranctrl = new PengeluaranCtrl();
    
    String s = "";
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        number_5 = new javax.swing.JButton();
        number_6 = new javax.swing.JButton();
        number_7 = new javax.swing.JButton();
        number_8 = new javax.swing.JButton();
        number_9 = new javax.swing.JButton();
        number_0 = new javax.swing.JButton();
        number_1 = new javax.swing.JButton();
        number_2 = new javax.swing.JButton();
        number_3 = new javax.swing.JButton();
        number_4 = new javax.swing.JButton();
        numberField = new java.awt.TextField();
        jLabel1 = new javax.swing.JLabel();
        namaPengeluaran = new javax.swing.JTextField();
        submitButton1 = new javax.swing.JButton();
        kategori_ComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        number_5.setText("5");
        number_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                number_5MouseClicked(evt);
            }
        });

        number_6.setText("6");
        number_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                number_6MouseClicked(evt);
            }
        });

        number_7.setText("7");
        number_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                number_7MouseClicked(evt);
            }
        });

        number_8.setText("8");
        number_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                number_8MouseClicked(evt);
            }
        });

        number_9.setText("9");
        number_9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                number_9MouseClicked(evt);
            }
        });

        number_0.setText("0");
        number_0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                number_0MouseClicked(evt);
            }
        });

        number_1.setText("1");
        number_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                number_1MouseClicked(evt);
            }
        });

        number_2.setText("2");
        number_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                number_2MouseClicked(evt);
            }
        });

        number_3.setText("3");
        number_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                number_3MouseClicked(evt);
            }
        });

        number_4.setText("4");
        number_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                number_4MouseClicked(evt);
            }
        });

        numberField.setEditable(false);

        jLabel1.setText("Pengeluaran");

        submitButton1.setText("Submit");
        submitButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButton1ActionPerformed(evt);
            }
        });

        kategori_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(namaPengeluaran))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(number_4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(number_5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(number_6))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(number_7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(number_0)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(number_8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(number_9))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(numberField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(number_1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(number_2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(number_3))))
                        .addGap(42, 42, 42)
                        .addComponent(kategori_ComboBox, 0, 77, Short.MAX_VALUE)))
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submitButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(namaPengeluaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kategori_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(number_1)
                    .addComponent(number_2)
                    .addComponent(number_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(number_4)
                    .addComponent(number_5)
                    .addComponent(number_6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(number_7)
                    .addComponent(number_8)
                    .addComponent(number_9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(number_0)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(submitButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void number_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number_1MouseClicked
        // TODO add your handling code here:
        s = s + "1";
        numberField.setText(s);
    }//GEN-LAST:event_number_1MouseClicked

    private void number_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number_2MouseClicked
        // TODO add your handling code here:
        s = s + "2";
        numberField.setText(s);
    }//GEN-LAST:event_number_2MouseClicked

    private void number_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number_3MouseClicked
        // TODO add your handling code here:
        s = s + "3";
        numberField.setText(s);
    }//GEN-LAST:event_number_3MouseClicked

    private void number_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number_4MouseClicked
        // TODO add your handling code here:
        s = s + "4";
        numberField.setText(s);
    }//GEN-LAST:event_number_4MouseClicked

    private void number_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number_5MouseClicked
        // TODO add your handling code here:
        s = s + "5";
        numberField.setText(s);
    }//GEN-LAST:event_number_5MouseClicked

    private void number_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number_6MouseClicked
        // TODO add your handling code here:
        s = s + "6";
        numberField.setText(s);
    }//GEN-LAST:event_number_6MouseClicked

    private void number_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number_7MouseClicked
        // TODO add your handling code here:
        s = s + "7";
        numberField.setText(s);
    }//GEN-LAST:event_number_7MouseClicked

    private void number_8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number_8MouseClicked
        // TODO add your handling code here:
        s = s + "8";
        numberField.setText(s);
    }//GEN-LAST:event_number_8MouseClicked

    private void number_9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number_9MouseClicked
        // TODO add your handling code here:
        s = s + "9";
        numberField.setText(s);
    }//GEN-LAST:event_number_9MouseClicked

    private void number_0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_number_0MouseClicked
        // TODO add your handling code here:
        s = s + "0";
        numberField.setText(s);
    }//GEN-LAST:event_number_0MouseClicked

    private void submitButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButton1ActionPerformed
        // TODO add your handling code here:
        pengeluaranctrl.submitOnClick(this);
    }//GEN-LAST:event_submitButton1ActionPerformed

    private void getComboKategori(){
        Connection con = pengeluaranctrl.getKategori_List();
        try{
            Statement st = con.createStatement();
            String q = "select * from kategori";
            ResultSet rs = st.executeQuery(q);
            
            while(rs.next()){
                String kategori = (String) rs.getString("nama");
                kategori_ComboBox.addItem(kategori);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public String getNumber(){
        return numberField.getText();
    }
    
    public String getName(){
        return namaPengeluaran.getText();
    }
    
    public String getKat(){
        String value = (String) kategori_ComboBox.getSelectedItem();
        return value;
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
            java.util.logging.Logger.getLogger(HalamanMencatat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HalamanMencatat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HalamanMencatat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HalamanMencatat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HalamanMencatat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> kategori_ComboBox;
    public static javax.swing.JTextField namaPengeluaran;
    public static java.awt.TextField numberField;
    private javax.swing.JButton number_0;
    private javax.swing.JButton number_1;
    private javax.swing.JButton number_2;
    private javax.swing.JButton number_3;
    private javax.swing.JButton number_4;
    private javax.swing.JButton number_5;
    private javax.swing.JButton number_6;
    private javax.swing.JButton number_7;
    private javax.swing.JButton number_8;
    private javax.swing.JButton number_9;
    private javax.swing.JButton submitButton1;
    // End of variables declaration//GEN-END:variables
}
