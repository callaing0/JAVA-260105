package MainMethod;

import java.util.Scanner;

public class LoopMain {
	public static void main(String[] args) {
		
		/*  
		  
		 반복문 : 특정코드를 정해진 횟수만큼 또는 횟수 제한 없이 동작시키는 과정 (for*, while, do ~ while)
		
		  for의 경우, 반복 횟수가 정해져 있는 경우 사용 (가독성이 좋음)
		  	for의 기본 형태 : for(초기값; 조건식; 증감식)
		  		
		  		EX 1)
		  		for(int i = 1; i <= 5; i++) = 1에서 시작; 5까지 반복; 1씩 증가
		  			
		  				i++ : 후위연산자, 현재 값을 사용 후 증가하는 방식 (사용값 5, 증가값 6) 
						++i : 전위연산자, 먼저 증가한 후 사용하는 방식 (증가값 6, 사용값 6)
		
	   					i++ : 1씩 증가
	 					i+2 : 2씩 증가
	 	
					EX 2)
					for(Member m : MemberList)
						Ex 1 버전보다 업그레이드 된 버전
						
						
			while, do ~ while : 반복 횟수가 제한 없을 경우 사용, 특히 do ~ while는 통신 관련으로 주로 사용
		  
		*/
	
		// ---------------------------------------------------------------------
		
		/* 예시 1
		   for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		 	}
		*/
		
		// ---------------------------------------------------------------------
		
		/* 예시 2
		for(int i = 1; i <= 100; i++) {
			if(i % 10 == 0) {
				System.out.println(i);
			}
		}
		*/
		
		// ---------------------------------------------------------------------
		
		/* 예시 3
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			System.out.println(i);
		}
		*/
		
		// ---------------------------------------------------------------------
		
		// @@ 문제 1번
		// 1부터 12까지 출력
		// 단, 4의 배수에는 four 라고 출력
		
		/*  
		for(int i = 1; i <= 12; i++) {
			if( i % 4 == 0 ) {
				System.out.println("four");
			} else {
				System.out.println( i );
			}
		}
		*/
		
		// ---------------------------------------------------------------------
		
		// @@ 문제 2번 
		// 17의 배수가 몇개인지 출력하시오.
		
		/*
		int count = 0;
		
		for(int i = 1; i <= 1000; i++) {
			if(i % 17 == 0) {
				count++;
			}		
		} System.out.println("17의 배수는 총 "+count+"개 입니다");
		*/
		
		// ---------------------------------------------------------------------
		
		// @@ 문제 3번
		// 동전 앞면, 뒷면 맞추기 게임
		// 게임은 총 10판 진행 및 맞춘 횟수 출력
		
		/*
		Scanner sc = new Scanner(System.in);

		int count = 0;
	
		for(int i = 1; i <= 10; i++) {
			
		int coin = (int)Math.floor(Math.random()*2)+1;
		
		System.out.println("\n @@ 동전 맞추기 대결 @@");
		System.out.print("동전 숫자를 입력하세요(앞면은 1번, 뒷면은 2번) : ");
		int num = sc.nextInt();
		
		
		if(num == coin) {
			System.out.println("동전의 숫자는 "+coin+", 맞추기 성공!");
			count++;
			} else {
				System.out.println("동전의 숫자는 "+coin+", 맞추기 실패!");
				}
		}
		System.out.println("\n 맞추기를 성공한 횟수는 총 "+count+"회 입니다.");
		*/
		
		// ---------------------------------------------------------------------
		
		
		
		/*
		 
		  무한루트 : 반복문의 조건식이 참일 경우 무한 반복 수행, 반복에 제한 휫수가 없어서 구현 시 특정 조건을 설정함
		  	
		  	1. for(;true;){
		  		}
		  		
		  	2. for(;;){
		  		;
		  		}
		  		
		  	3. 	while(조건식){
		  		= 실행문 작성 부분 =
		  		}
		  		
		
		*/
		
		// ---------------------------------------------------------------------
		
		/* 예시 1
		while(true) {
			System.out.println("무한루프");
		}
		*/
		
		// ---------------------------------------------------------------------
		
		/* 예시 2
		int i = 10;
		
		while(true) {
			System.out.println( i );
			i++;
			
			if( i == 40) {
				break;
			}
		}
		*/
		
		// ---------------------------------------------------------------------
		
		/* 예시 3
		while(true) {
			int num = (int)Math.floor(Math.random()*20)+1;
			System.out.println(num);
			
				if (num == 11 ) {
					break;
				}
		}
		*/	
		
		// ---------------------------------------------------------------------
		
		/* 예시 4 
		Scanner sc = new Scanner(System.in);
		
		int com = (int)Math.floor(Math.random()*50)+1;
		
		while(true){
			System.out.print("숫자를 입력하시오. (1 ~ 50) : ");
			int user = sc.nextInt();
			
				if(user > com) {
					System.out.println("DOWN");
				} else if (user < com) {
					System.out.println("UP");					
				} else {
					System.out.println("정답입니다!");	
					break;
				}
			
		}
		*/
	
		// ---------------------------------------------------------------------
		
		
		
		
		
	}
}
