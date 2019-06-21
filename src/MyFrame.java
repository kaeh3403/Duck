import java.awt.Frame;
import java.awt.Graphics;
import java.util.Random;

public class MyFrame extends Frame {

	public static final int FRAME_WIDTH = 800;
	public static final int FRAME_HEIGHT = 600;
	int count = 4;

	// �����迭
	Duck[] arr = new Duck[count];

	public MyFrame() {
		super(); // new Frame()

		makeDucks();
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setVisible(true);
	}

	// MallardDuck[] mdArr = new MallardDuck[5]; �� �迭�� �ּҸ� ����Ǿ��⶧���� ���� ���� null�� �ȴ�.
	// �� �迭 �ȿ� ���� ���������ʾ� �� ���� �Ҵ����־�� �Ѵ�. (makeDucks()���� �Ҵ��Ͽ���.)
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
			 * //upcasting(�ڽ��� �θ�� ����ȯ)
			 * 
			 * Arr[i] = new MallardDuck();
			 */

		}
	}

	@Override // ������ �״�� ����Ѵٸ� ������ �ʿ� ����.
	// Graphics g �� ������ �����ؾ� ���氡��, �ٸ� g �� �ƿ� �ٸ� �ǹ���.
	// ���� md.display(g) �� �ϴµ� md�� g��� Ű�� ������ �׸��� �׸�.
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
