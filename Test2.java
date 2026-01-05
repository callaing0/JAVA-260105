package MainMethod;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

	        // 내가 제시한 숫자
	        System.out.print("정답 숫자를 입력하세요 (1 ~ 50): ");
	        int num = sc.nextInt();
	        
	        int min = 0;
	        int max = 0;

	        while (true) {
	            int com = (int)(Math.random() * 50) + 1;
	            
	            System.out.println("컴퓨터가 추측한 숫자는 " +com+ "입니다.");
	            System.out.print("힌트로 UP / DOWN / 정답을 입력하세요 : ");
	            String hint = sc.next();

	            if (hint.equals("UP")) {
	                min = com + 1;
	            } else if (hint.equals("DOWN")) {
	                max = com - 1;
	            } else if (hint.equals("정답")) {
	                System.out.println("정답입니다!");
	                break;
	            }
	        }
	    }
	}

