package test;

import java.util.Scanner;

public class TestOfSwitch {

	public static void main(String[] args) {

		System.out.println("请输入一个1~7的整数！");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		switch (a) {
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		case 7:
			System.out.println("星期日");
			break;
		default:
			System.out.println("请输入正确的数字！");
			break;
		}
	}
}
