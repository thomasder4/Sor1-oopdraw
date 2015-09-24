package composer;
import java.awt.Point;

import shape.AbstractShape;
import shape.MyOval;


public class OvalComposer implements ShapeComposer {
	 
	private MyOval oval;

	@Override
	public AbstractShape create(Point p) {
		oval = new MyOval(p);
		return oval;
	}

	@Override
	public void expand(Point p) {
		oval.setEnd(p);
		
	}

	@Override
	public void complete(Point p) {
		oval.setEnd(p);
	}

	
}

// Class cOval ends
