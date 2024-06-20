package view;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;


public class FormInit extends javax.swing.JFrame {


    public FormInit() {
        init();
    }
    
    public final void init(){
      
        setUndecorated(true);
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        panelBg.requestFocus();
    }
   
            
            
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panelBg = new javax.swing.JPanel();
        lbClose = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPlayer2 = new javax.swing.JTextField();
        txtPlayer1 = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(14, 19, 49));

        panelBg.setBackground(new java.awt.Color(14, 19, 49));
        panelBg.setPreferredSize(new java.awt.Dimension(516, 415));

        lbClose.setBackground(new java.awt.Color(60, 63, 65));
        lbClose.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lbClose.setForeground(new java.awt.Color(240, 192, 255));
        lbClose.setText("X");
        lbClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbCloseMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 1, 44)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(230, 251, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tres en linea");
        jLabel2.setAlignmentY(30.0F);

        txtPlayer2.setBackground(new java.awt.Color(249, 230, 254));
        txtPlayer2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtPlayer2.setForeground(new java.awt.Color(202, 105, 220));
        txtPlayer2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPlayer2.setText("JUGADOR 2");
        txtPlayer2.setToolTipText("");
        txtPlayer2.setAlignmentX(0.0F);
        txtPlayer2.setAlignmentY(0.0F);
        txtPlayer2.setBorder(null);
        txtPlayer2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtPlayer2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtPlayer2MouseExited(evt);
            }
        });

        txtPlayer1.setBackground(new java.awt.Color(214, 252, 249));
        txtPlayer1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtPlayer1.setForeground(new java.awt.Color(101, 175, 245));
        txtPlayer1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPlayer1.setText("JUGADOR 1");
        txtPlayer1.setAlignmentX(0.0F);
        txtPlayer1.setAlignmentY(0.0F);
        txtPlayer1.setBorder(null);
        txtPlayer1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtPlayer1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtPlayer1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelBgLayout = new javax.swing.GroupLayout(panelBg);
        panelBg.setLayout(panelBgLayout);
        panelBgLayout.setHorizontalGroup(
            panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBgLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbClose, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panelBgLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(112, 112, 112))
            .addGroup(panelBgLayout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBgLayout.setVerticalGroup(
            panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbClose)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(txtPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(228, 228, 228))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelBg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbCloseMouseClicked

    private void lbCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCloseMouseEntered
        lbClose.setForeground(Color.red);
    }//GEN-LAST:event_lbCloseMouseEntered

    private void lbCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCloseMouseExited
        lbClose.setForeground(new Color(240,192,255));
    }//GEN-LAST:event_lbCloseMouseExited

    private void txtPlayer1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPlayer1MouseEntered
        Border border = BorderFactory.createLineBorder(new Color(52, 136, 235), 2);
        txtPlayer1.setBorder(border);
    }//GEN-LAST:event_txtPlayer1MouseEntered

    private void txtPlayer1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPlayer1MouseExited
        txtPlayer1.setBorder(null);
    }//GEN-LAST:event_txtPlayer1MouseExited

    private void txtPlayer2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPlayer2MouseEntered
        Border border = BorderFactory.createLineBorder(new Color(165, 40, 174), 2);
        txtPlayer2.setBorder(border);
    }//GEN-LAST:event_txtPlayer2MouseEntered

    private void txtPlayer2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPlayer2MouseExited
        txtPlayer2.setBorder(null);
    }//GEN-LAST:event_txtPlayer2MouseExited



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbClose;
    private javax.swing.JPanel panelBg;
    private javax.swing.JTextField txtPlayer1;
    private javax.swing.JTextField txtPlayer2;
    // End of variables declaration//GEN-END:variables
}
