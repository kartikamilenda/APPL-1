/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnhancingAMovableCircle;
import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*; 
/**
 *
 * @author asus
 */
     public class CirclePanel extends JPanel 
{ 
 private final int CIRCLE_SIZE = 50; 
 private int x,y; 
 private Color c;
 private JButton left,right,up,down;
 private int xmax,ymax;
 
 //--------------------------------------------------------------- 
 // Set up circle and buttons to move it. 
 //--------------------------------------------------------------- 
 public CirclePanel(int width, int height) 
 { 
        xmax = width;
        ymax = height;
 // Set coordinates so circle starts in middle 
        x = (width/2)-(CIRCLE_SIZE/2); 
        y = (height/2)-(CIRCLE_SIZE/2); 
        c = Color.green; 
 // Need a border layout to get the buttons on the bottom 
        this.setLayout(new BorderLayout()); 
 // Create buttons to move the circle 
         left = new JButton("Left"); 
         right = new JButton("Right"); 
         up = new JButton("Up"); 
         down = new JButton("Down"); 
 
 // Add listeners to the buttons 
        left.addActionListener(new MoveListener(-20,0)); 
        right.addActionListener(new MoveListener(20,0)); 
        up.addActionListener(new MoveListener(0,-20)); 
        down.addActionListener(new MoveListener(0,20));
 // set Add mnemonics
        left.setMnemonic(KeyEvent.VK_L);
        right.setMnemonic(KeyEvent.VK_R);
        up.setMnemonic(KeyEvent.VK_U);
        down.setMnemonic(KeyEvent.VK_D);
// set Tool Tips
        left.setToolTipText("Move to the left about 20");
        right.setToolTipText("Move to the right about 20");
        up.setToolTipText("Move to up about 20");
        down.setToolTipText("Move to down about 20");
 // Need a panel to put the buttons on or they'll be on 
 // top of each other. 
        JPanel buttonPanel = new JPanel(); 
        buttonPanel.add(left); 
        buttonPanel.add(right); 
        buttonPanel.add(up); 
        buttonPanel.add(down); 
 // Add the button panel to the bottom of the main panel 
        this.add(buttonPanel, "South");
 
        
 } 
 //--------------------------------------------------------------- 
 // Draw circle on CirclePanel 
 //--------------------------------------------------------------- 
 public void paintComponent(Graphics page) 
 { 
    super.paintComponent(page); 
    page.setColor(c); 
    page.fillOval(x,y,CIRCLE_SIZE,CIRCLE_SIZE); 
 } 
 //--------------------------------------------------------------- 
 // Class to listen for button clicks that move circle. 
 //--------------------------------------------------------------- 
 private class MoveListener implements ActionListener 
 { 
    private int dx; 
    private int dy; 
 //--------------------------------------------------------------- 
 // Parameters tell how to move circle at click. 
 //--------------------------------------------------------------- 
    public MoveListener(int dx, int dy) 
    { 
        this.dx = dx; 
        this.dy = dy; 
    } 
 //--------------------------------------------------------------- 
 // Change x and y coordinates and repaint. 
 //--------------------------------------------------------------- 
    public void actionPerformed(ActionEvent e) 
    { 
        x += dx; 
        y += dy;
        left.setEnabled(x > 0);
        right.setEnabled(x < xmax - 70);
        up.setEnabled(y > 0);
        down.setEnabled(y < ymax - 120);
        repaint(); 
    } 
   } 
}
