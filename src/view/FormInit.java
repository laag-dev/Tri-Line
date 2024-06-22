package view;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class FormInit extends javax.swing.JFrame {

    public FormInit() {
        init();
    }

    public final void init() {

        setUndecorated(true);
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        panelBg.requestFocus();
        Border borderButton = BorderFactory.createLineBorder(new Color (243,211,246),2);
        panelButton.setBorder(borderButton);
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
        panelButton = new javax.swing.JPanel();
        lbInit = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(14, 19, 49));

        panelBg.setBackground(new java.awt.Color(14, 19, 49));
        panelBg.setPreferredSize(new java.awt.Dimension(516, 415));
        panelBg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelBgMousePressed(evt);
            }
        });

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
        txtPlayer2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPlayer2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPlayer2FocusLost(evt);
            }
        });
        txtPlayer2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtPlayer2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtPlayer2MouseExited(evt);
            }
        });
        txtPlayer2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPlayer2KeyTyped(evt);
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
        txtPlayer1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPlayer1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPlayer1FocusLost(evt);
            }
        });
        txtPlayer1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtPlayer1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtPlayer1MouseExited(evt);
            }
        });
        txtPlayer1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPlayer1KeyTyped(evt);
            }
        });

        panelButton.setBackground(new java.awt.Color(42, 22, 79));

        lbInit.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lbInit.setForeground(new java.awt.Color(241, 227, 252));
        lbInit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbInit.setText("INICIAR");
        lbInit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbInit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbInitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbInitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelButtonLayout = new javax.swing.GroupLayout(panelButton);
        panelButton.setLayout(panelButtonLayout);
        panelButtonLayout.setHorizontalGroup(
            panelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbInit, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
        );
        panelButtonLayout.setVerticalGroup(
            panelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbInit, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelBgLayout = new javax.swing.GroupLayout(panelBg);
        panelBg.setLayout(panelBgLayout);
        panelBgLayout.setHorizontalGroup(
            panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBgLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(112, 112, 112))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBgLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbClose, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(panelBgLayout.createSequentialGroup()
                .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBgLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelBgLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(panelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(60, 60, 60)
                .addComponent(panelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBg, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBg, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void txtPlayer1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPlayer1FocusGained
        if (txtPlayer1.getText().equals("JUGADOR 1")) {
            txtPlayer1.setText("");
        }

    }//GEN-LAST:event_txtPlayer1FocusGained

    private void txtPlayer2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPlayer2FocusGained
        if (txtPlayer2.getText().equals("JUGADOR 2"))
            txtPlayer2.setText("");
    }//GEN-LAST:event_txtPlayer2FocusGained

    private void txtPlayer1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPlayer1FocusLost
        if (txtPlayer1.getText().equals(""))
            txtPlayer1.setText("JUGADOR 1");
    }//GEN-LAST:event_txtPlayer1FocusLost

    private void txtPlayer2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPlayer2FocusLost
        if (txtPlayer2.getText().equals(""))
            txtPlayer2.setText("JUGADOR 2");
    }//GEN-LAST:event_txtPlayer2FocusLost

    private void panelBgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBgMousePressed
        panelBg.requestFocus();
    }//GEN-LAST:event_panelBgMousePressed

    private void txtPlayer1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlayer1KeyTyped
        char letter = Character.toUpperCase(evt.getKeyChar());
        evt.setKeyChar(letter);
        if(txtPlayer1.getText().length()>=8)
            evt.consume();
    }//GEN-LAST:event_txtPlayer1KeyTyped

    private void txtPlayer2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlayer2KeyTyped
        char letter = Character.toUpperCase(evt.getKeyChar());
        evt.setKeyChar(letter);
        if(txtPlayer2.getText().length()>=8)
            evt.consume();
    }//GEN-LAST:event_txtPlayer2KeyTyped

    private void lbInitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbInitMouseEntered
      panelButton.setBackground(new Color (126,49,196));
    }//GEN-LAST:event_lbInitMouseEntered

    private void lbInitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbInitMouseExited
        panelButton.setBackground(new Color (42,22,79));
    }//GEN-LAST:event_lbInitMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbClose;
    private javax.swing.JLabel lbInit;
    private javax.swing.JPanel panelBg;
    private javax.swing.JPanel panelButton;
    private javax.swing.JTextField txtPlayer1;
    private javax.swing.JTextField txtPlayer2;
    // End of variables declaration//GEN-END:variables
}
