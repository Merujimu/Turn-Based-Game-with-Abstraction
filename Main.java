import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		    GameCharacter warrior = new Warrior(null);
	        GameCharacter mage = new Mage(null);	
	        
	        GameCharacter.gameStart();

	        while (!warrior.isDefeated() && !mage.isDefeated()) {
	            
	            warrior.chooseMove(mage);
	            if (mage.isDefeated()) {
	                JOptionPane.showMessageDialog(null, mage.name + " has been defeated!\n" + warrior.name + " wins!");
	                break;
	            }

	            mage.chooseMove(warrior);
	            if (warrior.isDefeated()) {
	                JOptionPane.showMessageDialog(null, warrior.name + " has been defeated!\n" + mage.name + " wins!");
	                break;
	            }
	        }
	    }
	}
