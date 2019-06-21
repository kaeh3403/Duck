import java.awt.Color;
import java.awt.Graphics;

public class RedDuck extends Duck implements Quackable, Flyable {

	@Override
	public void display(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(x, y, Duck.SIZE, Duck.SIZE);

	}

	@Override
	public void fly(Graphics g) {

		g.setColor(Color.RED);
		g.drawString("³¯´Ù", x -Duck.SIZE , y + Duck.SIZE);
	}

	@Override
	public void quack(Graphics g) {

		g.setColor(Color.RED);
		g.drawString("²Ð²Ð", x + 25, y + Duck.SIZE - 25);

	}
}
