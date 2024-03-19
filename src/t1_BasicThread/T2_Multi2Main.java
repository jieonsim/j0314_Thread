package t1_BasicThread;

//스레드를 만드는 방법2 : Runnable 인터페이스 구현 객체를 만든 후 스레드 생성 시 매개변수로 처리해준다.
public class T2_Multi2Main {
	public static void main(String[] args) {
		System.out.println("===============================================");
		System.out.println("main(1). 현재 클래스명 : T2_Multi2Main");
		System.out.println("main(1). 현재 실행 중인 스레드 이름 : " + Thread.currentThread().getName());
		System.out.println("===============================================");
		System.out.println();
		
		// 객체 생성하고 쓰레스 안에 객체 변수 넣어주고 쓰레드 변수.start 해줘야함
		T2_Multi2 t2 = new T2_Multi2();
		// Thread thread = new Thread(t2);			// 스레드 이름 지정하지 않으면 자동으로 지어짐
		Thread thread = new Thread(t2, "atom");		// 스레스 생성 시 내가 직접 스레드 이름 지정하는 법
		thread.start();
		
		System.out.println("===============================================");
		// 2초간 시간 지연
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main(2). 현재 클래스명 : T2_Multi2Main");
		System.out.println("main(2). 현재 실행 중인 스레드 이름 : " + Thread.currentThread().getName());
		System.out.println("main(2). " + Thread.currentThread().getName() + " 스레드가 종료되었습니다.");
		System.out.println("===============================================");
	}
}
