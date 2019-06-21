import java.awt.Graphics;
import java.util.Random;

public abstract class Duck {
	protected int x;
	protected int y;
	
	public static final int SIZE = 30;
	
	public Duck(){
		Random rnd = new Random();
		
		//MyFrame f = new MyFrame(); �� �����Ѵٸ� Duck �ϳ��� �Ѱ��� �������� �������.
		
		x = rnd.nextInt(MyFrame.FRAME_WIDTH-100) + 50; //0~800�� �����ϸ� ȭ�鿡�� ����� ��찡 ����, 50~750������ �����ϴ°� ����.
		y = rnd.nextInt(MyFrame.FRAME_HEIGHT-140) + 70; //70~530 �Ϻη� ����Ѱ��� ���� �ʾ���.
		
	}
	public Duck(int x, int y){
		this.x = x;
		this.y = y; 
		
	}
	public void swim(Graphics g){
		g.drawString("����", x-20, y+Duck.SIZE-25);
		
	}
	public abstract void display(Graphics g);
}
