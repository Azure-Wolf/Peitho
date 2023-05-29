/*Noah Zaborowicz
 *
 */

// Misc Imports
import java.io.*;
import static java.lang.System.*;
import java.lang.Math;
import java.util.Scanner;
import java.util.ArrayList;

// Screen Imports
import java.awt.*;
import javax.swing.*;
import javax.imageio.*;
import java.awt.image.BufferedImage;



public class Screen extends JPanel{

  // protected void screen() throws IOException
  // {
    // Screen abc = new Screen();
  // }


  public static void main (String str[]) throws IOException {
       
    //  Creates Frame and sets size and title and makes it not resizable
   JFrame screen = new JFrame("Peitho");
   screen.setSize(750, 750);
   screen.setVisible(true);
   screen.setResizable(false);

    //  Makes the image appear on the screen
    screen.getContentPane().setLayout(new FlowLayout());
    screen.getContentPane().add(new JLabel(new ImageIcon("Background.png")));
    screen.getContentPane().add(new JLabel(new ImageIcon("GlitchPhone.png")));
    screen.pack();


    //  Creates and sets the icon in the top left
    ImageIcon logoicon = new ImageIcon("GlitchPhone.png"); 
    Image logo = logoicon.getImage();
    screen.setIconImage(logo);
       
    //  Opens the program in the middle of screen
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    int w = screen.getSize().width;
    int h = screen.getSize().height;
    int x = (dim.width-w)/2;
    int y = (dim.height-h)/2;
    screen.setLocation(x, y);
       
    //  Closes program when you press the close button on window
    screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             
    }
}
