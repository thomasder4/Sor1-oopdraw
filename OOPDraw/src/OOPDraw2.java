
import java.awt.BasicStroke;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.JFrame;

import composer.LineComposer;
import composer.OvalComposer;
import composer.RectComposer;
import composer.ShapeComposer;
import shape.AbstractShape;

public class OOPDraw2 extends JFrame implements MouseListener, MouseMotionListener {

	private static final long serialVersionUID = 4695753453561082104L;
	private ShapeComposer currentComposer;
	private ArrayList<AbstractShape> shapes;
	
	
	

	public OOPDraw2() {
		shapes = new ArrayList<AbstractShape>();
		currentComposer = new LineComposer();
		initGUI();

			
		
	}
		
	

	@Override
	public void mouseClicked(MouseEvent arg0) {
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
	}

	@Override
	public void mousePressed(MouseEvent eventArgs) {
		shapes.add(currentComposer.create(new Point(eventArgs.getX(), eventArgs.getY())));
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		currentComposer.complete(new Point(arg0.getX(), arg0.getY()));
		repaint();
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		currentComposer.expand(new Point(arg0.getX(), arg0.getY()));
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
	}

	
	@Override
	public void paint(Graphics g) {
		
		BufferedImage bufferedImage = new BufferedImage(getSize().width, getSize().height, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2d = bufferedImage.createGraphics();
		
		RenderingHints hints = new RenderingHints(RenderingHints.KEY_ANTIALIASING,  RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setRenderingHints(hints);
			
		g2d.setColor(Color.black);
		g2d.fillRect(0, 0, getSize().width, getSize().height);
		g2d.setColor(new Color(255, 255, 255));
			g2d.fillRect(1, 1, getSize().width - 3, getSize().height - 3);
		g2d.setColor(Color.red);
		for (int i = 0; i < shapes.size(); i++) {
			AbstractShape sh =  shapes.get(i);
			sh.draw(g2d);
		}
		Graphics2D g2dComponent = (Graphics2D)g;
		g2dComponent.drawImage(bufferedImage, null, 0, 0);
	}

	private void initGUI() {
		setSize(800, 600);
		setTitle("Thomas OOPDraw");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);

		Button btnLine = new Button("Line");
		btnLine.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				currentComposer = new LineComposer();
			}
		});
		Button btnOval = new Button("Oval");
		btnOval.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				currentComposer = new OvalComposer();
			}
		});
		Button btnRect = new Button("Rectangle");
		btnRect.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				currentComposer = new RectComposer();
			}
		});
		Button btnClear = new Button("Clear");
		btnClear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				shapes.clear();
				repaint();
			}
		});
		add(btnLine);
		add(btnOval);
		add(btnRect);
		add(btnClear);
	}

	public static void main(String[] args) {
		OOPDraw2 frame = new OOPDraw2();
		frame.setVisible(true);
	}
}
