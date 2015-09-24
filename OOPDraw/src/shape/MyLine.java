package shape;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Line2D;

public class MyLine implements AbstractShape {
	
	private Line2D.Float line;

	public MyLine(Point p) {
		line = new Line2D.Float();
		setStart(p);
		setEnd(p);
	}
	
	@Override
	public void setStart(Point pt) {
		line.setLine(pt.getX(), pt.getY(), line.getX2(), line.getY2());
	}

	@Override
	public void setEnd(Point pt) {
		line.setLine(line.getX1(), line.getY1(), pt.getX(),  pt.getY());
	}

	@Override
	public void draw(Graphics g) {
		//g.setColor(Color.red);
		((Graphics2D) g).draw(line);
		
	}


}
