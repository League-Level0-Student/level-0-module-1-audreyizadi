import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String audrey = JOptionPane.showInputDialog("What is your birthday");

		if (audrey.equalsIgnoreCase("11/19")){
			JOptionPane.showMessageDialog(null, "Happy Birthday");
		}
		else {
		JOptionPane.showMessageDialog(null, "Happy unbirthday");
		
	}
	}
	}


