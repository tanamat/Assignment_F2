import java.awt.BorderLayout;
import javax.swing.JFrame;

public class Main{
	public static void main(String[] args){
		JFrame frame = new JFrame("Space War");				// create a windows name Space War
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,650);								// Set size of windows
		frame.getContentPane().setLayout(new BorderLayout());	

		SpaceShip v = new SpaceShip(180, 550, 20, 20); // x,y,width,height
		GamePanel gp = new GamePanel();
	
		frame.getContentPane().add(gp, BorderLayout.CENTER);
		frame.setVisible(true);
	}
}
