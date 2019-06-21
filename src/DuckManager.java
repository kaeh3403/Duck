import java.awt.Graphics;
import java.util.Random;

public class DuckManager {

	Duck[] arr = new Duck[4];

	public DuckManager() {
		makeDucks();

	}

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
	
	public void displayAllDucks(Graphics g){
		for(int i=0;i<arr.length;i++){
			arr[i].display(g);
		}
	}
	
}
