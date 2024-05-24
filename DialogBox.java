import javax.swing.JOptionPane;
public class DialogBox {
    public static void main(String[] args){
        String ab;
        ab = JOptionPane.showInputDialog("Levo Maro ?");
        JOptionPane.showMessageDialog(null, ab+" ?" + " Kem thyu");
        System.exit(0);
    }
}
