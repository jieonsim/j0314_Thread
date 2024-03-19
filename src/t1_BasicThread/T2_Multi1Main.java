package t1_BasicThread;

public class T2_Multi1Main {
	public static void main(String[] args) {
		System.out.println("===============================================");
		System.out.println("main(1). 현재 클래스명 : T2_MultiRun");
		System.out.println("main(1). 현재 실행 중인 스레드 이름 : " + Thread.currentThread().getName());
		System.out.println("===============================================");
		System.out.println();
		
		T2_Multi1 t1 = new T2_Multi1();
		// t1.run();	스레드를 실행할 때는 run()메소드가 아닌 start() 메소드로 실행한다
		t1.start();
		
		System.out.println("===============================================");
		// 2초간 시간 지연
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main(2). 현재 클래스명 : T2_MultiRun");
		System.out.println("main(2). 현재 실행 중인 스레드 이름 : " + Thread.currentThread().getName());
		System.out.println("main(2). " + Thread.currentThread().getName() + " 스레드가 종료되었습니다.");
		System.out.println("===============================================");
	}
}
