package MainMethod;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		
		
		// 과제 2
		// 내가 제시한 숫자를 컴퓨터가 맞추게 하기
		// UP, DOWN 힌트를 줄 것
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int com = (int)Math.floor(Math.random()*50)+1;
		
		System.out.print("숫자를 입력하시오. (1 ~ 10) : ");
		int num = sc.nextInt();
			
			while(num == com ){
				System.out.println("정답입니다!");	
				break;
				
				if(num > com) {
					System.out.println(+num+"보다 "+com+"의 숫자가 작은가요?");
				}
			
			
		} 
		
	}
}
