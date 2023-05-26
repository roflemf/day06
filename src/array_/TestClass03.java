package array_;

import java.util.Scanner;

public class TestClass03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] str = new String[3];
		
		for(int i = 0; i < str.length; i++) {
			System.out.println(i + ".번째 입력");
			str[i] = sc.next();
		}
		for(int i = 0; i <str.length; i++) {
			System.out.println(i + ".name:  " + str[i]);
		}
	}
}
