
import java.awt.Color;
import java.awt.Graphics2D;

public class SpaceShip extends Sprite{

	int step = 8;
	
	public SpaceShip(int x, int y, int width, int height) {
		super(x, y, width, height);
		
	}

	@Override
	public void draw(Graphics2D g) {
		g.setColor(Color.PINK);
		g.fillRect(x, y, width, height);
		g.setColor(Color.RED);
		g.fillRect(x+5, y-5, width-10, height);
		g.setColor(Color.WHITE);
		g.fillRect(x+10, y-10, width-20, height);
		
		
	}

	public void move(int direction){
		x += (step * direction);
		if(x < 0)
			x = 0;
		if(x > 400 - width)
			x = 400 - width;
	}

}
