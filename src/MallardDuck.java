import java.awt.Color;
import java.awt.Graphics;

public class MallardDuck extends Duck implements Quackable, Flyable {

	@Override
	public void display(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillOval(x, y, Duck.SIZE, Duck.SIZE);

	}

	@Override
	public void fly(Graphics g) {

		g.setColor(Color.BLUE);
		g.drawString("³¯´Ù", x -Duck.SIZE , y + Duck.SIZE);
	}

	@Override
	public void quack(Graphics g) {

		g.setColor(Color.BLUE);
		g.drawString("²Ð²Ð", x + Duck.SIZE,  y + Duck.SIZE-25);
	}
}
