package shape;

import java.awt.Graphics;
import java.awt.Point;

/**
 * base class AbstractShape
 *
 */
public interface AbstractShape
{
	public void setStart(Point pt);

	public void setEnd(Point pt);
	
	public void draw(Graphics g);

}

// Base class cShape ends
