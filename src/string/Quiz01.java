package string;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] id = new String[5];
		String[] pwd = new String[5];
		int num=0, i=0, cnt = 0;
		//cnt는 회원들 저장되는 개수(index)입니다
		//cnt가 0이면 현재 0명 그리고 0번째 index에 저장가능하다
		//cnt가 1이면 현재 1명 저장 그리고 1번째 index에 사용자 저장가능하다.
		String inputId=null, inputPwd=null;
		while(true) {
			System.out.println("1.로그인");
			System.out.println("2.회원가입");
			System.out.println("3.모든 회원보기");
			System.out.print(">>> : ");
			num = sc.nextInt();
			switch(num) {
			case 1:
				if(cnt == 0) {
					System.out.println("회원가입 먼저 하세요!!");
					break;
				}
				System.out.print("비교 id 입력 : ");
				inputId = sc.next();
				System.out.print("비교 pwd 입력 : ");
				inputPwd = sc.next();
				i=0;
				while(i<cnt) {//i=0 < cnt는 저장되어 있는 수(index는 0부터시작 그러므로 cnt보다 작을 때까지)
					if(inputId.equals(id[i])) { //아이디가 일치한다면 존재하는 회원
						if(inputPwd.equals(pwd[i])) {//아이디가 일치하므로 비밀번호 확인
							System.out.println("인증통과!!");
						}else {
							System.out.println("비밀번호 틀림");
						}
						break;
					}
					i++;//if실행 되지 않는 경우 i를 1증가하여 id[i]다음 번과 비교
				}
				//i를 증가하다 while(i<cnt)을 통해 조건이 거짓이 되었다는 것은 i와 cnt가 같아지면 조건이 거짓이 된다
				//만약 while의 조건이 거짓이 아니고 if문의 break를 통해 while를 빠져나오면 i는 cnt보다 무조건 작은 값을 가지게 된다
				//아래 if문은 두 값이 같다는 것은 while의 조건이 거짓일 경우가 되는 것이며, 조건이 거짓이라는 것은 cnt의 개수만큼 즉,
				//모든 회원을 비교했을때 일치하는 id를 가진 회원이 없다는 의미가 되므로 i==cnt이면 존재하지 않는 id가 된다
				if(i == cnt) {
					System.out.println("존재하지 않는 id입니다");
				}
				break;
			case 2:
				if( cnt == id.length ) {
					System.out.println("저장 공간이 없습니다!!");
					break;
				}
				while(true) {
					System.out.println("저장할 id 입력 : ");
					inputId = sc.next();
					for(i=0 ; i<cnt ; i++) {
						//존재하는 아이디라면 break를 통해 빠져나간다
						//break를 통해 빠져나가면 i값은 cnt값보다 작은 값을 가지게 된다.
						//결국 i가 cnt보다 작다면 존재하는 id가 되는 것이다.
						if(inputId.equals(id[i])) { 
							break;
						}
					}
					//i가 cnt와 같아지는 경우는 for문의 i<cnt 조건이 거짓인 경우 빠져나오게 된다.
					//조건이 거짓이 되었다는 것은 id[i]의 모든 값과 사용자가 입력한 값이 일치하지 않는 경우 같아진다.
					//일치하지 않다는 것은 회원가입이 가능한 아이디라는 것이다.
					if(i == cnt) {
						break;
					}
					System.out.println("존재하는 id입니다.");
					System.out.println("다시 입력 ... ");
				}
				System.out.println("저장할 pwd 입력 : ");
				inputPwd = sc.next();
				//cnt값은 index로 사용하며 회원가입이 되면 cnt값은 1증가하게 된다
				id[cnt] = inputId;
				pwd[cnt] = inputPwd;
				System.out.println("등록 되었습니다!");
				cnt++;
				break;
			case 3:
				if(cnt == 0) {
					System.out.println("저장된 정보가 없습니다");
					break;
				}
				System.out.println("id\tpassword");
				System.out.println("----------------");
				for(i=0 ; i < cnt ; i++) {
					System.out.println(id[i]+"\t"+pwd[i]);
				}
				System.out.println("----------------");
				break;
			default: System.out.println("잘못입력..");
			}
		}
	}
}
