public class break1 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum = sum + i;
			if(sum > 20) {
				System.out.println("和>20时，当前数为" + i);
				break;

			}
		}

	}
}