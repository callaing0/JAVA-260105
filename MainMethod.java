package MainMethod;

import java.util.Scanner;

public class MainMethod {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// @@ 정수값으로 변경
		// int num = Integer.parseInt(Math.random()*10);
		
		//-------------------------------------------------
		
		// @@ 소수점 자르기
		// int num = (int)Math.floor(Math.random()*10)+1;
		// System.out.println(num);
		
		//-------------------------------------------------
		
		// @@ 동전의 앞면 뒷면 맞추기
		
		// 1은 앞면, 2는 뒷면
		//int coin = (int)Math.floor(Math.random()*2)+1;
		
		//System.out.println("동전 앞면 뒷면 맞추기");
		//System.out.print("앞면 1번, 뒷면 2번 \n 입력하시오 : ");
		
		//int user = sc.nextInt();
		
		//if(user == coin) {
		//	System.out.println("맞추기 성공!");
		//} else {
		//	System.out.println("맞추기 실패!");
		//}
		
		//-------------------------------------------------
		
		// @@ 주사위 맞추기
		
		//int dice = (int)Math.floor(Math.random()*6)+1;
		
		//System.out.println("주사위 숫자 맞추기");
		//System.out.print("주사위 숫자를 입력하시오(1 ~ 6) : ");
		
		//int num = sc.nextInt();
		
		//if(num == dice) {
		//	System.out.println("주사위 숫자는 "+dice+", 맞추기 성공!");
		//}  else {
		//	System.out.println("주사위 숫자는 "+dice+", 맞추기 실패!");
		//}
		
		//-------------------------------------------------
		
		// @@ 컴퓨터와 나의 주사위 숫자 대결
		// @@ 단, 주사위 숫자 1은 6을 이길 수 있다
		
		//int dice = (int)Math.floor(Math.random()*6)+1;
		
		
		//System.out.println("주사위 숫자 대결");
		//System.out.println("내 주사위 숫자를 입력하세요(1 ~ 6) : ");
		//int num = sc.nextInt();
		
		
		// 내 주사위 숫자가 큰 숫자일 경우와 주사위 숫자 1은 6을 이길 수 있다의 경우 
		
		//if (num > dice || (num == 1 && dice == 6)) {
		//	if (num == 6 && dice == 1) {
		//		System.out.println("컴퓨터 주사위 : "+dice+" , 내 주사위 : "+num);
		//		System.out.println("주사위 싸움에서 졌습니다.");
		//	} else {
		//		System.out.println("컴퓨터 주사위 : "+dice+" , 내 주사위 : "+num);
		//		System.out.println("주사위 싸움에서 이겼습니다!");
		//	}
			
		
		// 그 외 조건	
		
		//} else if (num == dice) {
		//	System.out.println("컴퓨터 주사위 : "+dice+" , 내 주사위 : "+num);
		//	System.out.println("주사위 싸움에서 비겼습니다");
		//} else  {
		//	System.out.println("컴퓨터 주사위 : "+dice+" , 내 주사위 : "+num);
		//	System.out.println("주사위 싸움에서 졌습니다.");	
		//}
		
		
		//-------------------------------------------------
		
		// [중요] @@ 컴퓨터와 함께하는 가위바위보 게임
		// @@ 1은 가위, 2는 바위, 3은 보
		
		// int rps = (int)Math.floor(Math.random()*3)+1;
		
		// System.out.println("가위바위보 대결");
		// System.out.print("가위바위보를 입력하세요(가위는 1번, 바위는 2번, 보는 3번) : ");
		
		// int num = sc.nextInt();		
		
		// ## 방법 1번 (직접 비교)
		
		// if (num == rps) {
		//	System.out.println("컴퓨터의 가위바위보 : "+rps+" , 나의 가위바위보 : "+num);
		//	System.out.println("가위바위보 대결에서 비겼습니다");
		//} else if ((num == 1 && rps == 3) || (num == 2 && rps == 1) || (num == 3 && rps == 2)) {			
		//	System.out.println("컴퓨터의 가위바위보 : "+rps+" , 나의 가위바위보 : "+num);
		//	System.out.println("가위바위보 대결에서 이겼습니다");
		//} else  {
		//	System.out.println("컴퓨터의 가위바위보 : "+rps+" , 나의 가위바위보 : "+num);
		//	System.out.println("가위바위보 대결에서 졌습니다");
		//} 
		
		
		// ## 방법 2번 (값 차이로 비교)_교수님 풀이
		
		// int sum = num-rps;
		
		// if (sum == 0 ) {
		//	System.out.println("컴퓨터의 가위바위보 : "+rps+" , 나의 가위바위보 : "+num);
		//	System.out.println("가위바위보 대결에서 비겼습니다");
		//} else if ( sum == -2 || sum == -1 | sum == 1) {			
		//	System.out.println("컴퓨터의 가위바위보 : "+rps+" , 나의 가위바위보 : "+num);
		//	System.out.println("가위바위보 대결에서 이겼습니다");
		//} else  {
		//	System.out.println("컴퓨터의 가위바위보 : "+rps+" , 나의 가위바위보 : "+num);
		//	System.out.println("가위바위보 대결에서 졌습니다");
		//} 
		
		
		// ## 가위,바위, 보를 문자로 출력하는 방법
		
		// String[] = rpsName("","가위","바위","보");	
		// System.out.println("컴퓨터의 가위바위보 : "+rpsName[rps]+" , 나의 가위바위보 : "+rpsName[num]);
		
		//-------------------------------------------------
		
		
	}

}
