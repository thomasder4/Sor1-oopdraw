package shape;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Ellipse2D;

public class MyOval implements AbstractShape {
	private Ellipse2D.Float oval;
	private Point startPoint, endPoint;
	
	public MyOval(Point p) {
		oval = new Ellipse2D.Float();
		startPoint = new Point(0, 0);
		endPoint = new Point(0, 0);
		setStart(p);
	}

	@Override
	public void setStart(Point pt) {
		startPoint = pt;
		oval.setFrame(pt.getX(), pt.getY(), endPoint.getX() ,endPoint.getY());
	}

	@Override
	public void setEnd(Point pt) {
		endPoint = pt;
		oval.setFrameFromDiagonal(startPoint.getX(), startPoint.getY() ,pt.getX() ,pt.getY());
	}

	@Override
	public void draw(Graphics g) {
		//g.setColor(Color.green);
		((Graphics2D) g).draw(oval);
	}
	
	
}
