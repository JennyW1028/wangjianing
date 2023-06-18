public class dowhile2 {
	public static void main(String[] args) {
		int i = 1;
		int j = 0;
		do {
			if (i % 5 == 0 && i % 3 != 0) {
				j++;
			}
			
			i++;
		}while (i <= 200);
		System.out.println(j);
	}
}