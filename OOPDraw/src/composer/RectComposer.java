package composer;
import java.awt.Point;

import shape.AbstractShape;
import shape.MyRect;


public class RectComposer implements ShapeComposer {

	private MyRect rect;
	
	@Override
	public AbstractShape create(Point p) {
		rect = new MyRect(p);
		return rect;
		
	}

	@Override
	public void expand(Point p) {
		rect.setEnd(p);
	}

	@Override
	public void complete(Point p) {
		rect.setEnd(p);
	}


	
}

// Class cRect ends
