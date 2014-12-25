import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
/**
 * Klasa koja iscrtava krug, u zavisnosti od booleana isFilled iscratava popunjen ili prazan krug.
 * @author vedadzornic
 *
 */
public class Circle {

	private int x;
	private int y;
	private int radius;
	private boolean isFilled;
	private Color color;
	private int speedX;
	private int speedY;
	private Dimension windowDimension;
	private int temp;
	private int centerX;
	private int centerY;
	private int halfRadius;
	
	/**
	 * Constructor
	 * 
	 * @param x
	 * @param y
	 * @param radius
	 * @param isFilled
	 */
	public Circle(int x, int y, int radius, boolean isFilled,Color color, int speedX, int speedY, Dimension windowDimension) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.isFilled = isFilled;
		this.color = color;
		this.speedX=speedX;
		this.speedY=speedY;
		this.windowDimension=windowDimension;
		this.centerX = x+radius/2;
		this.centerY = y+radius/2;
		this.halfRadius = radius/2;
		
	}
	
	public void draw(Graphics g){
		
		move();
			
		g.setColor(color);
		if(isFilled == true)
		{
			g.fillOval(x, y, radius, radius);
		}
		else
		{
			g.drawOval(x, y, radius, radius);
		}
	}
	
	private void move(){
		
		if(x<0 || (x+radius)>=windowDimension.getWidth())
			speedX *= -1;
		if(y<0 || (y+radius+24)>=windowDimension.getHeight())//24 pixela razlika izmedju framea i panela.
			speedY *= -1;
		
				
		x=x + speedX;
		y=y+speedY;
	}
	/**
	 * Funkcija provjerava da li su se dvije loptice sudarile.
	 * @param other
	 */
	public void checkCollision(Circle other){
		int distance = Math.sqrt(                  );
		
		
	}
}
