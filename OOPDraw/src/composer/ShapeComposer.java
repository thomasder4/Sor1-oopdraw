package composer;
import java.awt.Point;

import shape.AbstractShape;

public interface ShapeComposer {
	public AbstractShape create(Point p);
	public void expand(Point p);
	public void complete(Point p);
}
