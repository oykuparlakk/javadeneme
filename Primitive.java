
public class Primitive {
    private Boolean Boolean;
    private Numeric Numeric;
    
    
	public Boolean getBoolean() {
		return Boolean;
	}
	public void setBoolean(Boolean b) {
		Boolean = b;
	}
	public Numeric getNumeric() {
		return Numeric;
	}
	public void setNumeric(Numeric numeric) {
		Numeric = numeric;
	}
	public Primitive(Boolean b, Numeric numeric) {
		
		Boolean = b;
		Numeric = numeric;
	}
    
}
