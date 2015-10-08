package composer;
import java.awt.geom.Point2D;

import shape.AbstractShape;
import shape.MyOval;


public class OvalComposer implements ShapeComposer {
	 
	private MyOval oval;

	@Override
	public AbstractShape create(Point2D.Float point) {
		oval = new MyOval(point);
		return oval;
	}

	@Override
	public void expand(Point2D.Float point) {
		oval.setEnd(point);
		
	}

	@Override
	public void complete(Point2D.Float point) {
		oval.setEnd(point);
	}

	
}

// Class cOval ends
