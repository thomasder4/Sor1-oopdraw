package shape;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class MyRect implements AbstractShape {
	
	private Rectangle2D.Float rect;
	private Point2D.Float startPoint, endPoint;
	
	public MyRect(Point2D.Float p) {
		rect = new Rectangle2D.Float();
		endPoint = new Point2D.Float(0, 0);
		setStart(p);
	}

	@Override
	public void setStart(Point2D.Float point) {
		startPoint = point;
		rect.setRect(point.getX(), point.getY(), endPoint.getX(), endPoint.getY());
	}

	@Override
	public void setEnd(Point2D.Float point) {
		endPoint = point;
		rect.setFrameFromDiagonal(startPoint, point);
		
	}

	@Override
	public void draw(Graphics g) {
		((Graphics2D) g).draw(rect);
	}

}
