package composer;
import java.awt.geom.Point2D;

import shape.AbstractShape;
import shape.MyLine;


public class LineComposer implements ShapeComposer {
	
	private MyLine line;
	
	@Override
	public AbstractShape create(Point2D.Float point) {
		line = new MyLine(point);
		return line;
	}

	@Override
	public void expand(Point2D.Float point) {
		line.setEnd(point);
	}

	@Override
	public void complete(Point2D.Float point) {
		line.setEnd(point);
	}

}

