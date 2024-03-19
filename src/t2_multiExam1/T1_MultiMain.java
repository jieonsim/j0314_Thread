package t2_multiExam1;

public class T1_MultiMain {
	public static void main(String[] args) {
		System.out.println("===============================================");
		System.out.println("main(1). 현재 클래스명 : T1_MultiMain");
		System.out.println("main(1). 현재 실행 중인 스레드 이름 : " + Thread.currentThread().getName());
		System.out.println("===============================================");
		System.out.println();
		
		T1_Mutlti ex = new T1_Mutlti();
		Thread th1 = new Thread(ex, "mbc");
		Thread th2 = new Thread(ex, "kbs");
		Thread th3 = new Thread(ex, "sbs");
		th1.start();
		th2.start();
		th3.start();
		
		System.out.println("===============================================");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main(2). 현재 클래스명 : T1_MultiMain");
		System.out.println("main(2). 현재 실행 중인 스레드 이름 : " + Thread.currentThread().getName());
		System.out.println("main(2). " + Thread.currentThread().getName() + " 스레드가 종료되었습니다.");
		System.out.println("===============================================");
	}
}
