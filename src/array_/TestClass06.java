package array_;

import java.util.Scanner;

public class TestClass06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {10,54,13,17,25,30};
		String odd_even = null;
		System.out.println("짝수, 홀수 입력: ");
		odd_even = sc.next();
		
//		switch(odd_even) {
//		case "짝수":
//			for(int a : arr) {
//				if(a % 2 == 0) {
//					System.out.println("짝수: " + a);	
//				}
//			}
//			break;
//		case "홀수":
//			for (int a : arr) {
//				if (a % 2 != 0) {
//					System.out.println("홀수: " + a);
//				}
//			}
//			break;
//			default:
//				System.out.println("잘못입력");
//		}
		
		for(int num : arr) {
			if(odd_even.equals("짝수")) {
				if(num % 2 == 0) {
					System.out.println("짝수: " + num);
				}
			}else {
				if(num % 2!= 0) {
					System.out.println("홀수: " + num);
				}
			}
		}
	}
}
