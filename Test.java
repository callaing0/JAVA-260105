package MainMethod;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		
		// 과제
		// 가위바위보 게임을 15번 진행할 것
		// 단, 한 판이 끝날때마다 몇승, 몇패, 몇무 했는지 출력
		
		Scanner sc = new Scanner(System.in);
		
		int winCount = 0;
		int loseCount = 0;
		int drawCount = 0;
		
		for(int i = 1; i <= 15; i++) {
			
		int rps = (int)Math.floor(Math.random()*3)+1;
		
		System.out.println("\n @@ 가위바위보 대결 @@");
		System.out.print("가위바위보를 입력하세요(가위는 1번, 바위는 2번, 보는 3번) : ");
		
		int num = sc.nextInt();		
		
		 if (num == rps) {
			 System.out.println("\n 컴퓨터의 가위바위보 : "+rps+" , 나의 가위바위보 : "+num);
			 System.out.println("가위바위보 대결에서 비겼습니다");
			 drawCount++;
		 	} else if ((num == 1 && rps == 3) || (num == 2 && rps == 1) || (num == 3 && rps == 2)) {			
		 		System.out.println("\n 컴퓨터의 가위바위보 : "+rps+" , 나의 가위바위보 : "+num);
		 		System.out.println("가위바위보 대결에서 이겼습니다");
		 		winCount++;
		 	} else  {
		 		System.out.println("\n 컴퓨터의 가위바위보 : "+rps+" , 나의 가위바위보 : "+num);
				System.out.println("가위바위보 대결에서 졌습니다");
				loseCount++;
		} 
		 System.out.println("\n 몇승 : "+winCount+", 몇패 : "+loseCount+", 몇무 : "+drawCount);
		 System.out.println("--------------------------------------------------------");
	  }
	}

}
