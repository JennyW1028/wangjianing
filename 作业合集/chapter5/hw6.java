
public class hw6 {
	public static void main(String[] args) {
		//求出1-1/2+1/3-1/4......1/100
		double sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 != 0){
				sum = sum + 1.0/i;
			}
			if(i % 2 == 0){
				sum = sum - 1.0/i;
			}

		}
		System.out.println("总和为" + sum);
		

		//求出1+(1+2)+(1+2+3)+...+(1+2+3+...+100)
		int a = 0;
		int b = 0;
		for(int i = 1;i <= 100;i++){
			a = a + i;
			b = b + a;
		}
		System.out.println("结果为" + b);


			
	}
}