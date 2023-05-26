package array_;

public class TestClass02 {
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		int[] arr1 = new int[]{100,200,300,400};
		
		System.out.println("arr: " + arr.length);
		System.out.println("arr1: " + arr1.length);
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(i + ": " + arr[i]);
		}
	}
}
