
public class Main {
    public static void main(String[] args) {
    	
    	//Soru3
    	int[] a = {1,2,3,4};
    	Nonprimitive Nonprimitive=new Nonprimitive("Ay�e",null);
    	
    	Integer Integer= new Integer(4,7,234,12332);
    	
    	FloatingPoint FloatingPoint= new FloatingPoint(34.5f,345.2);
    	
    	Integral Integral= new Integral(Integer, FloatingPoint);
    	
    	Character Character = new Character('D','A');
    	
    	Numeric Numeric=new Numeric(Character, Integral);
    	
    	Boolean Boolean=new Boolean(true, false);
    	
    	Primitive Primitive=new Primitive(Boolean, Numeric);
    	
    	DataType DataType=new DataType(Primitive, Nonprimitive);
    	
    	
		DataType.getNonprimitive().arrayiYazd�r(a);
		DataType.getPrimitive().getBoolean().BooleanYazd�r();
		DataType.getPrimitive().getNumeric().getCharacter().CharYazd�r();
		DataType.getPrimitive().getNumeric().getIntegral().getInteger().DegerleriYazd�r();
		DataType.getPrimitive().getNumeric().getIntegral().getFloatingPoint().FloatingPointYazd�r();
    }
}
