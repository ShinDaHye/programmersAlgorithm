package algo;

import java.util.Arrays;

public class Lab1013 {
	public static void main(String[] args) {
		prog19();
	}
	private static void prog15() {
		//greatest_common divisor & least common multiple
		int n = 36;
		int m = 8;
		int[]answer = new int[2];
		int greatest_com = 1;
		int least_com = n*m;
		int min = Math.min(n, m);
		for(int i=1; i<=min;i++) {
			if(n%i==0 && m%i==0) {
				greatest_com *= i;
				n /= i;
				m /= i;
				i = 1;
			}
		}
		least_com /=greatest_com;
		answer[0] = greatest_com;
		answer[1] = least_com;
		System.out.println(answer[0]);
		System.out.println(answer[1]);
	}

	private static void prog16() {
		//짝수 홀수
		int num = 3;
		String answer = (num%2==0)? "Even":"Odd";
		System.out.println(answer);
	}
	
	private static void prog17() {
		//제일 작은 숫자 지우기
		int[] arr = {1};
		int[] new_arr = Arrays.copyOf(arr, arr.length);
		int[] unique = {-1};
		int[] answer;
		int length = arr.length;
		Arrays.sort(new_arr);
		int min = new_arr[0];
		if(arr.length==1 && arr[0]==10) {
			System.out.println(unique);
		}else {
			if(length==1) {
				answer = new int[arr.length];
			}else {
				answer = new int[arr.length-1];
			}
			for(int i=0;i<answer.length;i++) {
				if(arr[i]>min) {
					answer[i]=arr[i];
				}
			}
			for(int s : answer) {
				System.out.println(s);
			}
		}
		
	}

	private static void prog18() {
		long n = 118372;
		String nn = String.valueOf(n);
		String answer = "";
		int[] m = new int[nn.length()];
		for(int i=0;i<m.length;i++) {
			m[i] = Integer.parseInt(String.valueOf(nn.charAt(i)));
		}
		Arrays.sort(m);
		for(int i=m.length-1; i>=0;i--) {
			answer += m[i];
		}
		long answer1 = Integer.parseInt(answer);
		System.out.println(answer1);		
	}
	
	private static void prog19() {
		long n =102030020; 
		int sum[] = new int[12]; int k=0; int count =0;
		while(n>=1) {
			sum[k] = (int) n%10;
			n /=10;
			k++;
			count++;
		}
		int[] answer = new int[count];
	      for(int i=0;i<count;i++){
	          answer[i] = sum[i];
	          System.out.println(answer[i]);
	      }
	}
}
