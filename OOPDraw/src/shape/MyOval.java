package shape;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

public class MyOval implements AbstractShape {
	private Ellipse2D.Float oval;
	private Point2D.Float startPoint, endPoint;
	
	public MyOval(Point2D.Float point) {
		oval = new Ellipse2D.Float();
		startPoint = new Point2D.Float(0, 0);
		endPoint = new Point2D.Float(0, 0);
		setStart(point);
	}

	@Override
	public void setStart(Point2D.Float point) {
		startPoint = point;
		oval.setFrame(point.getX(), point.getY(), endPoint.getX() ,endPoint.getY());
	}

	@Override
	public void setEnd(Point2D.Float point) {
		endPoint = point;
		oval.setFrameFromDiagonal(startPoint.getX(), startPoint.getY(), point.getX(), point.getY());
	}

	@Override
	public void draw(Graphics g) {
		((Graphics2D) g).draw(oval);
	}
	
	
}
