import javax.swing.JOptionPane;

abstract class GameCharacter {
	 String name;
	 int HP;

	    public GameCharacter(String name ) {
	        this.name = name;
	        this.HP = 100;
	    }
	    
	    public abstract void attack(GameCharacter opponent);
	    public abstract void specialMove(GameCharacter opponent);
	   
		public static void gameStart() {
			JOptionPane.showMessageDialog(null, "Game Starts! Both have 100% HP!");
		}


	    public void showName() {
	        JOptionPane.showMessageDialog(null, "Character: " + name + "  HP %" + HP);
	    }

		
		 public void takeDamage(int damage) {
		        HP -= damage;
		        if (HP < 0) HP = 0;
		        JOptionPane.showMessageDialog(null, name + " takes " + damage + " damage!\nHP left: " + HP);
		    }
		     
		    public void chooseMove(GameCharacter opponent) {
		    	String[] moves = getMoveOptions();
		    	int choice = JOptionPane.showOptionDialog(null, "Choose " + name + " 's move : ", "Move selectiion", JOptionPane.DEFAULT_OPTION,
		                JOptionPane.INFORMATION_MESSAGE, null, moves, moves[0]);
		    	
		    	  if (choice == 0) {   
		    	        attack(opponent);
		    	    } else if (choice == 1) {  
		    	        specialMove(opponent);
		    	    }
		    }
		    
		    protected abstract String[] getMoveOptions();

			public boolean isDefeated() {
		        return HP <= 0;
		    }
		    
		    
	
	}