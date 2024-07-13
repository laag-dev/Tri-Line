package model;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Board extends JPanel {

    private int widthSquareI;
    private int heightSquareI;
    private int margin;
    private Color colorBoard;
    private Color colorSquareI;
    
    private Player player1;
    private Player player2;
    
    private ArrayList<Square> squares;

    public Board() {
        init();

    }

    public void init() {
        widthSquareI = 80;
        heightSquareI = 80;
        colorSquareI = Color.BLUE;
        colorBoard = Color.RED;
        margin = 6;
        player1 = new Player();
        player2 = new Player();
        squares = new ArrayList();
    }

    public void createBoard() {
        setLayout(null);
        setSize(widthSquareI * 3 + margin * 4, heightSquareI * 3 + margin * 4);
        setBackground(colorBoard);
        createSquareInternal();
    }

    public void createSquareInternal() {

        int x = margin;
        int y = margin;

        for (int i = 0; i < 3; i++) {
            x = margin;
            for (int j = 0; j < 3; j++) {
                Square square = new Square(widthSquareI,heightSquareI,colorSquareI);
                square.setCursor(new Cursor(Cursor.HAND_CURSOR));
                square.setLocation(x,y);
                add(square);
                squares.add(square);
                createEventSquare(square);

                x += (widthSquareI + margin);
            }
            y += (heightSquareI + margin);

        }

    }

    public void createEventSquare(Square square){
       
        MouseListener eventS = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
               square.setTypeImage(TypeImage.CROSS);
               square.repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        };
        square.addMouseListener(eventS);
    }
    
    public ArrayList<Square> getSquares() {
        return squares;
    }

    public void setSquares(ArrayList<Square> squares) {
        this.squares = squares;
    }

    public int getWidthSquareI() {
        return widthSquareI;
    }

    public void setWidthSquareI(int widthSquareI) {
        this.widthSquareI = widthSquareI;
    }

    public int getHeightSquareI() {
        return heightSquareI;
    }

    public void setHeightSquareI(int heightSquareI) {
        this.heightSquareI = heightSquareI;
    }

    public int getMargin() {
        return margin;
    }

    public void setMargin(int margin) {
        this.margin = margin;
    }

    public Color getColorBoard() {
        return colorBoard;
    }

    public void setColorBoard(Color colorBoard) {
        this.colorBoard = colorBoard;
    }

    public Color getColorSquareI() {
        return colorSquareI;
    }

    public void setColorSquareI(Color colorSquareI) {
        this.colorSquareI = colorSquareI;
    }

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

}
