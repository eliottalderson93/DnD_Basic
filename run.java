import java.util.ArrayList;
public class run {
	public static void main(String[] args) {
		//ArrayList<Object> combatants = new ArrayList<Object>();
		Fighter conan = new Fighter("Conan the Barbarian");
		Wizard evil = new Wizard("D'Shzz the Mysterious");
		Rogue sneak = new Rogue("Vorr the Nimble");
		
		sneak.attack(conan);
		conan.berserk(evil);
		evil.fireball(conan, sneak);
		
		conan.getHealth().endRound();
		evil.getHealth().endRound();
		sneak.getHealth().endRound();
		
		sneak.backstab(evil);
		conan.berserk(sneak);
		evil.fireball(conan, sneak);
		
		conan.getHealth().endRound();
		evil.getHealth().endRound();
		sneak.getHealth().endRound();
		
		sneak.hide();
		conan.berserk(sneak);
		evil.fireball(sneak, conan);
		
		conan.getHealth().endRound();
		evil.getHealth().endRound();
		sneak.getHealth().endRound();
		
		sneak.backstab(conan);
		conan.berserk(sneak);
		evil.fireball(sneak, conan);
		
		conan.getHealth().endRound();
		evil.getHealth().endRound();
		sneak.getHealth().endRound();
		
		conan.berserk(sneak);
		sneak.backstab(conan);
		evil.fireball(conan, sneak);
		
		conan.getHealth().endRound();
		evil.getHealth().endRound();
		sneak.getHealth().endRound();
		
		
	}
}
