
public class hw1 {
	public static void main(String[] args) {
		int xj = 100000;
		int count = 0;
		while(xj > 50000) {
			xj = (int) (xj * 0.95);
		    count = count + 1;
		}
		while(xj <= 50000) {
			xj = xj - 1000;
		    if (xj <= 0) {
		    	break ;
		    }
		    count = count + 1;
		}

		System.out.println("共经过"+count+"次路口");


		

	}
}