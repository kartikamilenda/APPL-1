/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MoveCircle;
import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*; 
/**
 *
 * @author asus
 */
public class CirclePanel extends JPanel {
    private final int CIRCLE_SIZE = 50; 
    private int x,y; 
    private Color c;
    JButton choose  = new JButton("choose color");
 //--------------------------------------------------------------- 
 // Set up circle and buttons to move it. 
 //--------------------------------------------------------------- 
 public CirclePanel(int width, int height) 
  { 
    // Set coordinates so circle starts in middle 
    x = (width/2)-(CIRCLE_SIZE/2); 
    y = (height/2)-(CIRCLE_SIZE/2); 
    c = Color.green; 
    
    // Need a border layout to get the buttons on the bottom 
    this.setLayout(new BorderLayout()); 
    
    // Create buttons to move the circle 
    JButton left = new JButton("Left"); 
    JButton right = new JButton("Right"); 
    JButton up = new JButton("Up"); 
    JButton down = new JButton("Down");
    
   //Create buttons to change colors
    JButton blue = new JButton("Blue");
    JButton red = new JButton("Red");
    JButton black = new JButton("Black");
    JButton green = new JButton("Green");
    
    // Add listeners to the buttons 
    left.addActionListener(new MoveListener(-20,0)); 
    right.addActionListener(new MoveListener(20,0)); 
    up.addActionListener(new MoveListener(0,-20)); 
    down.addActionListener(new MoveListener(0,20));
    
    // Add Listeners to the color button
    blue.addActionListener(new ColorListener(Color.blue));
    red.addActionListener(new ColorListener(Color.red));
    choose.addActionListener(new ColorListener (null));
    black.addActionListener(new ColorListener(Color.black));
    green.addActionListener(new ColorListener(Color.green));
    
    // Set the background
    blue.setBackground(Color.blue);
    red.setBackground(Color.red);
    black.setBackground(Color.black);
    green.setBackground(Color.green);
    
    // Need a panel to put the buttons on or they'll be on 
    // top of each other. 
    JPanel buttonPanel = new JPanel(); 
    buttonPanel.add(left); 
    buttonPanel.add(right); 
    buttonPanel.add(up); 
    buttonPanel.add(down); 
    
    // Add the button panel to the bottom of the main panel 
    this.add(buttonPanel, "South"); 
    
    JPanel colorbuttonPanel = new JPanel(); 
    colorbuttonPanel.add(blue); 
    colorbuttonPanel.add(red); 
    colorbuttonPanel.add(choose);
    colorbuttonPanel.add(black); 
    colorbuttonPanel.add(green); 
    
    // Add the button panel to the bottom of the main panel 
    this.add(colorbuttonPanel, "North"); 
    
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
            repaint(); 
        } 
    } 
 private class ColorListener implements ActionListener
 {
     private Color color;
  public ColorListener (Color color){
      this.color = color;
  }
   public void actionPerformed(ActionEvent e){
       if(this.color == null){
           c = JColorChooser.showDialog(choose,"Choose Color",c);
       }else{
        c = this.color;   
       }
       repaint();
   }
 }
}