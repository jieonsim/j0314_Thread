package t4_properties;

public class Test1 {
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println("현재 스레드 이름 : " + thread.getName());
		System.out.println("1. 현재 동작하는 스레드 수 : " + Thread.activeCount());

		for (int i = 0; i < 3; i++) {
			Thread th = new Thread();
			System.out.println(th.getName());
			th.start();
		}
		System.out.println("2. 현재 동작하는 스레드 수 : " + Thread.activeCount());
		
		for (int i = 0; i < 3; i++) {
			Thread th = new Thread();
			th.setName(i + "번째 스레드");
			System.out.println(th.getName());
			th.start();
		}
		System.out.println("3. 현재 동작하는 스레드 수 : " + Thread.activeCount());
	}
}
