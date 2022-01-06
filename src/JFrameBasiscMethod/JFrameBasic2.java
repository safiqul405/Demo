
package JFrameBasiscMethod;

import javax.swing.JFrame;

public class JFrameBasic2 extends JFrame{
    public static void main(String[] args) {
        
        JFrameBasic2 frame = new JFrameBasic2();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        //frame.setLocationRelativeTo(Null);
        frame.setLocation(200, 50);
        frame.setBounds(200, 500, 400, 300);
        frame.setTitle(null);
        frame.setTitle("This is a programme");
        //frame.setResizable(true);         fa;se use for no size 
        
    }
}
