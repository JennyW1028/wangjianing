public class dowhile1 {
	public static void main(String[] args) {
		int i = 1;
		int j = 0;
		do {
			System.out.println(i);
			j = j + i;
			i++;
		}while (i <= 100);
		System.out.println(j);
	}
}