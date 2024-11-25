package codeTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 2016년
		// 27,35,92,75,42,53,29,87

		// 2017년
		// 85, 42, 79, 95, 37, 11, 72, 32

		// N명 학생들의 점수가 주어졌을 때, 가장 높은 점수와 가장 낮은 점수의 차이를 구하는 프로그램
		System.out.println("학생 수 입력 N = ");
		int N = sc.nextInt(); // 학생 수
		int pivot; // 기준점
		int max;
		int min; //최대 최소

		// 첫 번째 줄에는 학생 수 N
		// 다음 줄에는 N명의 학생 점수가 공백 하나를 사이에 두고 주어진다.
		// ex) 27 35 92 75 42
		// 2<=N<=1000, 학생 점수 0이상 1000이하의 정수
		int score;
		// int[] scores = new int[N];
		List<Integer> scores = new ArrayList<Integer>();
		System.out.println("점수 입력");
		for(int i=0; i<N; i++) { //반복해서 입력
			while(true) {				
				score = sc.nextInt();
				if(score>=0 && score<=100) { // score 0~100
					scores.add(score);
					break;
				}
				else {
					System.out.println("점수는 0~100 사이로 입력");
				}
			}	
		}
		
		// Stream API 
		// int max = Arrays.stream(datas).max().getAsInt();
		// int min = Arrays.stream(datas).min().getAsInt();
		pivot = scores.get(0); // 기준점
		System.out.println("log : pivot = "+pivot);
		
		// 값을 비교하여 기준점 변경
		for(int s : scores) {
			if(pivot < s) {
				pivot = s;
			}
		}
		max = pivot;
		System.out.println("log : max = "+max);
		
		for(int s : scores) {
			if(pivot > s) {
				pivot = s;
			}
		}
		min = pivot;
		System.out.println("log : min = "+min);
		sc.nextLine();
		System.out.println("차이 : "+(max-min));
	}
}
