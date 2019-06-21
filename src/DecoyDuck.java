import java.awt.Color;
import java.awt.Graphics;

public class DecoyDuck extends Duck{

	@Override
	public void display(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillOval(x, y, Duck.SIZE, Duck.SIZE);
		
	}
}
