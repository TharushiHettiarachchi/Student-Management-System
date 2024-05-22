
package gui;

import java.awt.Color;
import java.awt.Toolkit;
import java.sql.Date;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import model.MYSQL;


public class Attendance extends javax.swing.JFrame {

    
    public Attendance() {
        initComponents();
        loadClasses();
        loadTable();
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/icon.png")));
    }

    public void loadClasses() {
        try {

            ResultSet resultSet = MYSQL.search("SELECT * FROM `class`");
            Vector v = new Vector();
            v.add("Select");
            while (resultSet.next()) {
                v.add(resultSet.getString("ClassNo"));

            }
            DefaultComboBoxModel model3 = new DefaultComboBoxModel(v);
            jComboBox1.setModel(model3);

//            System.out.println(resultSet.getString("name"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadTable() {
        try {
              Color c1 = new Color(255, 153, 51);
            ResultSet resultSet = MYSQL.search("SELECT * FROM `attendance`");

              DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(JLabel.CENTER);
            TableCellRenderer rendererFromHeader = jTable1.getTableHeader().getDefaultRenderer();
            JLabel headerLabel = (JLabel) rendererFromHeader;
            headerLabel.setHorizontalAlignment(JLabel.CENTER);

//            
            for (int i = 0; i < jTable1.getColumnCount(); i++) {
                jTable1.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
                 jTable1.getTableHeader().setBackground(c1);
            }
            while (resultSet.next()) {
                Vector<String> v = new Vector();
                v.add(resultSet.getString("date"));
                v.add(resultSet.getString("student_Sno"));
                v.add(resultSet.getString("class_classNo"));

                model.addRow(v);
                jTable1.setModel(model);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void reset() {

        jTextField2.setText("");

        jTextField2.setEnabled(true);
        jTextField2.grabFocus();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Adyapana Institute - Attendance");

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ATTENDANCE");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Date");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("Student ID");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel8.setText("Class");

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 153, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Delete");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton5.setBackground(new java.awt.Color(255, 153, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Back");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                        .addComponent(jComboBox1, 0, 250, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(140, 140, 140)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(270, 270, 270)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Student ID", "Class"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionBackground(new java.awt.Color(255, 153, 51));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 959, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        String date = (String) sdf.format(jDateChooser1.getDate());
        String studentId = jTextField2.getText();
        String classes = jComboBox1.getSelectedItem().toString();

        if (date.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Date field is empty", "Warning", JOptionPane.WARNING_MESSAGE);
            jDateChooser1.grabFocus();
        } else if (studentId.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Subject ID field is empty", "Warning", JOptionPane.WARNING_MESSAGE);
            jTextField2.grabFocus();
        } else if (classes.equals("Select")) {
            JOptionPane.showMessageDialog(this, "Please select a Class", "Warning", JOptionPane.WARNING_MESSAGE);
            jComboBox1.grabFocus();
        } else {

            String query = "INSERT INTO `attendance`(`date`,`student_Sno`,`class_classNo`) VALUES ('" + date + "','" + studentId + "','" + classes + "')";
            MYSQL.iud(query);
            loadTable();
            reset();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

         Dashboard dashboard = new Dashboard();
        dashboard.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (evt.getClickCount() == 2) {
            jTable1.setEnabled(false);
            jButton1.setEnabled(false);
            int selectedRow = jTable1.getSelectedRow();

            String subjectName = String.valueOf(jTable1.getValueAt(selectedRow, 1));
            jTextField2.setText(subjectName);

            String classes = String.valueOf(jTable1.getValueAt(selectedRow, 2));
            jComboBox1.setSelectedItem(classes);

            String date = String.valueOf(jTable1.getValueAt(selectedRow, 0));
            jDateChooser1.setDate(Date.valueOf(date));

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow == -1) {
            System.out.println("Select a row");
        } else {
            String date = String.valueOf(jTable1.getValueAt(selectedRow, 0));
            String studentId = String.valueOf(jTable1.getValueAt(selectedRow, 1));
            String classes = String.valueOf(jTable1.getValueAt(selectedRow, 2));
            try {

                MYSQL.iud("DELETE FROM `attendance` WHERE `class_classNo` = '" + classes + "' AND `student_Sno` = '"+studentId+"' AND `date` = '"+date+"'");
                loadTable();
                reset();
                jTable1.setEnabled(true);
                jButton1.setEnabled(true);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        jButton1.setForeground(Color.orange);
        jButton1.setBorder(BorderFactory.createLineBorder(Color.orange));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
         jButton1.setForeground(Color.white);
          jButton1.setBorder(BorderFactory.createLineBorder(Color.orange));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        // TODO add your handling code here:
        jButton3.setForeground(Color.orange);
        jButton3.setBorder(BorderFactory.createLineBorder(Color.orange));
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        // TODO add your handling code here:
         jButton3.setForeground(Color.white);
          jButton3.setBorder(BorderFactory.createLineBorder(Color.orange));
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        // TODO add your handling code here:
        jButton5.setForeground(Color.orange);
        jButton5.setBorder(BorderFactory.createLineBorder(Color.orange));
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
 jButton5.setForeground(Color.white);
          jButton5.setBorder(BorderFactory.createLineBorder(Color.orange));
    }//GEN-LAST:event_jButton5MouseExited

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
            java.util.logging.Logger.getLogger(Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Attendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
