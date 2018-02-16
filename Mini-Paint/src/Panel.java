import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class Panel extends JPanel implements MouseMotionListener, MouseListener{

	private int xcoor, ycoor;
	
	public Panel(){
		super();
		this.setBounds(200, 2, 590, 368);
		this.setBackground(Color.WHITE);
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		this.addMouseMotionListener(this);
		this.addMouseListener(this);
		
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		if(MiniPaint.option == 1 && !MiniPaint.moption){
			Graphics g3 = getGraphics();
			g3.setColor(MiniPaint.color);
			g3.fillOval(e.getX(), e.getY(), 10, 10);
			
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		if(MiniPaint.option == 1 && MiniPaint.moption){
			Graphics g3 = getGraphics();
			g3.setColor(MiniPaint.color);
			g3.fillOval(e.getX(), e.getY(), 10, 10);
		}
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e){
		xcoor = e.getX();
		ycoor = e.getY();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
		if(MiniPaint.option == 2 && !MiniPaint.foption){
			Graphics g = getGraphics();
			g.setColor(MiniPaint.color);
			g.drawOval(xcoor, ycoor, 70, 70);
		}
		if(MiniPaint.option == 2 && MiniPaint.foption){
			Graphics g = getGraphics();
			g.setColor(MiniPaint.color);
			g.fillOval(xcoor, ycoor, 70, 70);
		}
		if(MiniPaint.option == 3 && !MiniPaint.foption && xcoor < e.getX() && ycoor < e.getY()){
			Graphics g = getGraphics();
			g.setColor(MiniPaint.color);
			g.drawRect(xcoor, ycoor, e.getX() - xcoor, e.getY() - ycoor);
		}
		if(MiniPaint.option == 3 && MiniPaint.foption){
			Graphics g = getGraphics();
			g.setColor(MiniPaint.color);
			g.fillRect(xcoor, ycoor, e.getX() - xcoor, e.getY() - ycoor);
		}
		if(MiniPaint.option == 4 && !MiniPaint.foption){
			Graphics g = getGraphics();
			g.setColor(MiniPaint.color);
			g.drawOval(xcoor, ycoor, e.getX() - xcoor, e.getY() - ycoor);
		}
		if(MiniPaint.option == 4 && MiniPaint.foption){
			Graphics g = getGraphics();
			g.setColor(MiniPaint.color);
			g.fillOval(xcoor, ycoor, e.getX() - xcoor, e.getY() - ycoor);
		}
		if(MiniPaint.option == 5 && !MiniPaint.foption){
			Graphics g = getGraphics();
			g.setColor(MiniPaint.color);
			g.drawArc(xcoor, ycoor, e.getX() - xcoor, e.getY() - ycoor, 50, 160);
		}
		if(MiniPaint.option == 5 && MiniPaint.foption){
			Graphics g = getGraphics();
			g.setColor(MiniPaint.color);
			g.fillArc(xcoor, ycoor, e.getX() - xcoor, e.getY() - ycoor, 50, 160);
		}
	}
}
