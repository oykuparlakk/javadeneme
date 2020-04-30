
public class Boolean {
	private boolean dogruDeger;
    private boolean yanlisDeger;
	public boolean isDogruDeger() {
		return dogruDeger;
	}
	public void setDogruDeger(boolean dogruDeger) {
		this.dogruDeger = dogruDeger;
	}
	public boolean isYanlisDeger() {
		return yanlisDeger;
	}
	public void setYanlisDeger(boolean yanlisDeger) {
		this.yanlisDeger = yanlisDeger;
	}
	public Boolean(boolean dogruDeger, boolean yanlisDeger) {
		
		this.dogruDeger = dogruDeger;
		this.yanlisDeger = yanlisDeger;
	}
    
    public void BooleanYazdýr() {
    	
    	System.out.println("Boolean Dogru: " + dogruDeger);
        System.out.println("Boolean Yanlis: " + yanlisDeger);
    	
    	
    }
}
