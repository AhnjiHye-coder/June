package chat;

public class Main {
	public static void main(String[] args) {
		
		// 나는 지금 main클래스에서 Phone클래스의 정보를 사용할 것이다
		// Phone 클래스에 생성자가 이름을 넣었을때 바로 초기화 해주는 생성자가
		// 있기 때문에 바로 이름을 넣어줄 것이다
		Phone ho1 = new Phone("김도기");
		Phone ho2 = new Phone("천지훈");
		
		// Phone클래스에 나 자신의 자료형으로 이름을 매개변수로 전달하여
		// 나와 상대방이 구분되어 출력되는 메소드가 있기 떄문에 사용해준다
		// 사용방법은 만들어놓은 메소드형식처럼 위에 객체를 만든 필드를
		// 호출하여 누가 누구에게 어떤 말을 할 것인지를 기재하면 된다
		// 먼저 나온 필드는 메소드 형식에서 상대방을 의미한다
		// 그러므로 상대방을 먼저 호출하고 나를 호출한다
		ho2.Msg(ho1,"안녕하세요?");
		ho1.Msg(ho2,"네 실레지만 누구시죠?");
		
	}
}