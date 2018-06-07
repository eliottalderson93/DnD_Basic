public class Fighter extends Human {
	public Fighter() {
		this.health = 150;
		this.strength = 5;
	}
	public Fighter(String Name) {
		this.name = Name;
		this.health = 150;
		this.strength = 5;
	}
	public void berserk(Human target) {
		if (this.isAlive == true) {
			int health_mod = (int)(this.health * 0.5);
			this.health = health_mod;
			target.health -= this.strength * ((int)health_mod/10);
			System.out.println(this.name + "'s eyes glaze over in bloodlust as he swings his battleaxe at "+ target.name +" in a mighty blow");
		}
		else {
			System.out.println(this.name + " has fallen.");
		}
	}
	public void secondWind(Human target) {
		if (this.isAlive == true) {
			this.health -= 5;
			System.out.println(this.name + "tenses his muscles and presses " + target.name + " with a flurry of blows");
			this.attack(target);
			this.attack(target);
		}
		else {
			System.out.println(this.name + " has fallen.");
		}
	}
}
