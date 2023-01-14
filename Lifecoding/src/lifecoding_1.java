
public class lifecoding_1 {

	public static void main(String[] args) {
		//배열에 관련된 내용
		
	/*	String[] classGroup = {"현동근", "권준영","이한준"};   //첫번째 수업 -> 데이터타입에 [] 붙이면 모임이 된다.
		System.out.println(classGroup[0]);
		System.out.println(classGroup[1]);
		System.out.println(classGroup[2]); */
		
		String[] classGroup = new String[3];  //두번째 수업 -> 다른형식으로 선언가능. 
		classGroup[0] = "현동근";
		System.out.println(classGroup.length); // 배열이 담을 수 있는 갯수를 확인 	
		classGroup[1] = "권준영";
		System.out.println(classGroup.length);
		classGroup[2] = "이한준";
		System.out.println(classGroup.length);
	
	}
}
