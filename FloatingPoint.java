
public class FloatingPoint {
	private float floatDeger;
    private double doubleDeger;
	public FloatingPoint(float floatDeger, double doubleDeger) {
		
		this.floatDeger = floatDeger;
		this.doubleDeger = doubleDeger;
	}
	public float getFloatDeger() {
		return floatDeger;
	}
	public void setFloatDeger(float floatDeger) {
		this.floatDeger = floatDeger;
	}
	public double getDoubleDeger() {
		return doubleDeger;
	}
	public void setDoubleDeger(double doubleDeger) {
		this.doubleDeger = doubleDeger;
	}
    
   public void FloatingPointYazdýr() {
    	
    	 System.out.println("Float Deger: " + floatDeger);
         System.out.println("Double Deger: " + doubleDeger);
    	
    }
    
}
