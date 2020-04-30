
public class Character {
	private char charDeger1 = 65;
    private char charDeger2 = 'A';
	public char getCharDeger1() {
		return charDeger1;
	}
	public void setCharDeger1(char charDeger1) {
		this.charDeger1 = charDeger1;
	}
	public char getCharDeger2() {
		return charDeger2;
	}
	public void setCharDeger2(char charDeger2) {
		this.charDeger2 = charDeger2;
	}
	public Character(char charDeger1, char charDeger2) {
		
		this.charDeger1 = charDeger1;
		this.charDeger2 = charDeger2;
	}
    
   public void CharYazdýr() {
    	
    	 System.out.println("Char Deger 1: " + charDeger1);
         System.out.println("Char Deger 2: " + charDeger2);
  
    	
    }
}
