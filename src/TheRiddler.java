import javax.swing.JOptionPane;

public class TheRiddler {
	public static void main(String[] args) {
		int score = 0;
		String riddles = JOptionPane.showInputDialog("Which word contains all 26 letters but has only three syllables");
		if (riddles.equals("alphabet")){
			JOptionPane.showMessageDialog(null, "correct!!");
			score = 1;
		}
		else {
		JOptionPane.showMessageDialog(null, "you are wrong, the correct answer is alphabet");
		}
		
		
	}

}
