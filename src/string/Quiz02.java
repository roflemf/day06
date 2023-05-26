package string;

import java.util.ArrayList;

public class Quiz02 {
	  public static void main(String [] args){
//	      String str = new String("Have a nice day Have a nice day Have a nice day");
//	      int i=0;
//	      while(i < str.length()) {
//	         if(str.charAt(i) == 'a')
//	            System.out.print(i+", ");
//	         i++;
//	      }
		  
//		  String str = new String("It is a fun java programming");
//		  int i = 0;
//		  int a = 0, g = 0, c = 0;
//		  while(i < str.length()) {
//			  if(str.charAt(i) == 'a') 
//				  a++;
//			  else if(str.charAt(i) == 'g') 
//				  g++;
//			  i++;
//		  }
//			  System.out.println("총 개수: " + str.length());
//			  System.out.println("a 개수: " + a);
//			  System.out.println("g 개수: " + g);
	
		  String str = new String("tESt  sTring  change   first");
			String changeStr = new String();
			int i=0;

			str = str.toLowerCase();
			if(str.charAt(0) >='a' && str.charAt(0) <='z') {
				changeStr+=(char)(str.charAt(i)-32);
				i++;
			}
			while(i<str.length()) {
				if(str.charAt(i) != ' ') {
					changeStr+=str.charAt(i);
					i++;
					continue;
				}
				while(str.charAt(i) == ' ') {
					changeStr+=str.charAt(i);
					i++;
				}
				if(str.charAt(i) >= 'a' && str.charAt(i) <='z')
					changeStr+=(char)(str.charAt(i)-32);
				i++;
			}
			System.out.println(str);
			System.out.println(changeStr);
			System.out.println("종료");
		}
		  


	  }



