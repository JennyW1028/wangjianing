//引入Scanner所在的包
import java.util.Scanner;
public class break2 {
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		String name = "";
		String passwd = "";
		int chance = 3;//登陆一次，减少一次
		for(int i = 1; i <= 3; i++) {
			System.out.println("请输入名字");
			name = myScanner.next();
			System.out.println("请输入密码");
			passwd = myScanner.next();
			//比较输入的名字和密码是否正确
			if("顶针".equals(name) && "666".equals(passwd)) {
				System.out.println("恭喜你，登录成功~");
				break;
			}
			chance--;
			System.out.println("你还有"+chance+"次登录机会");


		}

	}
}