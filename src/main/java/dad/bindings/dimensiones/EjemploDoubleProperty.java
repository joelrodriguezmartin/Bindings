package dad.bindings.dimensiones;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class EjemploDoubleProperty {

	public static void main(String[] args) {
		DoubleProperty a = new SimpleDoubleProperty(4);
		DoubleProperty b = new SimpleDoubleProperty(5);
		DoubleProperty c = new SimpleDoubleProperty();
		
		// o = observable Value, ov = old Value, nv = new Value
		a.addListener((o, ov, nv)->System.out.println("A antes valia "+ov+"y ahora vale "+nv));
		
		c.bind(a.multiply(b));
		c.addListener((o, ov, nv)->System.out.println("A antes valia "+ov+"y ahora vale "+nv));
		
		b.setValue(7);
		a.setValue(9);
	}

}
