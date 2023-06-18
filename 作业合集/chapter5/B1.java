public class B1 {
	public static void main(String[] args) {
		double num1 = 34.5;
		double num2 = 2.6;
		if (num1 > 10.0 && num2 < 20.0) {
			System.out.println("两个数和=" + (num1 + num2));
			
		}

		int num3 = 10;
		int num4 = 5;
		int num5 = num3 + num4;
		if (num5 % 3 == 0 && num5 % 5 == 0) {
			System.out.println("能够被整除");

		} else {
			System.out.println("不能够被整除");

		}
		
		int year = 1000;
		//逻辑或
		if (year % 400 == 0) {
			System.out.println(year + "是闰年");
		} else {
			if (year % 4 == 0 && year % 100 != 0) {
				System.out.println(year + "是闰年");
			} else {
				System.out.println(year + "不是闰年");
			}
		}



	}
}