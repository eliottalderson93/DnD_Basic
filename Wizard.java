
public class Wizard extends Human {
	public int mana;
	public Wizard() {
		this.health = 50;
		this.intelligence = 8;
		this.mana = 100;
	}
	public Wizard(String Name) {
		this.name = Name;
		this.health = 50;
		this.intelligence = 8;
		this.mana = 100;
	}
	public void fireball(Human target) { //single target
		if (this.isAlive == true) {
			if (this.mana >= 15) {
				this.mana -= 15;
				target.health -= 3*this.intelligence;
				System.out.println(this.name + " chants words of power as a BOOM and searing ball of flame manifests and flies at " + target.name);
			}
			else {
				this.health -= 2;
				System.out.println(this.name + " flinches in pain and breaks out in sweat as magical power dissipates around his person.");
				this.attack(target);
			}
		}
		else {
			System.out.println(this.name + " has fallen.");
		}
	}
	public void fireball(Human target1, Human target2) { //double target attack
		if (this.isAlive == true) {
			if (this.mana >= 35) {
				this.mana -= 35;
				target1.health -= 2*this.intelligence;
				target2.health -= 2*this.intelligence;
				System.out.println(this.name + " chants words of power as lines of fire streaks from his hands and burns " + target1.name + " and " + target2.name);
			}
			else {
				this.fireball(target1);
			}
		}
		else {
			System.out.println(this.name + " has fallen.");
		}
	}
	public int getMana() {
		System.out.print(this.name + "'s mana is: ");
		System.out.print(this.mana);
		System.out.println("");
		return this.mana;
	}
}
