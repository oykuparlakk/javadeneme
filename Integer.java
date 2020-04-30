
public class Integer {
	private byte byteDeger;
    private short shortDeger;
    private int integerDeger;
    private long longDeger;
    
    
    
	public Integer(byte byteDeger, short shortDeger, int integerDeger, long longDeger) {
		this.byteDeger = byteDeger;
		this.shortDeger = shortDeger;
		this.integerDeger = integerDeger;
		this.longDeger = longDeger;
	}
	public byte getByteDeger() {
		return byteDeger;
	}
	public void setByteDeger(byte byteDeger) {
		this.byteDeger = byteDeger;
	}
	public short getShortDeger() {
		return shortDeger;
	}
	public void setShortDeger(short shortDeger) {
		this.shortDeger = shortDeger;
	}
	public int getIntegerDeger() {
		return integerDeger;
	}
	public void setIntegerDeger(int integerDeger) {
		this.integerDeger = integerDeger;
	}
	public long getLongDeger() {
		return longDeger;
	}
	public void setLongDeger(long longDeger) {
		this.longDeger = longDeger;
	}
    
   public void DegerleriYazdýr() {
    	
    	 System.out.println("Byte Deðer: " + byteDeger);
         System.out.println("Short Deðer: " + shortDeger);
         System.out.println("Integer Deðer: " + integerDeger);
         System.out.println("Long Deðer: " + longDeger);
    	
    	
    }
    
    
    
}
