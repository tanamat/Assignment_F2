import java.awt.Color;
import java.awt.Graphics2D;

public class SpaceShip extends Sprite{

	int step = 8;

	public SpaceShip(int x, int y, int width, int height){
		super(x, y ,width, height); // call from super class
	}
	@Override	// draw a spaceship
	public void draw(Graphics2D g){

		g.setColor(Color.PINK);
		g.fillRect(x,y,width,height);
	
	}
	public void move(int direction){ // move spaceship in a frame
		x += (step * direction);
			if(x < 0)
				x= 0;
			if(x > 400 - width)
				x = 400 - width;
	}
}
