
package showMessege1;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShowMess3 extends JFrame {
    
     private ImageIcon img;
     private Container c;
    ShowMess3(){
        initComponents();
    }
 
    public void initComponents(){
        c = this.getContentPane();
        c.setBackground(Color.yellow);
        
        img  = new ImageIcon(getClass().getResource("bumblebee_100px.png"));
        this.setIconImage(img.getImage());
    }
       public static void main(String[] args) {
           ShowMess3 show = new ShowMess3();
           show.setVisible(true);
           show.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           show.setBounds(200, 50,400,300);
    } 
}
