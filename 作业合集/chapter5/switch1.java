//引入Scanner所在的包
import java.util.Scanner;
public class switch1 {
	public static void main(String[] args) {
		//创建scanner对象，new创建一个对象
		Scanner myScanner = new Scanner(System.in);
		//接收用户输入
		System.out.println("请输入字母");
		char c = myScanner.next().charAt(0);

		switch(c){
		    case 'a' :
			    System.out.println('A');
			    break;
		    case 'b' :
			    System.out.println('B');
			    break;
            case 'c' :
			    System.out.println('C');
			    break; 
			default :
				System.out.println("你的输入有误~");

		}
		

	}
}