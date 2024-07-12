package view;

import java.awt.Color;
import model.Player;


public class FormTriLine extends javax.swing.JFrame {

   private Player player1;
   private Player player2;
   
    public FormTriLine(Player player1,Player player2) {
     this.player1 = player1;
     this.player2 = player2;
     init();   
    }

    public void init(){
        setUndecorated(true);
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        
        lblNameJ1.setText(player1.getName());
        lblNameJ2.setText(player2.getName());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBg = new javax.swing.JPanel();
        lbClose = new javax.swing.JLabel();
        image1 = new model.Image();
        image2 = new model.Image();
        lbl = new javax.swing.JLabel();
        lblNameJ1 = new javax.swing.JLabel();
        lblNameJ2 = new javax.swing.JLabel();
        lblPJ2 = new javax.swing.JLabel();
        lblPJ1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelBg.setBackground(new java.awt.Color(14, 19, 43));
        panelBg.setPreferredSize(new java.awt.Dimension(400, 500));
        panelBg.setLayout(null);

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
        panelBg.add(lbClose);
        lbClose.setBounds(370, 10, 14, 23);

        image1.setText("image1");
        image1.setRoute("/resources/JugadorEquis.png");
        panelBg.add(image1);
        image1.setBounds(50, 30, 50, 50);

        image2.setText("image1");
        image2.setRoute("/resources/JugadorCirculo.png");
        panelBg.add(image2);
        image2.setBounds(290, 30, 50, 50);

        lbl.setFont(new java.awt.Font("Verdana", 1, 30)); // NOI18N
        lbl.setForeground(new java.awt.Color(255, 255, 255));
        lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl.setText("-");
        panelBg.add(lbl);
        lbl.setBounds(190, 30, 20, 60);

        lblNameJ1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblNameJ1.setForeground(new java.awt.Color(180, 232, 255));
        lblNameJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameJ1.setText("NAME");
        panelBg.add(lblNameJ1);
        lblNameJ1.setBounds(30, 90, 90, 30);

        lblNameJ2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        lblNameJ2.setForeground(new java.awt.Color(255, 200, 255));
        lblNameJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNameJ2.setText("NAME");
        panelBg.add(lblNameJ2);
        lblNameJ2.setBounds(270, 90, 90, 30);

        lblPJ2.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        lblPJ2.setForeground(new java.awt.Color(255, 255, 255));
        lblPJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPJ2.setText("0");
        panelBg.add(lblPJ2);
        lblPJ2.setBounds(220, 30, 60, 60);

        lblPJ1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        lblPJ1.setForeground(new java.awt.Color(255, 255, 255));
        lblPJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPJ1.setText("0");
        panelBg.add(lblPJ1);
        lblPJ1.setBounds(120, 30, 60, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        lbClose.setForeground(new Color(240, 192, 255));
    }//GEN-LAST:event_lbCloseMouseExited

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

   
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private model.Image image1;
    private model.Image image2;
    private javax.swing.JLabel lbClose;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lblNameJ1;
    private javax.swing.JLabel lblNameJ2;
    private javax.swing.JLabel lblPJ1;
    private javax.swing.JLabel lblPJ2;
    private javax.swing.JPanel panelBg;
    // End of variables declaration//GEN-END:variables
}
