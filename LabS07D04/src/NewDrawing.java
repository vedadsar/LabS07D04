import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;


public class NewDrawing extends JPanel implements ActionListener{
	int frame = 0;
	Circle ourCircle;
	Circle ourCircle2;
	Dimension windowSize;
	
	public NewDrawing (Dimension windowSize){
		 ourCircle = new Circle(100, 100, 100, true, Color.RED,5,2, windowSize);
		 ourCircle2 = new Circle(320,220, 70, false, Color.BLACK,-5,4, windowSize);
		this.windowSize = windowSize;
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		ourCircle.checkCollision(ourCircle2);
		ourCircle.draw(g);
		ourCircle2.draw(g);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame++;
		repaint();
		
	}

}
