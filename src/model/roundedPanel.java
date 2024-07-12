package model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;

public class roundedPanel extends JPanel {

    private double highArch = 50;
    private double wideArch = 50;
    private Color colorEdge = new Color(265, 40, 174);

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();

        RoundRectangle2D.Double roundedShape = new RoundRectangle2D.Double(
                0, 0, this.getWidth() - 1, this.getHeight() - 1, wideArch, highArch
        );
        
        g2.setColor(this.getBackground());
        g2.fill(roundedShape);
        g2.setColor(colorEdge);
        g2.draw(roundedShape);
        g2.dispose();
    }
}
