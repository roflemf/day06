package array_;

public class TestClass01 {
	public static void main(String[] args) {
		/*
		 배열 
		 - 같은 자료형으로 여러개의 공간을 만들어 사용하는 것
		 - 자료형 [] 배열명 = new 자료형[];
		 - 배열 접근시 index를 사용하며, index는 0부터 시작 
		 */
		int[] arr = new int[5];
//		int[] arr2 = new int[] {1, 2, 3};
//		int[] arr3 = {1, 2, 3};
		//System.out.println(arr[0]);
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		arr[4] = 500;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println("===========");
		
//		//for문으로 출력하기
//		for(int i=0 ; i<arr.length ; i++) {
//			System.out.println(i+": "+arr[i]);
//		}
	}
}
