package array_;

import java.util.Scanner;

public class TestClass07 {
	public static void main(String[] args) {
		 
//		for(int i=0; i<5; i = i + 2) {
//			System.out.println(i);
//		}
		
		
		Scanner sc = new Scanner(System.in);
		int arr[] = {10,54,13,17,25,30};
		String odd_even = null;
		System.out.println("짝수, 홀수 입력: ");
		odd_even = sc.next();
		/*
		 짝수 입력시: index가 짝수 번째인값 출력 
		 홀수 입력시: index가 홀수 번째인값 출력 
		 */
//		if(odd_even.equals("짝수")) {
//			for(int i = 0; i < arr.length; i +=2) {
//				System.out.println(i + "index 짝수: " + arr[i]);
//			
//			}
//		}else {
//			for(int i = 1; i < arr.length; i += 2) {
//				System.out.println(i + "index 홀수: " + arr[i]);
//			}
//		}
		
		for(int i = 0; i<arr.length; i++) {
			if(odd_even.equals("짝수")) {
				if(i%2 == 0)
				System.out.println(i + ": " + arr[i]);
			}else {
				if(i%2 != 0) {
					System.out.println(i + ": " + arr[i]);
				}
			}
		}
		
		System.out.println("-----------------------------------");
		
		String s = odd_even.equals("짝수") ? "1111" : "2222";
		System.out.println( s );
		System.out.println("-----------------------------------");
	
		
		int i = odd_even.equals("짝수") ? 0 : 1;
		for(; i < arr.length; i +=2) {
			System.out.println(i + ": " + arr[i]);
		}
	}
}




























