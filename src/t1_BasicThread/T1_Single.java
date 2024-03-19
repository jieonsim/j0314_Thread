package t1_BasicThread;

// 싱글 스레드 : 하나만 갖고 있는 거
public class T1_Single {
	public static void main(String[] args) {
		System.out.println("모든 실행 클래스는 main 스레드 1개를 가진다.");
		System.out.println("현재 스레드명 : " + Thread.currentThread().getName());
	}
}
