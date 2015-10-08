package shape;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class MyLine implements AbstractShape {
	
	private Line2D.Float line;

	public MyLine(Point2D.Float point) {
		line = new Line2D.Float();
		setStart(point);
		setEnd(point);
	}
	
	@Override
	public void setStart(Point2D.Float point) {
		line.setLine(point.getX(), point.getY(), line.getX2(), line.getY2());
	}

	@Override
	public void setEnd(Point2D.Float point) {
		line.setLine(line.getX1(), line.getY1(), point.getX(), point.getY());
	}

	@Override
	public void draw(Graphics g) {
		//g.setColor(Color.red);
		((Graphics2D) g).draw(line);
		
	}


}
