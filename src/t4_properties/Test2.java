package t4_properties;

class MyThread extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(getName() + " 우선순위 : " + getPriority());
		System.out.println();
	}
}

// 스레드에 우선순위 지정 : getPriority(), setPriority()
public class Test2 {
	public static void main(String[] args) {
		// 스레드 기본 순위
		for (int i = 0; i < 3; i++) {
			System.out.println("메인 스레드 : " + i + "번째 입니다.");
			Thread thread = new MyThread();
			thread.start();
		}
		
		// 스레드 우선 순위 지정
		// 스레드 순위는 숫자가 클 수록 높다
		for (int i = 0; i < 10; i++) {
			Thread thread = new MyThread();
			thread.setName(i + "번째 스레드");
			if (i == 9) {
				thread.setPriority(10);
			}
			thread.start();
		}
	}
}
