package codeTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		// N마리의 소
		// i 번째 소들의 키가 hi
		// 모든 소들은 일렬로 서 있고, 오른쪽만 볼 수 있다
		// i 번째 소가 볼 수 있는 다른 소의 헤어 스타일은 i+1, i+2 ...
		// 자기보다 키가 같거나 큰 소가 있으면 그 다음에 있는 모든 소들의 헤어스타일은 보지 못한다
		// ex) N=6, H={10,3,7,4,12,2}
		
		// N마리의 소
		// N개의 배열
		// 배열에 소들의 키 저장
		
		// index 0 -> N헤어를 확인 -> for
		// datas[0] > datas[1] 헤어 확인 가능
		// datas[0] <= datas[1] 헤어 확인 불가능
		Scanner sc = new Scanner(System.in);
		System.out.println("소의 수 입력");
		int N = sc.nextInt();
		// 1 <= hi <= 1000000000
		List<Integer> H = new ArrayList<>();
		int height;
		System.out.println("소들의 키 입력");
		// 소의 키 입력
		for(int i=0; i<N; i++) {
			while(true) {
				height = sc.nextInt();
				if(height>=1 && height<=1000000000) {
					H.add(height);
					break;
				}
				else {
					System.out.println("1 <= hi <= 1000000000");
				}
			}
		}
		// 소의 키 비교 하여 총 수 계산
		int cnt = 0; // 총 수
		for(int c=0; c<H.size(); c++) {
			for(int p=c+1; p<H.size(); p++) {
				if(H.get(c) <= H.get(p)) {
					break;
				}
				cnt++;
			}
		
		}
		System.out.println("총 수 : "+cnt);
//		int j = i+1;
//		while(datas[i]>datas[j] && j>=N) {
//			cnt++;
//			j++;
//		}
		
	}
}
