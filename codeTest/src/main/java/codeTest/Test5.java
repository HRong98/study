package codeTest;

import java.util.Stack;

public class Test5 {
	// 쇠막대기는 자신보다 긴 쇠막대기 위에만 놓을 수 있다
	// 쇠막대기를 다른 쇠막대기 위에 놓는 경우 완전히 포함되도록 놓되, 끝점 겹치지 x
	// 각 쇠막대기를 자르는 레이저는 적어도 하나 존재
	// 레이저는 어떤 쇠막대기의 양 끝점과도 겹치지 않는다.
	// () == 레이저
	// ( 왼쪽 끝은 여는 괄호, 오른쪽 끝 ) 
	// (|)((((|)(|))((|))(|)))((|))
	//  |     |  |    |   |     |
	//
	// 3 2
	// 5
	// 5 2
	public static int[] test(int N, int[] tower) {
		int[] result = new int[N];
		
		// 개발자 코딩테스트는
		// 주석, 로직 이해, 설명 2중 for문으로 풀어도 괜찮음
		Stack<int[]> stack = new Stack<int[]>();
		// {탑의 높이, 탑의 위치}를 저장 -> int[] 제네릭으로 설정
		
		for(int i=0; i<N;i++) { //시간복잡도 O(n) == 반복문을 반드시 1개 사용
			// 1. 현재 비교 대상이되는 탑보다 높은 탑이 스택에 있는지 확인
			while(!stack.isEmpty() && stack.peek()[0] < tower[i]) {
				stack.pop(); //임시 저장 공간에서 제거
				// 시간복잡도의 최대가 n이 되지 않음
			}
			//스택에 저장된 데이터가 있을 때,
			// 저장된 탑의 높이가 현재비교대상보다 작다면,
			// 신호를 수신할 수 없으니 스택에서 제거
			
			// 2. 신호를 받을 탑이 없으면 result == 0
			// 		탑이 있으면 위치 정보를 저장
			if(stack.isEmpty()) {
				result[i] = 0;
			}
			else {
				result[i] = stack.peek()[1]+1;
				// [index]와 N번째의 차이
			}
			// 3. 현재 비교대상이었던 탑은 다음 비교대상
			// -> 스택에 저장이 되어야 함
		}
		
		
		
		return result;
	}
	
	public static void main(String[] args) {
		int N = 5;
		int[] tower = {6,9,5,7,4};
		
		// 결과를 출력하는 함수가 있다고 가정
		int[] result = test(N, tower);
		
		for(int v: result) {
			System.out.println(v+" ");
		}
	}
	

}
