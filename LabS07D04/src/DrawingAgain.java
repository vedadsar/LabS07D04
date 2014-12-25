import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;


public class DrawingAgain extends JPanel implements ActionListener{
	
	int frame; 
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.CYAN);
		g.fillOval(50+frame, 50+frame, 50, 50);
		
	}
	
	public void rectDraw ( Graphics g){
		g.fillRect(100, 100, 100, 100);
	}
	
	public static void main(String[] args) {
		JFrame window = new JFrame("Our window");
		window.setSize(500, 500);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		
		NewDrawing drawingPanel = new NewDrawing(window.getSize());
		window.setContentPane(drawingPanel);
		
		Timer t = new Timer(50, drawingPanel);
		t.start();
		window.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame++;
		repaint();
		
	}

}
