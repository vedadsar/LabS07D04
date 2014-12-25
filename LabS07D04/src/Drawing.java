import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
/**
 * Klasa u kojoj cemo vjezbati crtanje i GUI opcenito.
 * @author vedadzornic
 *
 */

public class Drawing extends JPanel implements ActionListener{

	int frame;
	
	public static void main(String[] args) {
		JFrame window = new JFrame("Our test window");
		// Defnisemo frame.
		window.setSize(500, 500);
		window.setResizable(false);
		window.setLocation(725, 250);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Pravimo nas panel.
		Drawing drawingPanel = new Drawing();	// Novi objekat klase Drawing
		window.setContentPane(drawingPanel);	// Postavljamo sadrzaj naseg framea ( okvira )
		drawingPanel.repaint(); 				// pozivamo repaint metodu da "iscrta" ono sto smo nacrtali
		
		Timer t = new Timer(100, drawingPanel); // Timer koji nam sluzi da pomjeramo nas crtez. Timer pravi evente a actionListener registruje te evente.
		t.start();								// Pocetak timera
		
		window.setVisible(true);				// postavljamo da je vidljivo na kraju!
	}
	
	/**
	 * Override funkcije paintComponent iz JPanela i pravimo nas paintComponent. (Crtamo krug)
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	public void paintComponent(Graphics g){
		super.paintComponent(g);				//Nasljedjuemo iz super clase paintComopnent
		g.setColor(Color.CYAN);					//Postavimo boju na crnu
		g.fillOval(50+frame, 50+frame, 50, 50);	// Crtamo krug na poziciju 50, 50.
		nestoNesto(g);
		
	}
	
	/**
	 * Nova funkcija za crtanje koj cemo pozvatu u paintComponent. Radi ljepseg koda.
	 * @param g
	 */
	public void nestoNesto(Graphics g){
		g.setColor(Color.CYAN);
		g.fillRect(100, 100, 100, 100);
	}
	
	
	@Override 
	public void actionPerformed(ActionEvent e) {
		frame++;	// povecavamo frame
		repaint();  // repaint za novu sliku
	}
	
	
}
