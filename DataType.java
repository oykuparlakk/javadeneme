
public class DataType {
	
    private Primitive Primitive;
    private Nonprimitive Nonprimitive;
	public Primitive getPrimitive() {
		return Primitive;
	}
	public void setPrimitive(Primitive primitive) {
		Primitive = primitive;
	}
	public Nonprimitive getNonprimitive() {
		return Nonprimitive;
	}
	public void setNonprimitive(Nonprimitive nonprimitive) {
		Nonprimitive = nonprimitive;
	}
	public DataType(Primitive primitive, Nonprimitive nonprimitive) {
		
		Primitive = primitive;
		Nonprimitive = nonprimitive;
	}
    
    
    
    
}
