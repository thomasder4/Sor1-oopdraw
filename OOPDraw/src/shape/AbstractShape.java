package shape;

import java.awt.Graphics;
import java.awt.geom.Point2D;

/**
 * base class AbstractShape
 *
 */
public interface AbstractShape
{
	public void setStart(Point2D.Float point);

	public void setEnd(Point2D.Float point);
	
	public void draw(Graphics g);

}

// Base class cShape ends
