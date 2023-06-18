
public class kxjzt {
	public static void main(String[] args) {
		int n = 7;
		for(int i = 1; i <= n; i++) 
		if (i == 1) {
		    for(int j = 1; j <= n - i; j++){//空格
				System.out.print(" ");
		    }
		    System.out.print("*");
		    for(int j = 1; j <= n - i; j++){//空格
				System.out.print(" ");
		    }
		System.out.println("");

		}else if(i < n){
			for(int j = 1; j <= n - i; j++){//空格
				System.out.print(" ");
		    }
		    System.out.print("*");//星号
		    for(int j = 1; j <= i*2 - 3; j++){//空格
		        System.out.print(" ");
		    }
		    System.out.print("*");//星号
		    System.out.println("");
		}else{
		    for(int k = 1; k <= 2 * n - 1; k++){//空格
		        System.out.print("*");
		    }
		}

	}
}