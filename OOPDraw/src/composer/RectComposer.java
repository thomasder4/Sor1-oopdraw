package composer;
import java.awt.geom.Point2D;

import shape.AbstractShape;
import shape.MyRect;


public class RectComposer implements ShapeComposer {

	private MyRect rect;
	
	@Override
	public AbstractShape create(Point2D.Float point) {
		rect = new MyRect(point);
		return rect;
		
	}

	@Override
	public void expand(Point2D.Float point) {
		rect.setEnd(point);
	}

	@Override
	public void complete(Point2D.Float point) {
		rect.setEnd(point);
	}




	
}

// Class cRect ends
