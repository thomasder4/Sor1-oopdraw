package composer;
import java.awt.geom.Point2D;

import shape.AbstractShape;

public interface ShapeComposer {
	public AbstractShape create(Point2D.Float point);
	public void expand(Point2D.Float point);
	public void complete(Point2D.Float point);
}
