package t1_BasicThread;

// 스레드를 만드는 방법2 : 인터페이스 구현 객체를 만든 후 스레드 생성 시 매개변수로 처리해준다.
public class T2_Multi2 implements Runnable { // runaable 인터페이스 상속받아 run() 메소드 오버라이드하고 구현

	@Override
	public void run() {
		System.out.println("----------------------------------------------");
		System.out.println("1. 현재 클래스명 : T2_Multi2");
		System.out.println("1. 현재 실행 중인 스레드 이름 : " + Thread.currentThread().getName());
		System.out.println("----------------------------------------------");

		// 시간 지연 방법1 : for문
		// for (int i = 0; i < 1000000000; i++) {}
		// 1000000000번동안 반복하여 지연

		// 시간 지연 방법2 : Thread.sleep(); < 이건 try, catch 필수
		for (int i = 1; i <= 5; i++) {
			System.out.println("i = " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("----------------------------------------------");
		System.out.println("2. 현재 클래스명 : T2_Multi2");
		System.out.println("2. 현재 실행 중인 스레드 이름 : " + Thread.currentThread().getName());
		System.out.println("2. " + Thread.currentThread().getName() + " 스레드가 종료됩니다.");
		System.out.println("----------------------------------------------");
	}
}
