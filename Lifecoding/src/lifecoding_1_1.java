
public class lifecoding_1_1 {
	public static void main(String[] args) {
		
	/*
	  1반 학생들을 번호순으로 정렬해서 줄을 세운다.
	상담받은 학생의 숫자를 기록한다.
	대기중인 학생과 상담을 한다.
	상담받은 학생의 수를 1 증가시킨다.
	총원보다 상담받은 학생의 수가 작다면 3번 절차로 돌아간다.
	총원과 상담받은 학생의 수가 같다면 상담을 종료하고 업무를 계속한다.	
	 */

		String[] check = new String[6];     //내가 생각한방
		for(int i=0; i< check.length;i++) {
			check[i]= "checked";
			System.out.println(check[i]);
		}
		
		
		/* String[] members = { "최진혁", "최유빈", "한이람" };  // 생활코딩의 방법 
        for (int i = 0; i < members.length; i++) {
            String member = members[i];
            System.out.println(member + "이 상담을 받았습니다"); */
		
		/* String[] members = { "최진혁", "최유빈", "한이람" };  // 생활코딩의 방법 
        for (String e : members) {						// e라는 변수에 members 값을 하나하나씩 입
            System.out.println(member + "이 상담을 받았습니다"); */
		
	}
}
