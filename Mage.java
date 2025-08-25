import javax.swing.JOptionPane;

class Mage extends GameCharacter {
	
    public Mage(String name ) {
        super(name);
        MageName();
    }
    
    public void MageName() {
		name = JOptionPane.showInputDialog("Enter Mages's name: " );
	}

    @Override
	public void attack(GameCharacter opponent) {
		JOptionPane.showMessageDialog(null, name + " casts a fireball!");
		  opponent.takeDamage(20);
	}

	@Override
	public void specialMove(GameCharacter opponent) {
		 JOptionPane.showMessageDialog(null, name + " uses Lightning Storm!");
		  opponent.takeDamage(50);
	}
	
	public String[] getMoveOptions() {
        return new String[]{"Fireball (20 dmg)", "Lightning Storm (50 dmg)"};
    }
    

    	
    }
