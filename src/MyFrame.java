import java.awt.Frame;
import java.awt.Graphics;
import java.util.Random;

public class MyFrame extends Frame {

	public static final int FRAME_WIDTH = 800;
	public static final int FRAME_HEIGHT = 600;
	int count = 4;

	// 정적배열
	Duck[] arr = new Duck[count];

	public MyFrame() {
		super(); // new Frame()

		makeDucks();
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setVisible(true);
	}

	// MallardDuck[] mdArr = new MallardDuck[5]; 는 배열의 주소만 선언되었기때문에 간의 값은 null이 된다.
	// 각 배열 안에 값이 존재하지않아 그 값을 할당해주어야 한다. (makeDucks()에서 할당하였다.)
	private void makeDucks() {
		Random rnd = new Random();
		if (arr != null) {

			for (int i = 0; i < arr.length; i++) {
				int type = rnd.nextInt(4);

				switch (type) {
				case 0:
					arr[i] = new MallardDuck();
					break;
				case 1:
					arr[i] = new RedDuck();
					break;
				case 2:
					arr[i] = new RubberDuck();
					break;
				case 3:
					arr[i] = new DecoyDuck();
					break;

				default:
					break;
				}
			}

			/*
			 * if(Arr!=null){ for (int i = 0; i < Arr.length; i++) {
			 * //upcasting(자식이 부모로 형변환)
			 * 
			 * Arr[i] = new MallardDuck();
			 */

		}
	}

	@Override // 색상을 그대로 사용한다면 선언할 필요 없음.
	// Graphics g 를 가지고 설정해야 변경가능, 다른 g 는 아예 다른 의미임.
	// 따라서 md.display(g) 를 하는데 md가 g라는 키를 가지고 그림을 그림.
	public void paint(Graphics g) {
		if(arr != null) {
			for (int i = 0; i < arr.length; i++) {
				arr[i].display(g);
				arr[i].swim(g);
				
				if(arr[i] instanceof Quackable){
					((Quackable) arr[i]).quack(g);

				}if(arr[i] instanceof Flyable){
					((Flyable) arr[i]).fly(g);
					
					
				}
		
		/*if (arr != null) {

			for (int i = 0; i < arr.length; i++) {
				if (arr != null) {

					arr[i].swim(g);
					arr[i].display(g);

					((MallardDuck) arr[i]).quack(g);
					((MallardDuck) arr[i]).fly(g);
*/
				}
			}
		

	}
}
