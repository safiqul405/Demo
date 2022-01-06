
package JFrameBasiscMethod;

import javax.swing.JFrame;

public class JFrameB3 extends JFrame {
    
    JFrameB3(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 500, 400, 300);
        setTitle("This is a programme");
        }
    
    public static void main(String[] args) {
        
        JFrameB3 frame = new JFrameB3();
        frame.setVisible(true);
        
    }
}
