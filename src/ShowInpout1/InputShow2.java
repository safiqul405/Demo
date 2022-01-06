
package ShowInpout1;

import javax.swing.JOptionPane;

public class InputShow2 {
    public static void main(String[] args) {
        
        String f_name = JOptionPane.showInputDialog(null, "What is your first name ", "Cheeck Name", JOptionPane.QUESTION_MESSAGE);
        String l_name = JOptionPane.showInputDialog(null, "What is your last name ", "Cheeck Name", JOptionPane.QUESTION_MESSAGE);
        
        String name = f_name + l_name;
        JOptionPane.showMessageDialog(null, "Your full name is "+ name);
        
    }
}
