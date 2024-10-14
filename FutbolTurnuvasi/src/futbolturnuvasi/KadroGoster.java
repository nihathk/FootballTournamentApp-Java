/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futbolturnuvasi;

/**
 *
 * @author nihat
 */
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class KadroGoster extends javax.swing.JFrame {

    /**
     * Creates new form KadroGoster
     */
    DefaultTableModel model;
    public Turnuva turnuva;

    public KadroGoster() throws IOException {
        initComponents();
        model = (DefaultTableModel) OyuncuTablo.getModel();

        for (Takim takim : turnuva.takimlar) {
            TakimlarComboBox.addItem(takim.getTakimAd());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AnaMenuButon = new javax.swing.JButton();
        TakimlarComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        OyuncuTablo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        AnaMenuButon.setBackground(new java.awt.Color(0, 204, 0));
        AnaMenuButon.setForeground(new java.awt.Color(0, 0, 0));
        AnaMenuButon.setText("Ana Menuye Dön");
        AnaMenuButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnaMenuButonActionPerformed(evt);
            }
        });

        TakimlarComboBox.setBackground(new java.awt.Color(0, 204, 0));
        TakimlarComboBox.setEditable(true);
        TakimlarComboBox.setForeground(new java.awt.Color(0, 0, 0));
        TakimlarComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Takım Seç" }));
        TakimlarComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TakimlarComboBoxActionPerformed(evt);
            }
        });

        OyuncuTablo.setBackground(new java.awt.Color(0, 204, 0));
        OyuncuTablo.setForeground(new java.awt.Color(0, 0, 0));
        OyuncuTablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "İsim", "Soyisim", "Numara", "Seviye"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(OyuncuTablo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TakimlarComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AnaMenuButon, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TakimlarComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AnaMenuButon)
                        .addGap(20, 20, 20))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void AnaMenuButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnaMenuButonActionPerformed
        AnaMenu m = null;
        try {
            m = new AnaMenu();
        } catch (IOException ex) {
            Logger.getLogger(KadroGoster.class.getName()).log(Level.SEVERE, null, ex);
        }
        m.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AnaMenuButonActionPerformed


    private void TakimlarComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TakimlarComboBoxActionPerformed
        model.setRowCount(0);

        Takim takim = null;

        for (int i = 0; i < turnuva.takimlar.size(); i++) {
            if (TakimlarComboBox.getSelectedItem().toString().equals(turnuva.takimlar.get(i).getTakimAd())) {

                takim = turnuva.takimlar.get(i);
                break;
            }
        }

        for (Oyuncu oyuncu : takim.oyuncuListe) {
            model.insertRow(model.getRowCount(), new Object[]{oyuncu.getAd(), oyuncu.getSoyad(), oyuncu.getNumara(), oyuncu.getSeviye()});

        }
    }//GEN-LAST:event_TakimlarComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(KadroGoster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KadroGoster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KadroGoster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KadroGoster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new KadroGoster().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(KadroGoster.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AnaMenuButon;
    private javax.swing.JTable OyuncuTablo;
    private javax.swing.JComboBox<String> TakimlarComboBox;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
