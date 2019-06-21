import java.awt.Graphics;
import java.util.Random;

public abstract class Duck {
	protected int x;
	protected int y;
	
	public static final int SIZE = 30;
	
	public Duck(){
		Random rnd = new Random();
		
		//MyFrame f = new MyFrame(); 을 선언한다면 Duck 하나당 한개의 프레임이 띄워진다.
		
		x = rnd.nextInt(MyFrame.FRAME_WIDTH-100) + 50; //0~800로 설정하면 화면에서 벗어나는 경우가 생김, 50~750정도로 설정하는게 좋음.
		y = rnd.nextInt(MyFrame.FRAME_HEIGHT-140) + 70; //70~530 일부러 계산한값을 넣지 않았음.
		
	}
	public Duck(int x, int y){
		this.x = x;
		this.y = y; 
		
	}
	public void swim(Graphics g){
		g.drawString("수영", x-20, y+Duck.SIZE-25);
		
	}
	public abstract void display(Graphics g);
}
