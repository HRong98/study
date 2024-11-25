package codeTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		// N개의 높이가 서로 다른 탑
		// 하나의 탑에서 발사된 레이저 신호는 가장 먼저 만나는 단 하나의 탑에서만 수신 가능
		// ex) 6,9,5,7,4 즉 자기보다 큰 첫 번째와 만난다
		// 높이가 4인 다섯 번째 탑은 높이가 7인 4번째 탑이 수신
		// 높이가 7인 네번째 탑의 신호는 높이가 9인 두 번째 탑이
		// 높이가 5인 세번째 탑의 신호도 높이가 9인 두 번재 탑이 수신
		// 높이가 9인 두 번째 탑과 높이가 6인 첫 번째 탑이 보낸 레이저 신호는 어떤 탑에서도 수신을 하지 못한다.
		Scanner sc = new Scanner(System.in);
		System.out.print("탑의 수 입력 : ");
		int N = sc.nextInt();

		List<Integer> towers = new ArrayList<Integer>();
		//타워의 높이 입력
		for(int i=0; i<N; i++) {
			int height= sc.nextInt();
			towers.add(height);
		}
		
		// 타워 높이 비교(역순)
		// 자기보다 큰게 없으면 0
		int num = 0;
		int[] numList = new int[N];
		//index[0] 처음은 비교 불가
		numList[0] = 0;
		for(int k=N-1; k>=1; k--) {
			for(int p = k-1; p>=0; p--) {
				if(towers.get(k)>towers.get(p)) {
					// k번째가 제일 크다면
					// numList에 0 추가
					// k번째 보다 큰게 있다면 p+1(인덱스) 추가
					num = 0;
				}
				else {
					num = p+1;
					break;
				}
			}
			// 만약 k가 0이라면, num = 0
			numList[k] = num;
		}
		
		System.out.println(Arrays.toString(numList));
	}
}
