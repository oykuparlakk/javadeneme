
public class Numeric {
     private Character Character;
     private Integral Integral;
     
	public Character getCharacter() {
		return Character;
	}
	public void setCharacter(Character character) {
		Character = character;
	}
	public Integral getIntegral() {
		return Integral;
	}
	public void setIntegral(Integral integral) {
		Integral = integral;
	}
	public Numeric(Character character, Integral integral) {
		
		Character = character;
		Integral = integral;
	}
     
     
}
