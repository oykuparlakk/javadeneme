
public class Nonprimitive {
    private String ifade;
    private int Array[]= {6547,68596,6547};
    
	public Nonprimitive(String ifade, int[] array) {
		
		this.ifade = ifade;
		Array = array;
	}
	public String getIfade() {
		return ifade;
	}
	public void setIfade(String ifade) {
		this.ifade = ifade;
	}
	public int[] getArray() {
		return Array;
	}
	public void setArray(int[] array) {
		Array = array;
	}
    
   public void stringiYazdýr(String ifade) {
    	
    	System.out.println("Stringiniz:" +ifade);
    	
    }
    
    void arrayiYazdýr(int a[]) {
    	System.out.println("Arrayiniz:" +a);
    }
}
