package MainMethod;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		
		// 과제 2
		// 사용자가 입력한 숫자를 컴퓨터가 맞추기
		// 사용자가 UP, DOWN 힌트를 줄 수 있게 해야함
		
		Scanner sc = new Scanner(System.in);

	        // 내가 제시한 숫자
	        System.out.print("정답 숫자를 입력하세요 (1 ~ 50): ");
	        int num = sc.nextInt();
	        
	        int upcom;
	        int downcom;

	        while (true) {
	            int com = (int)(Math.random() * 50) + 1;
	            
	            System.out.println("컴퓨터가 추측한 숫자는 " +com+ "입니다.");
	            System.out.print("힌트로 UP / DOWN / 정답을 입력하세요 : ");
	            String hint = sc.next();

	            if (hint.equals("UP")) {
	                upcom = com + 1;
	            } else if (hint.equals("DOWN")) {
	                downcom = com - 1;
	            } else if (hint.equals("정답")) {
	                System.out.println("사용자님이 입력하신 숫자는 "+num+" 입니다.");
	                break;
	            }
	        }
	    }
	}
