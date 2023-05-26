package array_;

public class TestClass05 {
	public static void main(String[] args) {
		int arr[] = new int[] {10,54,13,17,25,30};
		
		for(int i = 0; i < arr.length; i++) {
			
			if (arr[i] % 2 == 0) {
				System.out.println("짝수: " + arr[i]);
			}else {
				System.out.println("홀수: " + arr[i]);
			}
		}
		System.out.println("-------------------------");
		
		for(int a : arr) {
			if(a % 2 == 0) {
				System.out.println("짝수: " + a);
			}else
				System.out.println("홀수: " + a);
		}
		
		
	}
}
