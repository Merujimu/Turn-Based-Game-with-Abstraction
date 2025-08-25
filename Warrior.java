import javax.swing.JOptionPane;

 class Warrior extends GameCharacter {
    public Warrior(String name) {
        super(name);
        WarriorName();
    }
    
    public void WarriorName() {
		name = JOptionPane.showInputDialog("Enter Warrior's name: " );
	}

    @Override
    public void attack(GameCharacter opponent) {
        JOptionPane.showMessageDialog(null, name + " swings a sword!");
        opponent.takeDamage(20);
       
    }

    @Override
    public void specialMove(GameCharacter opponent) {
        JOptionPane.showMessageDialog(null, name + " uses Shield Bash!");
        opponent.takeDamage(50);
    }
    
    public String[] getMoveOptions() {
        return new String[]{"Sword Slash (15 dmg)", "Shield Bash (50 dmg)"};
    }
    
  
}