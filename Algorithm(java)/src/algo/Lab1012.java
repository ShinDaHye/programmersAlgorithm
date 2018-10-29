package algo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Lab1012 {
	public static void main(String[] args)
	{
		prog14();
	}

	private static void prog01() {
		//시저부호
		String s= "PaOrT";
		int n = 3;
		String answer="";
		int e_int=0;
		char[] new_s = new char[s.length()];
		for(int i=0; i<new_s.length;i++) {
			new_s[i] = s.charAt(i);
		}
		for(int i=0; i<new_s.length;i++)
		{	
			e_int = new_s[i];
			char e_char = (char)(e_int + n);
			if(e_int == 32) {
				answer += new_s[i];
			}
			else if(e_int>=65&&e_int<=90) { //소문자일때
				if(e_int+n >90) {
					e_char = (char) (e_int+n-26);
					answer += e_char;
				}else answer += e_char;
			}
			else if(e_int>=97&& e_int<=122) { //대문자일때
				if(e_int+n >122) {
					e_char = (char) (e_int+n-26);
					answer += e_char;
				}else answer += e_char;
			}
			else {
			}

		}
		System.out.println(answer);
		System.out.println(e_int);
	}
	
	private static void prog02() {
		//문자열을 숫자로
		String s="1234";
		int answer =0;
		int leng = s.length();
		char [] new_s = new char[s.length()];
		for(int i=0; i<new_s.length;i++) {
			new_s[i] = s.charAt(i);
			System.out.println(new_s[i]);
		}
		if(new_s[0]=='-') {
			for(int i=1; i<leng; i++) {
				int new1 = leng - i -1;
				answer += (int) Math.pow(10, new1)*((int)(new_s[i])-48);
			}
			answer *= -1;
		}else if(new_s[0]=='+') {
			for(int i=1; i<leng; i++) {
				int new1 = leng - i -1;
				answer += (int) Math.pow(10, new1)*((int)(new_s[i])-48);
			}
		}else {
			for(int i=0;i<leng;i++) {
				int new1 = leng - i -1;
				answer += (int) Math.pow(10, new1)*((int)(new_s[i])-48);
			}
		}
	}
	
	private static void prog03() {
		// 2016년
		LocalDate date = LocalDate.of(2016, 01, 01);
		String day = date.getDayOfWeek().toString();
		String new_day = day.substring(0,3);
		System.out.println(new_day); 
	}

	private static void prog04() {
		//체육복
		int answer = 0;int n = 5;
        int[]reserve1 = {1,4};
        int[]lost1 = {2,4,5};
		int[] nn = new int[n];
		for(int i=0;i<n;i++) {
			nn[i]=1;
		}
		for(int i=0;i<reserve1.length;i++) {
			nn[reserve1[i]-1]+=1;
		}
		for(int i=0;i<lost1.length;i++) {
			nn[lost1[i]-1]-=1;
		}
		for(int i=0;i<reserve1.length;i++) {
			if(reserve1[i]!=n) {
				if(nn[reserve1[i]]==0 && nn[reserve1[i]-1]==2) {
					nn[reserve1[i]-1] = 1;
					nn[reserve1[i]] = 1;
					reserve1[i] = 0;
				}
			}
		}
		for(int i=reserve1.length-1;i>=0;i--) {
			if(reserve1[i]!=1 && reserve1[i]!=0) {
				if(nn[reserve1[i]-2]==0 && nn[reserve1[i]-1]==2) {
					nn[reserve1[i]-1] = 1;
					nn[reserve1[i]-2] = 1;
				}
			}
		}
		for(int i=0;i<n;i++) {
			if(nn[i]>=1) {
				answer++;
			}
		}
		System.out.println(answer);
	}

	private static void prog05() {
		//k번째 수
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		int[] answer = new int[commands.length];
		for(int x=0;x<commands.length;x++) {
			int i = commands[x][0];
			int j = commands[x][1];
			int k = commands[x][2];
			int[] new_array = new int[j-i+1];
			for(int y=0;y<new_array.length;y++) {
				new_array[y] = array[i-1+y];
			}
			Arrays.sort(new_array);
			answer[x] = new_array[k-1];
			System.out.println(answer[x]);
		}
	}
	
	private static void prog06() {
		//수포자
		int[] answer = {};
		ArrayList <Integer> arr = new ArrayList<>();
		int[] st1 = {1,2,3,4,5};
		int[] st2 = {2,1,2,3,2,4,2,5};
		int[] st3 = {3,3,1,1,2,2,4,4,5,5}; 
		
		int[] count = new int[3];
		int[] answers = {1,2,3,4,5};
		for(int i=0;i<answers.length;i++) {
			if(answers[i]==st1[i%5]) {
				count[0]++;
			}
			if(answers[i]==st2[i%8]) {
				count[1]++;
			}
			if(answers[i]==st3[i%10]) {
				count[2]++;
			}
		}
		int max = count[0];
		int index = 0;
		for(int i=0;i<count.length;i++) {
			if(max<count[i]) {
				max = count[i];
				index = i;
			}
		}
		for(int i=0;i<count.length;i++) {
			if(count[index]==count[i]) {
				arr.add(i+1);
			}
		}
		answer = new int[arr.size()];
		for(int i=0;i<answer.length;i++) {
			answer[i]=arr.get(i);
		}
		System.out.println(Arrays.toString(answer));
//		int maxScore = Math.max(count[0], Math.max(count[1], count[2]));
//		if(maxScore == count[0]) {arr.add(1);}
//		if(maxScore == count[1]) {arr.add(2);}
//		if(maxScore == count[2]) {arr.add(3);}
//		arr.stream().mapToInt(i->i.intValue()).toArray();
	}

	private static void prog07() {
		int[] d = {2,3,2,3};
		int budget = 10;
		int answer=0;
		Arrays.sort(d);
		for(int i=0;i<d.length;i++) {
			if(budget>=d[i]) {
				budget-=d[i];
				answer++;
			}
		}
		System.out.println(answer);
	}
	
	private static void prog08() {
		//직사각형
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=1;i<=b;i++){
            for(int j=1;j<=a;j++){
                System.out.printf("*");
            }
            System.out.println("");
        }
	}

	private static void prog09() {
		int[][] arr1 = {{1,2},{2,3}};
		int[][] arr2 = {{3,4},{5,6}};
		int[][] answer = new int[arr1.length][arr1[0].length];
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				answer[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
	}

	private static void prog10() {
		//x씩 더해서 n개
		int x=2;
		int n=5;
		long sum = 0;
		long[] answer = new long[n];
		for(int i=0;i<n;i++){
			sum += x;
			answer[i]=sum;
		}
		for(int i=0;i<answer.length;i++) {
			System.out.println(answer[i]);  
		}
	    
	}

	private static void prog11() {
		//핸드폰 번호 가리기
		String phone_num = "027778888";
		String answer="";
		for(int i=0; i<phone_num.length();i++) {
			if(i+4>=phone_num.length()) {
				answer+=phone_num.charAt(i);
			}else
				answer+="*";
		}
		System.out.println(answer);
	}
	
	private static void prog12() {
		//하샤드 수
		boolean answer =true;
		
		int x = 12;
		String[] tmp = String.valueOf(x).split("");
		int sum = 0;
		
		for(String s : tmp) {
			sum += Integer.parseInt(s);
		}
		if(x%sum!=0) {
			answer = false;
		}
		System.out.println(answer);
	}
	
	private static void prog13() {
		//평균 구하기
		int[] arr = {1,2,3,4};
		double answer = 0;
		int sum = 0;
		for(int i : arr) {
			sum += i;
		}
		answer = (double) sum / arr.length;
		System.out.println(answer);
	}
	

	private static void prog14() {
		//콜라츠 추측
		int num = 626331;
		int answer = 0;
		if(num==1) {
			answer = 1;
		}
		while(num!=1 && answer <=500) {
			if(num%2==0) {
				num/=2;
			}else {
				num = num*3+1;
			}
			answer++;
		}
		if(answer>=500) {answer = -1;}
		System.out.println(answer);
	}

	private static void prog15() {
		
	}


}