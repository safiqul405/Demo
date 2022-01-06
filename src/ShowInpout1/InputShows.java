
package ShowInpout1;

import javax.swing.JOptionPane;

public class InputShows {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, name+" Wellcome to swing");
        
    }
}
