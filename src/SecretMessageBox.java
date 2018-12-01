import javax.swing.JOptionPane;

public class SecretMessageBox {
	public static void main(String[] args) {
		String audrey = "robot";
		String secretmessage = JOptionPane.showInputDialog("what is the secret message");
		String charlotte = JOptionPane.showInputDialog("If you guess the password you can see the secret message");
		if (charlotte.equals("robot")) {
			JOptionPane.showMessageDialog(null, secretmessage);
			
		}
		else {
			JOptionPane.showMessageDialog(null,"INTRUDER!!");
		}
	}

}
