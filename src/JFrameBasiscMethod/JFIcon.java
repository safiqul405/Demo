
package JFrameBasiscMethod;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JFIcon extends JFrame {
    private ImageIcon icon;
    JFIcon(){
        initiComponent();
    }
    public void initiComponent(){
    icon = new ImageIcon(getClass().getResource("calculator.png"));
    this.setIconImage(icon.getImage());
    }
    
        public static void main(String[] args) {
        
        JFrameBasic2 frame = new JFrameBasic2();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
        frame.setBounds(200, 50, 400, 300);
        frame.setTitle("This is a programme");
        frame.setResizable(true); 
        
    }
}
