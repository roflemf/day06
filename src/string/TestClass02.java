package string;

public class TestClass02 {
	public static void main(String[] args) {
		String str = new String("test");
		String str2 = "test";
		
		System.out.println(str);
		System.out.println(str2);
		
		String id = "aaa   "; 
		String inputId = "aaa";
		System.out.println(id.equals(inputId));
		System.out.println(id + ".");
		System.out.println(inputId + ".");
		System.out.println(id.trim() + ".");
		
		String addr = "051421/서울특별시 특별시/101-914 ";
		String[] addrs = addr.split("/");
		for(String s : addrs) {
			System.out.println(s);
		}
		
		String repl = addr.replace("/", "==>");
		System.out.println(repl);
	}
}
