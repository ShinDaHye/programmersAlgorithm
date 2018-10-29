package algo;

public class Lab1016 {
	public static void main(String[] args) {
		prog22();
	}
	private static void prog20() {
		//이상한 문자 만들기
		//여기서 요점은 맨 뒤 공백을 넣지 못했었음
		String s = "  try hello world strys  ";
		String splus = s+"s";
		String answer="";
		String[] parse = splus.split(" ");
		for(String new_s : parse) {
			System.out.println(new_s);
			String[] parse_new = new_s.split("");
			answer += parse_new[0].toUpperCase();
			for(int i=1; i<parse_new.length;i++) {
				if(i%2==0) {
					answer+=parse_new[i].toUpperCase();
				}else {
					answer+=parse_new[i].toLowerCase();
				}
			}
			answer+=" ";
		}
		answer =answer.substring(0, answer.length()-2);
		System.out.println(answer);
		System.out.println(answer.length());
	}

	private static void prog21() {
		//1,2,4나라의 숫자 (3진수 이용)
		int n = 21;
		String answer = "";
		String[] an = {"1","2","4"};
		answer+=divi(n);
		answer+=na(n);
		System.out.println(answer);
		
		
	}
	private static String divi(int n) {
		//몫에 관한 함수
		if(n%3==0) {
			n = n-1;
		}
		String[] an = {"1","2","4"};
		switch(n/3) {
		case(0):
			return "";
		case(1): 
			return an[0];
		case(2):
			return an[1];
		case(3):
			return an[2];
		default:
			return divi(n/3)+na(n/3);
		}
	}
	private static String na(int n) {
		//나머지에 관한 함수
		String[] an = {"1","2","4"};
		switch(n%3){
		case(1): 
			return an[0];
		case(2):
			return an[1];
		case(0):
			return an[2];
		default:
			return "";
		}
	}

	private static void prog22() {
		
	}


}
