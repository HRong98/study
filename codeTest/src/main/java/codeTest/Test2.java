package codeTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Test2 {
	public static void main(String[] args) {
		//직전의 숫자는 무시한다
		// 잘못된 숫자를 읽은 것을 인식하면 ‘zero'
		// 모든 숫자들이 무시되면 그 합은 0이 된다. 
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 K 입력 : ");
		List<Integer> list = new ArrayList<Integer>();
		int k = sc.nextInt();
		int num;
		System.out.print("정수 입력 : ");
		//입력값을 리스트에 추가
		for(int i=0; i<k;i++) {
			num = sc.nextInt();
			if(num == 0) {
				// 입력이 0 이라면 마지막 숫자 삭제
				list.removeLast();
			}
			else {					
				list.add(num);
			}
		}

		int sum = 0;
		for(int i : list) {
			sum += i;
		}
		System.out.println("총 합 : "+ sum);
	}
}
//class TestV2{
//	//N크기 만큼의 스택 공간 형성
//	Scanner sc = new Scanner(System.in);
//	int N = sc.nextInt();
//	Stack<Integer> stack = new Stack<>();
//	
//	// * ctrl C,V -> 반복문
//	// * while vs for
//
//	for(int i = 0; i<N; i++) {
//		int data = sc.nextInt();
//		if(data != 0 ) {
//			stack.push(data);
//		}
//		else {
//			stack.pop();
//		}
//	}
//	// N개의 데이터를 입력받을 것
//	// 0이 아니면 그냥 스택에 저장
//	// 0이면 데이터 제거
//	
//	// 마지막에 스택에 남아있는 모든 데이터 총합
//	int total = 0;
//	for(int v : stack) {
//		total+=v;
//	}
//}
