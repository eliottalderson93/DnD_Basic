import java.util.concurrent.ThreadLocalRandom;
//import java.util.Random;
public class Rogue extends Human {
	public Rogue() {
		this.stealth = 10;
		this.isHidden = true;
	}
	public Rogue(String Name) {
		this.name = Name;
		this.stealth = 10;
		this.isHidden = true;
	}
	public void backstab(Human target) {
		if (this.isAlive == true) {
			if(this.isHidden == true) {
				int damage = this.stealth*ThreadLocalRandom.current().nextInt(0,4); //between 0 and 3
				System.out.println(this.name + " creeps out of the shadows and delivers a devastating backstab to " +target.name);
				target.health -= damage;
				this.isHidden = false;
			}
			else {
				this.attack(target);
			}
		}
		else {
			System.out.println(this.name + " has fallen.");
		}
	}
	public void hide() {
		this.isHidden = true;
		this.health -= 10;
	}
}
